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
            $("#table-body").empty();
            $.each(res, function (index, obj) {
                var link = obj.productNum.replace(/#/, '%23')
                $("#table-body").append(
                    '<tr>' +
                    '<td style="text-align: center">' + (index + 1) + '</td>' +
                    '<td style="text-align: center"><a href="/market/purchase_order/2dtl?purchaseNum=' + obj.purchaseNum + '">' + obj.purchaseNum + '</a></td>' +
                    '<td style="text-align: center">' + obj.patternName + '</td>' +
                    '<td style="text-align: center"><a href="/product/product_order/2dtl?productNum=' + link + '">' + obj.productNum + '</a></td>' +
                    '<td style="text-align: center">' + obj.machineNum + '</td>' +
                    '<td style="text-align: center">' + obj.completedAmount + '/' + obj.totalAmount + '</td>' +
                    '<td style="text-align: center">' + obj.estimateWeight + '</td>' +
                    '<td ></td>' +
                    '<td style="text-align: center">\n' +
                    '                                    <div class="input-group date form_date" data-date=""\n' +
                    '                                         data-date-format="yyyy-MM-dd" data-link-field="dtp_input1"\n' +
                    '                                         data-link-format="yyyy-mm-dd">\n' +
                    '                                        <input class="form-control" size="16" type="text" value="' + obj.scheduleBeginTime + '"\n' +
                    '                                               readonly="readonly"/>\n' +
                    '                                        <span class="input-group-addon"><span\n' +
                    '                                                class="glyphicon glyphicon-remove"></span></span>\n' +
                    '                                    </div>\n' +
                    '                                    <input type="hidden" id="dtp_input1" value="' + obj.scheduleBeginTime + '"/><br/>\n' +
                    '                                </td>' +
                    '<td style="text-align: center">\n' +
                    '                                    <div class="input-group date form_date" data-date=""\n' +
                    '                                         data-date-format="yyyy-MM-dd" data-link-field="dtp_input2"\n' +
                    '                                         data-link-format="yyyy-mm-dd">\n' +
                    '                                        <input class="form-control" size="16" type="text" value="' + obj.scheduleFinishTime + '"\n' +
                    '                                               readonly="readonly"/>\n' +
                    '                                        <span class="input-group-addon"><span\n' +
                    '                                                class="glyphicon glyphicon-remove"></span></span>\n' +
                    '                                    </div>\n' +
                    '                                    <input type="hidden" id="dtp_input2" value="' + obj.scheduleFinishTime + '"/><br/>\n' +
                    '                                </td>' +
                    '</tr>'
                )
                ;
            })
        } else {
            $("#table-body").empty();
            $("#table-body").append('null');
        }
    })
}

function setScheduleBeginTime(productNum, time) {

}