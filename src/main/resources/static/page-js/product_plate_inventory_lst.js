$(function () {
    $.post('/common/user/get_by_auth', {auth:'BC'}, function (res) {
        var s = $("#select-commander");
        $.each(res, function (index, obj) {
            s.append('<option value="' + obj + '">' + obj + '</option>');
        })
    })
    $.post('/product/plate/machine/get_all', {}, function (res) {
        var s = $("#select-machine");
        $.each(res, function (index, obj) {
            s.append('<option value="' + obj + '">' + obj + '</option>');
        })
    })
    $.post('/product/plate/workgroup/get_all', {}, function (res) {
        var s = $("#select-workgroup");
        $.each(res, function (index, obj) {
            s.append('<option value="' + obj + '">' + obj + '</option>');
        })
    })
    search();
})

function search() {
    $.post('/product/plate/godown_entry/get_by_criteria', {
        startTime: $("#dtp_input1").val(),
        endTime: $("#dtp_input2").val(),
        machineId: $("#select-machine").children('option:selected').val(),
        workgroupId:$('#select-workgroup').children('option:selected').val(),
        commanderName:$('#select-commander').children('option:selected').val(),
        material:$('#select-material').children('option:selected').val(),
        inventoryNum:$('#inventory_num').val(),
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
        })
    }
}
