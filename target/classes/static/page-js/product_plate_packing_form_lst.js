$(function () {
    search();
    $('#search').on('click', function () {
        search();
    })
    $.post('/universal/color/get_all', {}, function (res) {
        $.each(res, function (index, obj) {
            $('#color-name-multiple').append('<option value="' + obj.colorId + '">' + obj.colorId + obj.colorName + '</option>');
        })
        $('#color-name-multiple').trigger('change');
        $('#color-name-multiple').select2({
            width: 'resolve' // need to override the changed default
        });
    })
})

function search() {
    $("#tbody-list").empty();
    var purchaseNum = $('#purchase-num').val();
    var colorIdList = new Array();
    var batchNum = $('#batch-num').val();
    var packingNum = $('#packing-num').val();
    $('.select2-selection__choice').each(function () {
        var reg = /[\u4e00-\u9fa5]/g;
        colorIdList.push($(this).attr('title').replace(reg, ''));
    })
    if($('.select2-selection__choice').length == 0){
        colorIdList.push('');
    }
    $.each(colorIdList, function (index, colorId) {
        $.post('/product/packing_form/get_by_criteria', {
            purchaseNum: purchaseNum,
            colorId: colorId,
            batchNum: batchNum,
            packingNum: packingNum
        }, function (res) {
            if (res != null) {
                $.each(res, function (index, obj) {
                        $("#tbody-list").append(
                            '<tr>' +
                            '<td style="text-align: center">' + (index + 1) + '</td>' +
                            '<td style="text-align: center"><a href="/market/purchase_order/2dtl?purchaseNum=' + obj.purchaseNum + '">' + obj.purchaseNum + '</a></td>' +
                            '<td style="text-align: center">' + obj.colorName + '</td>' +
                            '<td style="text-align: center">' + obj.batchNum + '</a></td>' +
                            '<td style="text-align: center">' + obj.machineId + '</td>' +
                            '<td style="text-align: center">' + obj.size + '</td>' +
                            '<td style="text-align: center">' + obj.requiredAmount + '</td>' +
                            '<td style="text-align: center">' + obj.completedWeight + '</td>' +
                            '<td style="text-align: center"><a href="/product/packing_form/2dtl?batchNum=' + obj.batchNum + '">' + obj.packingNum + '</a></td>' +
                            '</tr>');
                })
            } else {
                $("#tbody-list").append('null');
            }
        })

    })
    $.post('/product/packing_form/get_free_packing_form', {packingNum:packingNum}, function (res) {
        if (res != null) {
            $.each(res, function (index, obj) {
                $("#tbody-list").append(
                    '<tr>' +
                    '<td style="text-align: center">' + (index + 1) + '</td>' +
                    '<td style="text-align: center">' + obj.purchaseNum + '</a></td>' +
                    '<td style="text-align: center">' + obj.colorName + '</td>' +
                    '<td style="text-align: center">' + obj.batchNum + '</a></td>' +
                    '<td style="text-align: center">' + obj.machineId + '</td>' +
                    '<td style="text-align: center">' + obj.size + '</td>' +
                    '<td style="text-align: center">' + obj.requiredAmount + '</td>' +
                    '<td style="text-align: center">' + obj.completedWeight + '</td>' +
                    '<td style="text-align: center"><a href="/product/packing_form/2dtl_free?packingNum=' + obj.packingNum + '">' + obj.packingNum + '</a></td>' +
                    '</tr>');
            })
        } else {
            $("#tbody-list").append('null');
        }
    })

}