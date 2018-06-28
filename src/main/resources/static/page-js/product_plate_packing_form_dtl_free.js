$(function () {
    getWeighingList($('#packing-num').text());
    getWasteList($('#packing-num').text());
    getInventoryList($('#packing-num').text());
})

function addWeighing() {
    if ($('#tbody-weighing>tr:last-child input.quantity').val() != '' && $('#tbody-weighing>tr:last-child input.weight').val() != '') {
        $('#tbody-weighing').append('<tr>\n' +
            '                                            <td style="text-align: center" class="index">1</td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input type="number" class="form-control input-sm quantity"\n' +
            '                                                       onchange="setWeighingList();setWeighingListColor();totalWeighingAmount()"' +
            '                                            </td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <input type="number" class="form-control input-sm weight"\n' +
            '                                                       onchange="setWeighingList();setWeighingListColor();totalWeighingAmount()"' +
            '                                            </td>\n' +
            '                                            <td style="text-align: center">\n' +
            '                                                <button class="btn btn-danger btn-sm" onclick="removeWeighing($(this))">删除\n' +
            '                                                </button>\n' +
            '                                            </td>\n' +
            '                                        </tr>');
    } else {
        alert('无法连续创建2条空的记录');
    }

    $("#tbody-weighing .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
    setWeighingListColor();
    totalWeighingAmount();
}

function removeWeighing(self) {
    $(self).parent().parent().remove();
    $("#tbody-weighing .index").each(function (index) {
        $(this).empty();
        $(this).append(index + 1);
    })
    setWeighingList();
    setWeighingListColor();
    totalWeighingAmount();
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
            '                                                <input type="number" class="form-control input-sm weight"\n' +
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
            '                                                <input type="number" class="form-control input-sm weight"\n' +
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
                $('#tbody-weighing').append('<tr>\n' +
                    '                                            <td style="text-align: center" class="index">' + (index + 1) + '</td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input type="number" class="form-control input-sm quantity"\n' + 'value="' + obj.key + '"' +
                    '                                                       onchange="setWeighingList();setWeighingListColor();totalWeighingAmount()"/>' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input type="number" class="form-control input-sm weight"\n' + 'value="' + obj.value + '"' +
                    '                                                       onchange="setWeighingList();setWeighingListColor();totalWeighingAmount()"/>' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <button class="btn btn-danger btn-sm" onclick="removeWeighing($(this))">删除\n' +
                    '                                                </button>\n' +
                    '                                            </td>\n' +
                    '                                    </tr>');
            })
            $('#tbody-weighing').append('<tr id="tr-weighing-amount">' +
                '<td></td>' +
                '<td></td>' +
                '<td class="total-weighing-amount" style="text-align: center"></td>' +
                '</tr>');
            setWeighingListColor();
            totalWeighingAmount();
        }

    })
}

function setWeighingList() {
    var info = {};
    $('#tbody-weighing .index').each(function (index) {
        info['index_' + index] = $(this).text();
    })
    $('#tbody-weighing .quantity').each(function (index) {
        info['key_' + index] = $(this).val();
    })
    $('#tbody-weighing .weight').each(function (index) {
        info['value_' + index] = $(this).val();
    })
    info['packingNum'] = $('#packing-num').text();
    $.post('/product/packing_form/set_weighing_list', info, function () {
        getWasteList($('#packing-num').text());
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
                    '                                                <input type="number" class="form-control input-sm weight"\n' + 'value="' + obj.value + '"' +
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
            $('#tbody-inventory').empty();
            $.each(res, function (index, obj) {
                $('#tbody-inventory').append(' <tr>\n' +
                    '                                            <td style="text-align: center" class="index">' + (index + 1) + '</td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input class="form-control input-sm quantity"\n' + 'value="' + obj.key + '"' +
                    '                                                       onchange="setInventoryData($(\'#packing-num\').text(),$(this).parent().parent().find(\'.index\').eq(0).text(),$(this).val(),$(this).parent().parent().find(\'.weight\').eq(0).val());setInventoryListColor();totalInventoryAmount()"' +
                    '                                            </td>\n' +
                    '                                            <td style="text-align: center">\n' +
                    '                                                <input type="number" class="form-control input-sm weight"\n' + 'value="' + obj.value + '"' +
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
    $('#tbody-inventory .weight').each(function () {

        if ($(this).val() == 0 || $(this).val() == '') {
            $(this).parent().attr('class', 'bg-default');
        } else {
            $(this).parent().attr('class', 'bg-success');
        }
    })
}

function totalWeighingAmount() {
    var totalAmount = 0;

    $('#tbody-weighing .weight').each(function (index) {
        if ($(this).val() == '') {
            $(this).val(0);
        } else {
            $(this).val(parseFloat($(this).val()));
        }
        totalAmount += parseFloat($(this).val());
    })
    $('#tfoot-weighing').empty();
    $('#tfoot-weighing').append('<tr><td colspan="2" style="text-align: center">合计</td><td style="text-align: center">' + totalAmount + '</td><td></td></tr>');
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
    $('#tfoot-waste').empty();
    $('#tfoot-waste').append('<tr><td colspan="2" style="text-align: center">合计</td><td style="text-align: center">' + totalAmount + '</td><td></td></tr>');
}

function totalInventoryAmount() {
    var totalAmount = 0;

    $('#tbody-inventory .weight').each(function (index) {
        if ($(this).val() == '') {
            $(this).val(0);
        } else {
            $(this).val(parseFloat($(this).val()));
        }
        totalAmount += parseFloat($(this).val());
    })
    $('#tfoot-inventory').empty();
    $('#tfoot-inventory').append('<tr><td colspan="2" style="text-align: center">合计</td><td style="text-align: center">' + totalAmount + '</td><td></td></tr>');
}

