$(function () {
    getUserList('BG',$('#receiver-name'));
})

function setStateCode(curState, batchNum) {
    $.post('/product/product_order/set_state_code', {curState: curState, batchNum: batchNum}, function () {
        var link = $('#product-num').text().replace(/#/, '%23');
        location.href = '/product/product_order/2dtl?productNum=' + link;
    })
}

function getUserList(auth,select) {
    $.post('/common/user/get_by_auth', {auth: auth}, function (res) {
        select.empty();
        $.each(res, function (index, obj) {
            select.append('<option value="' + obj + '">' + obj + '</option>');
        })
    })
}

function sign() {
    $('#select_machine_and_commander').remove();
    $('#select_machine_and_commander-confirm').remove();

    var approverName = $('#user-name').val();
    var receiverName = $("#receiver-name").children('option:selected').val();
    var machineNum = $("#select_machine-num").children('option:selected').val();
    var productNum = $('#product-num').text();
    $.post('/product/product_order/sign', {
        approverName: approverName,
        receiverName: receiverName,
        machineNum: machineNum,
        productNum: productNum
    }, function () {
        var link = $('#product-num').text().replace(/#/, '%23');
        location.href = '/product/product_order/2dtl?productNum=' + link;
    })
}

function insertPackingForm(batchNum) {
    $.post('/product/packing_form/insert_packing_form_with_batch_num',{batchNum:batchNum},function () {

    })
}

function getAvailablesMachineId() {
    $.post('/product/plate/machine/get_availables_id',{},function (res) {
        $('#select_machine-num').empty();
        $.each(res,function (index,obj) {
            $('#select_machine-num').append('<option value="' + obj + '">' + obj + '</option>');
        })
    })
}

function occupyMachine(curState,batchNum) {
    $.post('/product/plate/machine/is_available_by_id',{machineId:$('#machine-num').attr('value')},function (res) {
        if(res){
            $.post('/product/plate/machine/occupy_by_id',{machineId:$('#machine-num').attr('value'),batchNum:batchNum},function (res) {
                setStateCode(curState,batchNum);
            })
        }else{
            alert('机台已被占用');
        }
    })
}

function releaseMachine(curState,batchNum) {
    $.post('/product/plate/machine/release_by_id',{machineId:$('#machine-num').attr('value')},function (res) {
        setStateCode(curState,batchNum);
    })
}