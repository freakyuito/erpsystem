$(function () {
    $.post('/product/packing_form/get_packing_num', {}, function (res) {
        $('#packing-num').empty();
        $('#packing-num').append(res);
    })
})

function submit() {
    $.post('/product/packing_form/insert_packing_form', {}, function () {
        location.href = "/product/packing_form/2dtl_free?packingNum=" + $('#packing-num').text();
    })
}