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
            $("#tbody-list").empty();
            $.each(res, function (index, obj) {
                var link = obj.productNum.replace(/#/, '%23')
                if(obj.validity){
                    $("#tbody-list").append(
                        '<tr>' +
                        '<td style="text-align: center">' + (index + 1) + '</td>' +
                        '<td style="text-align: center"><a href="/market/purchase_order/2dtl?purchaseNum=' + obj.purchaseNum + '">' + obj.purchaseNum + '</a></td>' +
                        '<td style="text-align: center">' + obj.patternName + '</td>' +
                        '<td style="text-align: center"><a class="product-num" href="/product/product_order/2dtl?productNum=' + link + '">' + obj.productNum + '</a></td>' +
                        '<td style="text-align: center">' + obj.machineNum + '</td>' +
                        '<td style="text-align: center">' + obj.completedAmount + '/' + obj.totalAmount + '</td>' +
                        '<td style="text-align: center">' + obj.estimateWeight + '</td>' +
                        '<td style="text-align: center">' + obj.deliverTime + '</td>' +
                        '<td style="text-align: center">' +
                        '    <div class="input-group date form_date input-group-sm" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input' + (index * 2) + '" data-link-format="yyyy-mm-dd">' +
                        '         <input class="form-control input-sm" size="18" type="text" value="' + obj.scheduleBeginTime + '"readonly="readonly"' +
                        'onchange="setScheduleBeginTime(\'' + obj.productNum + '\',$(this).val());"/>' +
                        '         <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>' +
                        '    </div>' +
                        '    <input class="input-sm" type="hidden" id="dtp_input' + (index * 2) + '" value="' + obj.scheduleBeginTime + '"/>\n' +
                        '</td>' +
                        '<td style="text-align: center">' +
                        '   <div class="input-group date form_date input-group-sm" data-date="" data-date-format="yyyy-mm-dd" data-link-field="dtp_input' + (index * 2 + 1) + '" data-link-format="yyyy-mm-dd">' +
                        '       <input class="form-control input-sm" size="18" type="text" value="' + obj.scheduleFinishTime + '" readonly="readonly"' +
                        'onchange="setScheduleBeginTime(\'' + obj.productNum + '\',$(this).val());"/>' +
                        '          <span class="input-group-addon"><span class="glyphicon glyphicon-remove"></span></span>' +
                        '   </div>' +
                        '   <input class="input-sm" type="hidden" id="dtp_input' + (index * 2 + 1) + '" value="' + obj.scheduleFinishTime + '"/>' +
                        '</td>' +
                        '</tr>'
                    );
                    $('.date').datetimepicker({
                        format: 'yyyy-mm-dd', todayBtn: true, showMeridian: false, linkField: "mirror_field",
                        linkFormat: "yyyy-mm-dd"
                    });
                }else{
                    $("#tbody-list").append(
                        '<tr>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;">' + (index + 1) + '</td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;"><a href="/market/purchase_order/2dtl?purchaseNum=' + obj.purchaseNum + '">' + obj.purchaseNum + '</a></td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;">' + obj.patternName + '</td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;"><a class="product-num" href="/product/product_order/2dtl?productNum=' + link + '">' + obj.productNum + '</a></td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;">' + obj.machineNum + '</td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;">' + obj.completedAmount + '/' + obj.totalAmount + '</td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;">' + obj.estimateWeight + '</td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;">' + obj.deliverTime + '</td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;">' + obj.scheduleBeginTime + '</td>' +
                        '<td style="text-align: center;color:red;TEXT-DECORATION: line-through;">' + obj.scheduleFinishTime + '</td>' +
                        '</tr>'
                    );
                }
            })
        } else {
            $("#tbody-list").empty();
            $("#tbody-list").append('null');
        }
    })
}

function setScheduleBeginTime(productNum, time) {
    $.post('/product/product_order/set_schedule_begin_time',{productNum:productNum,time:time});
}
function setScheduleEndTime(productNum, time) {
    $.post('/product/product_order/set_schedule_finish_time',{productNum:productNum,time:time});
}