$(function () {
})

function setStateCode(curState,batchNum) {
    var link = $('#product-num').text().replace(/#/,'%23');
    $.post('/product/product_order/set_state_code',{curState:curState,batchNum:batchNum},function () {
        location.href='/product/product_order/2dtl?productNum=' + link;
    })
}