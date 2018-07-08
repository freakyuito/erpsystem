$(function () {
    search();
})

function search() {
    var purchaseNum = $('#purchase-num').val();
    var productNum = $('#product-num').val();
    var scheduleTime = $('#dtp_input').val();
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
                    '<td style="text-align: center"><a class="product-num" href="/product/product_order/2dtl?productNum=' + link + '">' + obj.productNum + '</a></td>' +
                    '<td style="text-align: center">' + obj.machineNum + '</td>' +
                    '<td style="text-align: center">' + obj.completedAmount + '/' + obj.totalAmount + '</td>' +
                    '<td style="text-align: center">' + obj.estimateWeight + '</td>' +
                    '<td ></td>' +
                    // '<td style="text-align: center">' +
                    // '    <div class="input-group date form_date" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input' + (index * 2) + '" data-link-format="yyyy-mm-dd">' +
                    // '         <input class="form-control" size="16" type="text" value="' + obj.scheduleBeginTime + '"readonly="readonly"/>' +
                    // '         <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>' +
                    // '    </div>' +
                    // '    <input type="hidden" id="dtp_input' + (index * 2) + '" value="' + obj.scheduleBeginTime + '"' +
                    // ' onchange="setScheduleBeginTime($(this).parent().parent().find(\' .product-num\').eq(0).text(),$(this).val());"/>\n' +
                    // '</td>' +
                    // '<td style="text-align: center">' +
                    // '   <div class="input-group date form_date" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input' + (index * 2 + 1) + '" data-link-format="yyyy-mm-dd">' +
                    // '       <input class="form-control" size="16" type="text" value="' + obj.scheduleFinishTime + '" readonly="readonly"/>' +
                    // '          <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>' +
                    // '   </div>' +
                    // '   <input type="hidden" id="dtp_input' + (index * 2 + 1) + '" value="' + obj.scheduleFinishTime + '"' +
                    // ' onchange="setScheduleEndTime($(this).parent().parent().find(\' .product-num\').eq(0).text(),$(this).val());"/>\n' +
                    // '</td>' +
                    '</tr>'
                );
                $('.date').datetimepicker({format: 'yyyy-mm-dd',todayBtn:true,showMeridian: false,linkField: "mirror_field",
                    linkFormat: "yyyy-mm-dd",class});
            })
        } else {
            $("#table-body").empty();
            $("#table-body").append('null');
        }
    })
}

function setScheduleBeginTime(productNum, time) {
    alert(time);
}
function setScheduleEndTime(productNum, time) {

}