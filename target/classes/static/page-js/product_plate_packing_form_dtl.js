$(function () {
    getUserList('BCP',$('#select_monitor'));
    getUserList('BP',$('#select_commander'));
    getUserList('BCJ',$('#select_inspector'));
    getUserList('BCP',$('#select_recorder'));
    getWeighingList($('#packing-num').text());
    getWasteList($('#packing-num').text());
    getInventoryList($('#packing-num').text());
})

function generateWeighingList(batchNum, bundleNum) {
    $.post('/product/packing_form/generate_weighing_list', {batchNum: batchNum, bundleNum: bundleNum}, function () {
        location = '/product/packing_form/2dtl?batchNum=' + batchNum;
    })
}

function addWaste() {
    if ($('#tbody-waste>tr:last-child input.quantity').val() != '' && $('#tbody-waste>tr:last-child input.weight').val() != '') {
        $('#tbody-waste').append('<tr>\n' +
            '                                            <td style="text-align: center" class="index">1</td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input class="form-control input-sm quantity"\n' +
            '                                                       onchange="setWasteData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());setWasteListColor();totalWasteAmount()"' +
            '                                            </td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input class="form-control input-sm weight"\n' +
            '                                                       onchange="setWasteData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).parent().parent().find(\'.quantity\').eq(0).val(),$(this).val());setWasteListColor();totalWasteAmount()"' +
            '                                            </td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <button class="btn btn-danger btn-sm" onclick="removeWaste($(this))">删除\n' +
            '                                                </button>\n' +
            '                                            </td>\n' +
            '                                        </tr>');
    } else {
        alert('无法连续创建2条空的废品记录');
    }

    $("#tbody-waste .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
    setWasteListColor();
    totalWasteAmount();
}

function removeWaste(self) {
    $(self).parent().parent().remove();
    $("#tbody-waste .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
    setWasteList();
    setWasteListColor();
    totalWasteAmount();
}

function addInventory() {
    if ($('#tbody-inventory>tr:last-child input.quantity').val() != '' && $('#tbody-inventory>tr:last-child input.weight').val() != '') {
        $('#tbody-inventory').append('<tr>\n' +
            '                                            <td style="text-align: center" class="index">1</td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input class="form-control input-sm quantity"\n' +
            '                                                       onblur="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());setInventoryListColor();totalInventoryAmount()"' +
            '                                            </td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input class="form-control input-sm weight"\n' +
            '                                                       onblur="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).parent().parent().find(\'.quantity\').eq(0).val(),$(this).val());setInventoryListColor();totalInventoryAmount()"' +
            '                                            </td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <button class="btn btn-danger btn-sm" onclick="removeInventory($(this))">删除\n' +
            '                                                </button>\n' +
            '                                            </td>\n' +
            '                                        </tr>');
    } else {
        alert('无法连续创建2条空的库存记录');
    }
    $("#tbody-inventory .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
    setInventoryListColor();
    totalInventoryAmount();
}

function removeInventory(self) {
    $(self).parent().parent().remove();
    $("#tbody-inventory .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
    setInventoryList();
    setInventoryListColor();
    totalInventoryAmount();
}

function setWeighingData(packingNum, index, quantity, weight) {
    $.post('/product/packing_form/set_weighing_data', {
        packingNum: packingNum,
        index: index,
        quantity: quantity,
        weight: weight
    }, function () {
    })
}

function setWasteData(packingNum, index, quantity, weight) {
    // console.log(packingNum + index + quantity + weight);
    $.post('/product/packing_form/set_waste_data', {
        packingNum: packingNum,
        index: index,
        quantity: quantity,
        weight: weight
    }, function () {
    })
}

function setInventoryData(packingNum, index, quantity, weight) {
    // console.log(packingNum + index + quantity + weight);
    $.post('/product/packing_form/set_inventory_data', {
        packingNum: packingNum,
        index: index,
        quantity: quantity,
        weight: weight
    }, function () {
    })
}

function getWeighingList(packingNum) {
    $.post('/product/packing_form/get_weighing_list', {packingNum: packingNum}, function (res) {
        if (res != null) {
            $('#tbody-weighing').empty();
            $.each(res, function (index, obj) {
                $('#tbody-weighing').append('<tr>' +
                    '                                        <td class="index" style="width: 50px;text-align:center">' + obj.index + '</td>' +
                    '                                        <td class="quantity" style="width: 110px;text-align: center">' + obj.key + '</td>' +
                    '                                        <td class="" style="width: 110px;text-align: center">' +
                    '                                            <input value="' + obj.value + '" class="form-control input-sm weight"' +
                    '                                                   onchange="if(checkInputable($(this))){' +
                    '                                        setWeighingData($(\'#packing-num\').text(),$(this).parent().prev().prev().text()' +
                    '                                        ,$(this).parent().prev().text(),$(this).val());setWeighingListColor();totalWeighingAmount();}' +
                    '                                        else {' +
                    '                                        alert(\'无法跨行输入有效数值\');$(this).val(0);' +
                    '                                        }' +
                    '                                    "/>' +
                    '                                        </td>');
            })
            setWeighingListColor();
            totalWeighingAmount();
        }
    })
}

function getWasteList(packingNum) {
    $.post('/product/packing_form/get_waste_list', {packingNum: packingNum}, function (res) {
        if (res != null) {
            $('#tbody-waste').empty();
            $.each(res, function (index, obj) {
                $('#tbody-waste').append(' <tr>\n' +
                    '                                            <td style="text-align: center" class="index">' + (index + 1) + '</td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input class="form-control input-sm quantity"\n' + 'value="' + obj.key + '"' +
                    '                                                       onchange="setWasteData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());setWasteListColor();totalWasteAmount()"/>' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input class="form-control input-sm weight"\n' + 'value="' + obj.value + '"' +
                    '                                                       onchange="setWasteData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).parent().parent().find(\'.quantity\').eq(0).val(),$(this).val());setWasteListColor();totalWasteAmount()"/>' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <button class="btn btn-danger btn-sm" onclick="removeWaste($(this))">删除\n' +
                    '                                                </button>\n' +
                    '                                            </td>\n' +
                    '                                        </tr>');
            })
            setWasteListColor();
            totalWasteAmount();
        }

    })
}

function setWasteList() {
    var info = {};
    $('#tbody-waste .index').each(function (index) {
        info['index_' + index] = $(this).text();
    })
    $('#tbody-waste .quantity').each(function (index) {
        info['key_' + index] = $(this).val();
    })
    $('#tbody-waste .weight').each(function (index) {
        info['value_' + index] = $(this).val();
    })
    info['packingNum'] = $('#packing-num').text();
    $.post('/product/packing_form/set_waste_list', info, function () {
        getWasteList($('#packing-num').text());
    })
}

function getInventoryList(packingNum) {
    $.post('/product/packing_form/get_inventory_list', {packingNum: packingNum}, function (res) {
        if (res != null) {
            $('#tbody-godown_entry').empty();
            $.each(res, function (index, obj) {
                $('#tbody-godown_entry').append(' <tr>\n' +
                    '                                            <td style="text-align: center" class="index">' + (index + 1) + '</td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input class="form-control input-sm quantity"\n' + 'value="' + obj.key + '"' +
                    '                                                       onchange="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());setInventoryListColor();totalInventoryAmount()"' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input class="form-control input-sm weight"\n' + 'value="' + obj.value + '"' +
                    '                                                       onchange="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).parent().parent().find(\'.quantity\').eq(0).val(),$(this).val());setInventoryListColor();totalInventoryAmount()"' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <button class="btn btn-danger btn-sm" onclick="removeWaste($(this))">删除\n' +
                    '                                                </button>\n' +
                    '                                            </td>\n' +
                    '                                        </tr>');
            })
            setInventoryListColor();
            totalInventoryAmount();
        }

    })
}

function setInventoryList() {
    var info = {};
    $('#tbody-godown_entry .index').each(function (index) {
        info['index_' + index] = $(this).text();
    })
    $('#tbody-godown_entry .quantity').each(function (index) {
        info['key_' + index] = $(this).val();
    })
    $('#tbody-godown_entry .weight').each(function (index) {
        info['value_' + index] = $(this).val();
    })
    info['packingNum'] = $('#packing-num').text();
    $.post('/product/packing_form/set_inventory_list', info, function () {
        getInventoryList($('#packing-num').text());
    })
}

function setWeighingListColor() {
    $('#tbody-weighing .weight').each(function () {

        if ($(this).val() == 0 || $(this).val() == '') {
            $(this).parent().attr('class', 'bg-default');
        } else {
            $(this).parent().attr('class', 'bg-success');
        }
    })
}

function setWasteListColor() {
    $('#tbody-waste .weight').each(function () {

        if ($(this).val() == 0 || $(this).val() == '') {
            $(this).parent().attr('class', 'bg-default');
        } else {
            $(this).parent().attr('class', 'bg-success');
        }
    })
}

function setInventoryListColor() {
    $('#tbody-godown_entry .weight').each(function () {

        if ($(this).val() == 0 || $(this).val() == '') {
            $(this).parent().attr('class', 'bg-default');
        } else {
            $(this).parent().attr('class', 'bg-success');
        }
    })
}

function totalWeighingAmount() {
    var totalQty = 0;
    var totalWgt = 0;

    $('#tbody-weighing .weight').each(function (index) {
        if ($(this).val() == '') {
            $(this).val(0);
        } else {
            $(this).val(parseFloat($(this).val()));
        }
        if ($(this).val() != 0)
            totalQty += parseInt($(this).parent().prev().text());
        totalWgt += parseFloat($(this).val());
    })
    $('#total-weighing-qty').text(totalQty);
    $('#total-weighing-amount').text(totalWgt);
}

function totalWasteAmount() {
    var totalAmount = 0;

    $('#tbody-waste .weight').each(function (index) {
        if ($(this).val() == '') {
            $(this).val(0);
        } else {
            $(this).val(parseFloat($(this).val()));
        }
        totalAmount += parseFloat($(this).val());
    })
    $('#total-waste-amount').text(totalAmount);
}

function totalInventoryAmount() {
    var totalQty = 0;
    var totalAmount = 0;

    $('#tbody-inventory .weight').each(function (index) {
        if ($(this).val() == '') {
            $(this).val(0);
        } else {
            $(this).val(parseFloat($(this).val()));
        }
        if ($(this).val() != 0)
            totalQty += parseInt($(this).parent().prev().find('.quantity').eq(0).val());
        totalAmount += parseFloat($(this).val());
    })
    $('#total-inventory-qty').text(totalQty);
    $('#total-inventory-amount').text(totalAmount);
}

function shift() {
    $('#shift-confirm').remove();
    var list = new Array();
    var monitorName = $('#select_monitor').children('option:selected').val();
    var commanderName = $('#select_commander').children('option:selected').val();
    var recorderName = $('#select_recorder').children('option:selected').val();
    var inspectorName = $('#select_inspector').children('option:selected').val();
    var workgroupId = $('#select_workgroup').children('option:selected').val();
    var batchNum = $('#batch-num').text();
    var finishedQty = $('#total-weighing-qty').text();
    var finishedWgt = $('#total-weighing-amount').text();
    var inventoryQty = $('#total-inventory-qty').text();
    var inventoryWgt = $('#total-inventory-amount').text();
    var wasteWgt = $('#total-waste-amount').text();
    $('#tbody-weighing input.weight').each(function (index) {
        if ($(this).val() != 0)
            list.push(index + 1);
    })
    $.post('/product/packing_form/shift', {
        shiftRecord: list[0] + "-" + list[list.length - 1],
        packingNum: $('#packing-num').text()
    }, function () {
        location.reload();
    })
    $.post('/product/plate/godown_entry/shift', {
        monitorName: monitorName,
        commanderName: commanderName,
        recorderName: recorderName,
        inspectorName: inspectorName,
        workgroupId: workgroupId,
        batchNum: batchNum,
        finishedQty: finishedQty,
        finishedWgt: finishedWgt,
        inventoryQty: inventoryQty,
        inventoryWgt: inventoryWgt,
        wasteWgt: wasteWgt
    }, function (res) {
    })
}

function checkInputable(self) {
    if ($(self).parent().parent().prev().find('.weight').eq(0).val() == '0') {
        return false;
    } else {
        return true;
    }
}

function getUserList(auth,select) {
    $.post('/common/user/get_by_auth', {auth: auth}, function (res) {
        select.empty();
        $.each(res, function (index, obj) {
            select.append('<option value="' + obj + '">' + obj + '</option>');
        })
    })
}

