$(function () {
    // generateWeighingList($('#batch-num').text(),20);
    getWeighingList($('#packing-num').text());
})


function addWaste() {
    $('#tbody-waste').append('<tr>\n' +
        '<td style="text-align: center" class="index"></td>' +
    '                                            <td style="text-align: center">\n' +
    '                                                <input class="form-control input-sm waste-name"/>\n' +
    '                                            </td>\n' +
    '                                            <td style="text-align: center">\n' +
    '                                                <input class="form-control input-sm waste-weight"/>\n' +
    '                                            </td>\n' +
    '                                            <td style="text-align: center">\n' +
    '                                                <button class="btn btn-danger btn-sm" onclick="removeWaste($(this))">删除</button>\n' +
    '                                            </td>\n' +
    '                                        </tr>'
)
    ;
    $("#tbody-waste .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
}

function removeWaste(self) {
    $(self).parent().parent().remove();
    $("#tbody-waste .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
}

w

function addInventory() {
    $('#tbody-inventory').append('<tr>\n' +
        '<td style="text-align: center" class="index"></td>' +
        '                                            <td style="text-align: center">\n' +
        '                                                <input class="form-control input-sm quantity"/>\n' +
        '                                            </td>\n' +
        '                                            <td style="text-align: center">\n' +
        '                                                <input class="form-control input-sm weight"/>\n' +
        '                                            </td>\n' +
        '                                            <td style="text-align: center">\n' +
        '                                                <button class="btn btn-danger btn-sm" onclick="removeInventory($(this))">删除</button>\n' +
        '                                            </td>\n' +
        '                                        </tr>');
    $("#tbody-inventory .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
}

function removeInventory(self) {
    $(self).parent().parent().remove();
    $("#tbody-inventory .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
}

function getWeighingList(packingNum) {
    $.post('/product/packing_form/get_weighing_list', {packingNum: packingNum}, function (res) {
        if (res != null) {
            $('#tbody-weighing').empty();
            $.each(res, function (index, obj) {
                $('#tbody-weighing').append('<tr>\n' +
                    '                                        <td class="index" style="width: 50px;text-align:center">' + (index + 1) + '</td>\n' +
                    '                                        <td class="quantity" style="width: 110px;text-align: center">' + obj.key + '</td>\n' +
                    '                                        <td class="weight" style="width: 110px;text-align: center">\n' +
                    '                                            <input value="' + obj.value + '" class="form-control input-sm"\n' +
                    '                                                   onblur="setWeighingData($(\'#packing-num\').text(),\n' +
                    '                                                   $(this).parent().prev().prev().text(),\n' +
                    '                                                   $(this).parent().prev().text(),\n' +
                    '                                                   $(this).val())"/>\n' +
                    '                                        </td>\n' +
                    '                                    </tr>');
            })
        }

    })
}

function setWeighingData(packingNum, index, quantity, weight) {
    // console.log(packingNum + index + quantity + weight);
    $.post('/product/packing_form/set_weighing_data', {
        packingNum: packingNum,
        index: index,
        quantity: quantity,
        weight: weight
    }, function () {
    })
}

function generateWeighingList(batchNum, bundleNum) {
    console.log(bundleNum);
    // $.post('/product/packing_form/generate_weighing_list', {batchNum: batchNum, bundleNum: bundleNum}, function () {
    //     location = '/product/packing_form/2dtl?batchNum=' + batchNum;
    // })
}

