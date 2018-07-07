$(document).ready(function(){
    $("#zipCode").change(function() {

        $.getJSON( "json/code.json", function( data ) {
            for(var i =0; i<data.length; i++) {
                //for(let city of data) {
                if(data[i].kod==$("#zipCode").val()){
                    $("#city").val(data[i].miejscowosc);
                    return;
                }
            }
            $("#city").val("Nie znaleziono miasta!");

        });
    });



});