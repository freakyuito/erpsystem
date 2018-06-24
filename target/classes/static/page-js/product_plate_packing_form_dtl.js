$(function () {
    setWeighingData('1806001','1','15','18.5');
})

function addWaste() {
    $('#tbody-waste').append('<tr>\n' +
        '                                            <td style="text-align: center">\n' +
        '                                                <input class="form-control input-sm"/>\n' +
        '                                            </td>\n' +
        '                                            <td style="text-align: center">\n' +
        '                                                <input class="form-control input-sm"/>\n' +
        '                                            </td>\n' +
        '                                            <td style="text-align: center">\n' +
        '                                                <button class="btn btn-danger btn-sm" onclick="removeWaste($(this))">删除</button>\n' +
        '                                            </td>\n' +
        '                                        </tr>');
}

function removeWaste(self) {
    $(self).parent().parent().remove();
}
w
function addInventory() {
    $('#tbody-inventory').append('<tr>\n' +
        '                                            <td style="text-align: center">\n' +
        '                                                <input class="form-control input-sm"/>\n' +
        '                                            </td>\n' +
        '                                            <td style="text-align: center">\n' +
        '                                                <input class="form-control input-sm"/>\n' +
        '                                            </td>\n' +
        '                                            <td style="text-align: center">\n' +
        '                                                <button class="btn btn-danger btn-sm" onclick="removeWaste($(this))">删除</button>\n' +
        '                                            </td>\n' +
        '                                        </tr>');
}

function removeInventory(self) {
    $(self).parent().parent().remove();
}

function getWeighingData(batchNum) {
    $.post('/product/packing_form/get_weight_list',{batchNum:batchNum},function (res) {
        $.each(res,function (index,obj) {
            alert(obj.weight);
        })
    })
}

function setWeighingData(batchNum,index,quantity,weight) {
    $.post('/product/packing_form/set_weighing_data',{batchNum:batchNum,index:index,quantity:quantity,weight:weight},function () {
    })
}