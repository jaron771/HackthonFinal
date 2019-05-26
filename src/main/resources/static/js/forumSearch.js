$(document).ready(function (){
    var mySelect=document.getElementById("major-select");

    $('#search-forum').click(function jump() {
        if(mySelect.selectedIndex==0) {
            window.location.href = "/university/forum?universityId=1";
        }else {
            window.location.href = "/major/forum?majorId=1";
        }
    })
});