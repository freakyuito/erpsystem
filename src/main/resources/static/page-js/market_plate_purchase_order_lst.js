$(function () {
    $.post('/universal/customer/get_all', {}, function (res) {
        var s = $(".customer");
        $.each(res, function (index, obj) {
            s.append('<option value="' + obj + '">' + obj + '</option>')
        })
    })
    search();
})

function search() {
    $.post('/market/purchase_order/get_by_criteria', {
        customerName: $("#customer-name").val(),
        purchaseNum: $("#purchase-num").val(),
        purchaseTimeBegin: $("#dtp_input1").val(),
    }, function (res) {
        generateLst(res);
    })
}

function getCategory(category, btn) {
    $.post('/market/purchase_order/get_category', {category: category}, function (res) {
        $("#category-dropdown").empty();
        $("#category-dropdown").append(btn + '<span class="caret">' + '</span>');
        generateLst(res);
    })
}

function generateLst(res) {
    if (res != null) {
        var i = 0;
        $("#table-body").empty();
        $.each(res, function (index, obj) {
            if(obj.validity){
                $("#table-body").append(
                    '<tr>' +
                    '<td style="text-align: center;width: 150px">' + (index + 1) + '</td>' +
                    '<td style="text-align: center;width: 250px">' + obj.customerName + '</td>' +
                    '<td style="text-align: center;width: 250px"><a href="/market/purchase_order/2dtl?purchaseNum=' + obj.purchaseNum + '">' + obj.purchaseNum + '</a></td>' +
                    '<td style="text-align: center;width: 250px">' + obj.completedAmout + '/' + obj.totalAmout + '</td>' +
                    '<td style="text-align: center;width: 250px">' + obj.purchaseTime + '</td>' +
                    '<td style="text-align: center;width: 250px">' + obj.deliverTime + '</td>' +
                    '<td style="text-align: center;width: 250px">' + obj.remark + '</td>' +
                    '</tr>');
            }else {
                $("#table-body").append(
                    '<tr>' +
                    '<td style="TEXT-DECORATION: line-through;text-align: center;width: 150px;color: red">' + (index + 1) + '</td>' +
                    '<td style="TEXT-DECORATION: line-through;text-align: center;width: 250px;color: red">' + obj.customerName + '</td>' +
                    '<td style="TEXT-DECORATION: line-through;text-align: center;width: 250px;color: red"><a href="/market/purchase_order/2dtl?purchaseNum=' + obj.purchaseNum + '">' + obj.purchaseNum + '</a></td>' +
                    '<td style="TEXT-DECORATION: line-through;text-align: center;width: 250px;color: red">' + obj.completedAmout + '/' + obj.totalAmout + '</td>' +
                    '<td style="TEXT-DECORATION: line-through;text-align: center;width: 250px;color: red">' + obj.purchaseTime + '</td>' +
                    '<td style="TEXT-DECORATION: line-through;text-align: center;width: 250px;color: red">' + obj.deliverTime + '</td>' +
                    '<td style="TEXT-DECORATION: line-through;text-align: center;width: 250px;color: red">' + obj.remark + '</td>' +
                    '</tr>');
            }
        })
    }
}