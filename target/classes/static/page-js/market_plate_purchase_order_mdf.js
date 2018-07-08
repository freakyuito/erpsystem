$(function () {
    $(".length").editable();
    $(".width").editable();
    $(".thickness").editable();
    $(".amount").editable();
    summation();
})

function summation() {
    var totalAmount = 0;
    $("td .amount").each(function () {
        totalAmount += Number($(this).text());
    })
    $("#total-amount").empty();
    $("#total-amount").append(totalAmount);
}

$("#obsolate").on('click', function () {
    if($("#obsolate-reason").val()==''){
        alert('原因不能为空');
        return false;
    }
    // $.post('/market/purchase_order/obsolate', {purchaseNum: $("#purchase-num").text()}, function (res) {
    //     location.href='/market/purchase_order/2lst';
    // })
})

