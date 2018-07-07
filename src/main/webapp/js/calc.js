function calc() {
    var p1 = document.getElementById("param1").value;
    var p2 = document.getElementById("param2").value;
    document.getElementById("result").innerHTML = eval(p1+operator+p2);
}