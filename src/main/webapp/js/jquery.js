$(document).ready(function(){

    $(".rectangle-menu").hover(function() {
        $(this).animate({left: "0px"}, 500);
    }, function() {
        $(this).animate({left: "-300px"}, 500);
    });
});