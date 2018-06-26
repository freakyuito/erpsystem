$(function () {
    // generateWeighingList($('#batch-num').text(),20);
    getWeighingList($('#packing-num').text());
    getWasteList($('#packing-num').text());
    getInventoryList($('#packing-num').text());
})


function addWaste() {
    if ($('#tbody-waste>tr:last-child input.quantity').val() != '' && $('#tbody-waste>tr:last-child input.weight').val() != '') {
        $('#tbody-waste').append('<tr>\n' +
            '                                            <td style="text-align: center" class="index">1</td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input class="form-control input-sm quantity"\n' +
            '                                                       onblur="setWasteData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());' +
            '$(this).parent().attr(\'class\',\'bg-success\')"/>\n' +
            '                                            </td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input class="form-control input-sm weight"\n' +
            '                                                       onblur="setWasteData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).parent().parent().find(\'.quantity\').eq(0).val(),$(this).val());' +
            '$(this).parent().attr(\'class\',\'bg-success\')"/>\n' +
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
}

function removeWaste(self) {
    $(self).parent().parent().remove();
    $("#tbody-waste .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
    setWasteList();
}

w

function addInventory() {
    if ($('#tbody-inventory>tr:last-child input.quantity').val() != '' && $('#tbody-inventory>tr:last-child input.weight').val() != '') {
        $('#tbody-inventory').append('<tr>\n' +
            '                                            <td style="text-align: center" class="index">1</td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input class="form-control input-sm quantity"\n' +
            '                                                       onblur="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());' +
            '$(this).parent().attr(\'class\',\'bg-success\')"/>\n' +
            '                                            </td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input class="form-control input-sm weight"\n' +
            '                                                       onblur="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).parent().parent().find(\'.quantity\').eq(0).val(),$(this).val());' +
            '$(this).parent().attr(\'class\',\'bg-success\')"/>\n' +
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
}

function removeInventory(self) {
    $(self).parent().parent().remove();
    $("#tbody-inventory .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
    setInventoryList();
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
                    '                                                   $(this).val());$(this).parent().attr(\'class\',\'weight bg-success\')"/>\n' +
                    '                                        </td>\n' +
                    '                                    </tr>');
            })
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
                    '                                                       onblur="setWasteData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());' +
                    '$(this).parent().attr(\'class\',\'bg-success\')"/>\n' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input class="form-control input-sm weight"\n' + 'value="' + obj.value + '"' +
                    '                                                       onblur="setWasteData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).parent().parent().find(\'.quantity\').eq(0).val(),$(this).val());' +
                    '                                                  $(this).parent().attr(\'class\',\'bg-success\')"/>\n' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <button class="btn btn-danger btn-sm" onclick="removeWaste($(this))">删除\n' +
                    '                                                </button>\n' +
                    '                                            </td>\n' +
                    '                                        </tr>');
            })
        }

    })
}

function getInventoryList(packingNum) {
    $.post('/product/packing_form/get_inventory_list', {packingNum: packingNum}, function (res) {
        if (res != null) {
            $('#tbody-inventory').empty();
            $.each(res, function (index, obj) {
                $('#tbody-inventory').append(' <tr>\n' +
                    '                                            <td style="text-align: center" class="index">' + (index + 1) + '</td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input class="form-control input-sm quantity"\n' + 'value="' + obj.key + '"' +
                    '                                                       onblur="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());' +
                    '$(this).parent().attr(\'class\',\'bg-success\')"/>\n' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input class="form-control input-sm weight"\n' + 'value="' + obj.value + '"' +
                    '                                                       onblur="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).parent().parent().find(\'.quantity\').eq(0).val(),$(this).val());' +
                    '$(this).parent().attr(\'class\',\'bg-success\')"/>\n' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <button class="btn btn-danger btn-sm" onclick="removeWaste($(this))">删除\n' +
                    '                                                </button>\n' +
                    '                                            </td>\n' +
                    '                                        </tr>');
            })
        }

    })
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


function generateWeighingList(batchNum, bundleNum) {
    $.post('/product/packing_form/generate_weighing_list', {batchNum: batchNum, bundleNum: bundleNum}, function () {
        location = '/product/packing_form/2dtl?batchNum=' + batchNum;
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
        // getWasteList($('#packing-num').text());
    })
}

function setInventoryList() {
    var info = {};
    $('#tbody-inventory .index').each(function (index) {
        info['index_' + index] = $(this).text();
    })
    $('#tbody-inventory .quantity').each(function (index) {
        info['key_' + index] = $(this).val();
    })
    $('#tbody-inventory .weight').each(function (index) {
        info['value_' + index] = $(this).val();
    })
    info['packingNum'] = $('#packing-num').text();
    $.post('/product/packing_form/set_inventory_list', info, function () {
        // getInventoryList($('#packing-num').text());
    })
}

