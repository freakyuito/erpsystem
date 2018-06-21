$(function () {
    $.post('/universal/customer/get_all', {}, function (res) {
        var s = $(".customer");
        $.each(res, function (index, obj) {
            s.append('<option value="' + obj + '">' + obj + '</option>')
        })
    })
    $.post('/market/purchase_order/get_by_criteria', {
        customerName: $("#customer-name").val(),
        purchaseNum: $("#purchase-num").val(),
        purchaseTimeBegin: $("#dtp_input1").val(),
        purchaseTimeEnd: $("#dtp_input2").val()
    }, function (res) {
        if (res != null) {
            var i = 0;
            $("#table-body").empty();
            $(res).each(function () {
                $("#table-body").append(
                    '<tr>' +
                    '<td style="text-align: center">' + (i + 1) + '</td>' +
                    '<td style="text-align: center">' + res[i].customerName + '</td>' +
                    '<td style="text-align: center"><a href="/market/purchase_order/2dtl?purchaseNum=' + res[i].purchaseNum + '">' + res[i].purchaseNum + '</a></td>' +
                    '<td style="text-align: center">' + res[i].completedAmout + '/' + res[i].totalAmout + '</td>' +
                    '<td style="text-align: center">' + res[i].purchaseTime + '</td>' +
                    '<td style="text-align: center">' + res[i].deliverTime + '</td>' +
                    '<td style="text-align: center">' + res[i].remark + '</td>' +
                    '</tr>');
                i++;
            })
        }
    })

    $("#search").on("click", function () {
        $.post('/market/purchase_order/get_by_criteria', {
            customerName: $("#customer-name").val(),
            purchaseNum: $("#purchase-num").val(),
            purchaseTimeBegin: $("#dtp_input1").val(),
        }, function (res) {
            if (res != null) {
                var i = 0;
                $("#table-body").empty();
                $(res).each(function () {
                    $("#table-body").append(
                        '<tr>' +
                        '<td style="text-align: center">' + (i + 1) + '</td>' +
                        '<td style="text-align: center">' + res[i].customerName + '</td>' +
                        '<td style="text-align: center"><a href="/market/purchase_order/2dtl?purchaseNum=' + res[i].purchaseNum + '">' + res[i].purchaseNum + '</a></td>' +
                        '<td style="text-align: center">' + res[i].completedAmout + '/' + res[i].totalAmout + '</td>' +
                        '<td style="text-align: center">' + res[i].purchaseTime + '</td>' +
                        '<td style="text-align: center">' + res[i].deliverTime + '</td>' +
                        '<td style="text-align: center">' + res[i].remark + '</td>' +
                        '</tr>');
                    i++;
                })
            }
        })
    })

})
function getCategory(category, btn) {
    $.post('/market/purchase_order/get_category', {category: category}, function (res) {
        $("#category-dropdown").empty();
        $("#category-dropdown").append(btn + '<span class="caret">' + '</span>');
        if (res != null) {
            var i = 0;
            $("#table-body").empty();
            $(res).each(function () {
                $("#table-body").append(
                    '<tr>' +
                    '<td style="text-align: center">' + (i + 1) + '</td>' +
                    '<td style="text-align: center">' + res[i].customerName + '</td>' +
                    '<td style="text-align: center"><a href="/market/purchase_order/2dtl?purchaseNum=' + res[i].purchaseNum + '">' + res[i].purchaseNum + '</a></td>' +
                    '<td style="text-align: center">' + res[i].completedAmout + '/' + res[i].totalAmout + '</td>' +
                    '<td style="text-align: center">' + res[i].purchaseTime + '</td>' +
                    '<td style="text-align: center">' + res[i].deliverTime + '</td>' +
                    '<td style="text-align: center">' + res[i].remark + '</td>' +
                    '</tr>');
                i++;
            })
        }
    })
}