$(function () {
    var patternList, colorList;
    $.post('/universal/pattern/get_all', {}, function (res) {
        patternList = res;
    })
    $.post('/universal/color/get_all', {}, function (res) {
        colorList = res;
    })
    $.post('/universal/customer/get_all', {}, function (res) {
        var s = $(".customer");
        $.each(res, function (index, obj) {
            s.append('<option value="' + obj + '">' + obj + '</option>')
        })
    })
    $("#add-spec").on('click', function () {
        $("#spec-hint").empty();
        var $table = $('#table-body');
        var $lastRow = $("#table-body>tr:last-child");
        var patternVal, colorVal, lengthVal, widthVal, thicknessVal, amountVal;
        if ($table.children().length > 0) {
            // patternVal = $lastRow.find('select.pattern').last().children('option:selected').val();
            // colorVal = $lastRow.find('select.color;last').children('option:selected').val();
            lengthVal = $("#table-body>tr:last-child input.length").val();
            widthVal = $("#table-body>tr:last-child input.width").val();
            thicknessVal = $("#table-body>tr:last-child input.thickness").val();
            amountVal = $("#table-body>tr:last-child input.amount").val();
        }
        $("#table-body").append(
            '<tr class="information">' +
            '                            <td style="text-align: center" id="index">' + ($("#table-body").children().length + 1) + '</td>' +
            '                            <td style="text-align: center">' +
            '                                <div class="form-group-sm">' +
            '                                    <select class="form-control pattern">' +
            '                                    </select>' +
            '                                </div>' +
            '                            </td>' +
            '                            <td style="text-align: center">' +
            '                                <div class="form-group-sm">' +
            '                                    <select class="js-example-basic-single color">' +
            '                                    </select>' +
            '                                </div>' +
            '                            </td>' +
            '                            <td style="text-align: center" >' +
            '<div class="form-group-sm"> ' +
            '<input type="number" onblur="checkLength($(this).val(),$(this).next())" class="form-control input-sm length" style="text-align: center" value="' + lengthVal + '"/>' +
            '<small class="hint" style="color: red"></small>' +
            '                               </div>' +
            '                            </td>' +
            '                            <td style="text-align: center">' +
            '<div class="form-group-sm"> ' +
            '<input type="number" onblur="checkWidth($(this).val(),$(this).next())" class="form-control input-sm width" style="text-align: center" value="' + widthVal + '"/>' +
            '<small class="hint" style="color: red"></small>' +
            '                               </div>' +
            '                            </td>' +
            '                            <td style="text-align: center">' +
            '<div class="form-group-sm"> ' +
            '<input type="number" onblur="checkThickness($(this).val(),$(this).next())" class="form-control input-sm thickness" style="text-align: center" value="' + thicknessVal + '"/>' +
            '<small class="hint" style="color: red"></small>' +
            '                               </div>' +
            '                            </td>' +
            '                            <td style="text-align: center">' +
            '<div class="form-group-sm">' +
            '<input type="number" onblur="checkAmount($(this).val(),$(this).next())" class="form-control input-sm amount" style="text-align: center" value="' + amountVal + '"/>' +
            '<small class="hint" style="color: red"></small>' +
            '</div>' +
            '</td>' +
            // '                            <td style="text-align: center">' +
            // '<div class="form-group-sm"> ' +
            // '<input type="number" onblur="checkPrice($(this).val(),$(this).next())" class="form-control input-sm price" style="text-align: center"/>' +
            // '<small class="hint" style="color: red"></small>' +
            // '                               </div>' +
            // '                            </td>' +
            '                            <td style="text-align: center">' +
            '                                <button class="btn btn-danger btn-sm remove">删除</button>' +
            '                            </td>' +
            '                        </tr>'
        );

        var $patternSelect = $("#table-body:last-child").find("select.pattern");
        $.each(patternList, function (index, obj) {
            $patternSelect.append('<option value="' + obj.patternId + '">' + obj.patternName + obj.patternId + '</option>')
        })
        $("#table-body>tr:last-child select.pattern").children('option:selected').val(patternVal);

        var $colorSelect = $("#table-body:last-child").find("select.color");
        $.each(colorList, function (index, obj) {
            $colorSelect.append('<option value="' + obj.colorId + '">' + obj.colorId + obj.colorName + '</option>')
        })
        $colorSelect.trigger('change');
        $colorSelect.select2();
        $("#table-body>tr:last-child select.color").children('option:selected').val(colorVal);

        $("button.remove").on("click", function () {
            $(this).parent().parent().remove();
            $("td#index").each(function (index) {
                $(this).empty();
                $(this).append(index + 1);
            })
            if ($(".information").length == 0) {
                $('#spec-hint').empty();
                $("#spec-hint").append('至少添加一项条目');
            }
        })
    })
    $("#submit").on("click", function () {
        var stop = false;
        var purchaseNum = $("#purchase-num").val();
        var customerName = $("#customer-name").val();
        var purchaseTime = $("#dtp_input1").val();
        var deliverTime = $("#dtp_input2").val();
        var remark = $("#remark").val();
        var makerId = $("#maker-id").val();
        var contractId = $("#contract-id").val();
        var contractFiles = $('#contract-file').prop('files');//获取到文件列表

        var patternList = new Array();
        var colorList = new Array();
        var lengthList = new Array();
        var widthList = new Array();
        var thicknessList = new Array();
        var amountList = new Array();
        var priceList = new Array();

        if (purchaseNum == "") {
            checkPurchaseNum(purchaseNum, $("#purchase-num-hint"));
            stop = true;
        }
        if (contractId == "") {
            checkContractId(contractId, $("#contract-id-hint"));
            stop = true;
        }

        if ($(".information").length == 0) {
            $('#spec-hint').empty();
            $("#spec-hint").append('至少添加一项条目');
            stop = true;
        }

        $("select#pattern").each(function () {
            var v = $(this).children("option:selected").val();
            patternList.push(v);
        })
        $(".color").each(function () {
            var v = $(this).children("option:selected").val();
            colorList.push(v);
        })

        $(".length").each(function (index) {
            var v = $(this).val();
            if (v == "") {
                stop = true;
            } else {
                if (v > 999 || v < 1) {
                    stop = true;
                } else {
                    if (!/^[1-9]\d*$/.test(v)) {
                        stop = true;
                        alert('length error');
                    } else {
                        lengthList.push(v);
                    }
                }
            }
        })
        $(".width").each(function (index) {
            var v = $(this).val();
            if (v == "") {
                stop = true;
            } else {
                if (v > 999 || v < 1) {
                    stop = true;
                } else {
                    if (!/^[1-9]\d*$/.test(v)) {
                        stop = true;
                        alert('width error');
                    } else {
                        widthList.push(v);
                    }
                }
            }
        })
        $(".thickness").each(function (index) {
            var v = $(this).val();
            if (v == "") {
                stop = true;
            } else {
                if (v > 4 || v < 1) {
                    stop = true;
                } else {
                    if (!/^[0-9](.[0-9])?$/.test(v)) {
                        stop = true;
                        alert('thickness error');
                    } else {
                        thicknessList.push(v);
                    }
                }
            }
        })
        $(".amount").each(function (index) {
            var v = $(this).val();
            if (v == "") {
                stop = true;
            } else {
                if (v > 999999 || v < 1) {
                    stop = true;
                } else {
                    if (!/^\+?[1-9][0-9]*$/.test(v)) {
                        stop = true;
                        alert('amount error');
                    } else {
                        amountList.push(v);
                    }
                }
            }
        })
        // $(".price").each(function (index) {
        //     var v = $(this).val();
        //     if (v == "") {
        //         stop = true;
        //     } else {
        //         if (v > 30 || v < 1) {
        //             stop = true;
        //         } else {
        //             if (!/^[0-9]+(.[0-9])?$/.test(v)) {
        //                 stop = true;
        //                 alert('price error');
        //             } else {
        //                 priceList.push(v);
        //             }
        //         }
        //     }
        // })
        if (stop) {
            alert('内容有不合法项，请检查后提交');
            return false;
        }

        var info = {};
        info["purchaseNum"] = purchaseNum;
        info["customerName"] = customerName;
        info["purchaseTime"] = purchaseTime;
        info["deliverTime"] = deliverTime;
        info["remark"] = remark;
        info["makerId"] = 3;
        // info["contractId"] = contractId;

        for (var index in patternList) {
            info["pattern_" + index] = patternList[index];
        }
        for (var index in colorList) {
            info["color_" + index] = colorList[index];
        }
        for (var index in lengthList) {
            info["length_" + index] = lengthList[index];
        }
        for (var index in widthList) {
            info["width_" + index] = widthList[index];
        }
        for (var index in thicknessList) {
            info["thickness_" + index] = thicknessList[index];
        }
        for (var index in amountList) {
            info["amount_" + index] = amountList[index];
        }
        // for (var index in priceList) {
        //     info["price_" + index] = priceList[index];
        // }
        $.post('/market/purchase_order/insert_order', info, function (res1) {
            if (res1.status) {
                location.href = '/market/purchase_order/2lst';
                // if (contractFiles.length > 0) {
                //     var reader = new FileReader();//新建一个FileReader
                //     reader.readAsText(contractFiles[0], "UTF-8");//读取文件
                //     reader.onload = function (evt) { //读取完文件之后会回来这里
                //         var fileString = evt.target.result;
                //         info["contractFile"] = fileString;
                //     }
                // }
                // $.post('/universal/contract/insert_contract', info, function (res2) {
                //     if (res2.status) {
                //         location.href = '/market/purchase_order/2lst';
                //     }
                // })
            } else {
                alert(res1.content);
            }
        })
    });
})

function checkLength(val, hint) {
    hint.empty();
    if (val == "") {
        hint.append('数据不能为空');
    } else {
        if (val > 999 || val < 1) {
            hint.append('数值应介于1-999之间');
        } else {
            if (!/^[1-9]\d*$/.test(val)) {
                hint.append('数值应为整数');
            }
        }
    }
}

function checkWidth(val, hint) {
    hint.empty();
    if (val == "") {
        hint.append('数据不能为空');
    } else {
        if (val > 999 || val < 1) {
            hint.append('数值应介于1-999之间');
        } else {
            if (!/^[1-9]\d*$/.test(val)) {
                hint.append('数值应为整数');
            }
        }
    }
}

function checkThickness(val, hint) {
    hint.empty();
    if (val == "") {
        hint.append('数据不能为空');
    } else {
        if (val > 4 || val < 1) {
            hint.append('数值应介于1-4之间');
        } else {
            if (!/^[0-9](.[0-9])?$/.test(val)) {
                hint.append('数值应为一位小数');
            }
        }
    }
}

function checkAmount(val, hint) {
    hint.empty();
    if (val == "") {
        hint.append('数据不能为空');
    } else {
        if (val > 999999 || val < 1) {
            hint.append('数值应介于1-1M之间');
        } else {
            if (!/^\+?[1-9][0-9]*$/.test(val)) {
                hint.append('数值应为整数');
            }
        }
    }
}

function checkPrice(val, hint) {
    hint.empty();
    if (val == "") {
        hint.append('数据不能为空');
    } else {
        if (val > 30 || val < 1) {
            hint.append('数值应介于1-30之间');
        } else {
            if (!/^[0-9]+(.[0-9])?$/.test(val)) {
                hint.append('数值应为一位小数');
            }
        }
    }
}

function checkPurchaseNum(val, hint) {
    hint.empty();
    if (val == "") {
        hint.append('订单号不能为空');
    }
}

function checkContractId(val, hint) {
    hint.empty();
    if (val == '') {
        hint.append('合同号不能为空');
    }
}