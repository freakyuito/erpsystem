$(function () {
    summation();
    estimate();
})

function summation() {
    var completedAmount = 0;
    var totalAmount = 0;
    var sumPrice = 0;
    var totalEstimate = 0;
    var totalWeight = 0;
    $("td#amount").each(function () {
        totalAmount += Number($(this).text());
    })
    $("td#total-price").each(function () {
        sumPrice += Number($(this).text());
    })
    $("td#process").each(function () {
        var complete = Number($(this).text().split('/')[0]);
        completedAmount += complete;
    })
    $("td#estimate-weight").each(function () {
        var estimate = Number($(this).text());
        totalEstimate += estimate;
    })
    $("td#weight").each(function () {
        var weight = Number($(this).text());
        totalWeight += weight;
    })
    $("#total-amount").empty();
    $("#total-amount").append(totalAmount);
    $("#sum-price").empty();
    $("#sum-price").append(sumPrice);
    $("#total-process").empty();
    $("#total-process").append(completedAmount + '/' + totalAmount);
    $("#total-estimate").empty();
    $("#total-estimate").append(totalEstimate);
    $("#total-weight").empty();
    $("#total-weight").append(totalWeight);
}

$("#obsolate").on('click', function () {
    if ($("#obsolate-reason").val() == '') {
        alert('原因不能为空');
        return false;
    }
    $.post('/market/purchase_order/obsolate', {purchaseNum: $("#purchase-num").text()}, function (res) {
        location.href = '/market/purchase_order/2lst';
    })
})
$("#sign-confirm").on('click', function () {
    $('#sign-confirm').remove();
    $('#sign').remove();
    var userName = $("#user-name").val();
    var purchaseNum = $("#purchase-num").text();
    $.post('/market/purchase_order/sign', {userName: userName, purchaseNum: purchaseNum}, function (res) {
        location.href = '/market/purchase_order/2lst';
    })
})

function estimate() {
    $('.estimate-weight').each(function (index, obj) {
    })
    // $.each($('.estimate-weight'), function (index, obj) {
    // })
}

