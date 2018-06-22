$(function () {
    getAllCaptain();
})

function setStateCode(curState, batchNum) {
    var link = $('#product-num').text().replace(/#/, '%23');
    $.post('/product/product_order/set_state_code', {curState: curState, batchNum: batchNum}, function () {
        location.href = '/product/product_order/2dtl?productNum=' + link;
    })
}

function getAllCaptain() {
    var capatinSelector = $('#captain-name');
    capatinSelector.empty();
    $.post('/common/user/get_captain', {}, function (res) {
        $.each(res, function (index, obj) {
            capatinSelector.append('<option value="' + obj + '">' + obj + '</option>')
        })
    })
}