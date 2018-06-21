$(function () {
    search();
})

function search() {
    var purchaseNum = $('#purchase-num').val();
    var productNum = $('#product-num').val();
    var scheduleTime = $('#dtp_input1').val();
    $.post('/product/product_order/get_by_criteria', {
        purchaseNum: purchaseNum,
        productNum: productNum,
        scheduleTime: scheduleTime
    }, function (res) {
        if (res != null) {
            var i = 0;
            $("#table-body").empty();
            $.each(res, function (index, obj) {
                $("#table-body").append(
                    '<tr>' +
                    '<td style="text-align: center">' + (index + 1) + '</td>' +
                    '<td style="text-align: center"><a href="/market/purchase_order/2dtl?purchaseNum=' + obj.purchaseNum + '">' + obj.purchaseNum + '</a></td>' +
                    '<td style="text-align: center">' + obj.colorName + '</td>' +
                    '<td style="text-align: center"><a href="/product/product_order/2dtl?productNum=' + obj.productNum + '">' + obj.productNum + '</a></td>' +
                    '<td style="text-align: center">' + obj.machineNum + '</td>' +
                    '<td style="text-align: center">' + obj.completedAmount + '/' + obj.totalAmount + '</td>' +
                    '<td style="text-align: center">' + obj.estimateWeight + '</td>' +
                    '<td style="text-align: center">' + obj.scheduleBeginTime + '</td>' +
                    '<td style="text-align: center">' + obj.scheduleFinishTime + '</td>' +
                    '</tr>');
            })
        } else {
            $("#table-body").empty();
            $("#table-body").append('null');
        }
    })
}