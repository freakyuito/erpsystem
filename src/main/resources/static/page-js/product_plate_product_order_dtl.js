$(function () {
    getAllCaptain();
})

function setStateCode(curState, batchNum) {
    $.post('/product/product_order/set_state_code', {curState: curState, batchNum: batchNum}, function () {
        var link = $('#product-num').text().replace(/#/, '%23');
        location.href = '/product/product_order/2dtl?productNum=' + link;
    })
}

function getAllCaptain() {
    var capatinSelector = $('#receiver-name');
    capatinSelector.empty();
    $.post('/common/user/get_captain', {}, function (res) {
        $.each(res, function (index, obj) {
            capatinSelector.append('<option value="' + obj + '">' + obj + '</option>')
        })
    })
}

function sign() {
    var approverName = $('#user-name').val();
    var receiverName = $("#receiver-name").children('option:selected').val();
    var machineNum = $("#machine-num").children('option:selected').val();
    var productNum = $('#product-num').text();
    $.post('/product/product_order/sign', {
        approverName: approverName,
        receiverName: receiverName,
        machineNum: machineNum,
        productNum: productNum
    }, function () {
        var link = $('#product-num').text().replace(/#/, '%23');
        location.href = '/product/product_order/2dtl?productNum=' + link;
    })
}

function insertPackingForm(batchNum) {
    $.post('/product/packing_form/insert_packing_form_with_batch_num',{batchNum:batchNum},function () {

    })
}