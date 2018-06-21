$(function () {
    $("#test").on('click', function () {
        $.post('/product/product_order/get_by_criteria', {purchaseNum:'',productNum:'',scheduleTime:''}, function (res) {
            if (res != null) {
                var i = 0;
                $("#table-body").empty();
                $(res).each(function () {
                    $("#table-body").append(
                        '<tr>' +
                        '<td style="text-align: center">' + (i + 1) + '</td>' +
                        '<td style="text-align: center">' + res[i].purchaseNum + '</td>' +
                        '<td style="text-align: center">' + res[i].colorName + '</td>' +
                        '<td style="text-align: center">' + res[i].productNum + '</td>' +
                        '<td style="text-align: center">' + res[i].machineNum + '</td>' +
                        '<td style="text-align: center">' + res[i].completedAmount + '</td>' +
                        '<td style="text-align: center">' + res[i].totalAmount + '</td>' +
                        '<td style="text-align: center">' + res[i].estimateWeight + '</td>' +
                        '<td style="text-align: center">' + res[i].generateTime + '</td>' +
                        '<td style="text-align: center">' + res[i].scheduleTime + '</td>' +
                        '</tr>');
                    i++;
                })
            }else{
                alert('null');
            }
        })
    })
})