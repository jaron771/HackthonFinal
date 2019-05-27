$(document).ready(function () {
    var mySelect1 = document.getElementById("university-select");
    var mySelect2 = document.getElementById("major-select");
    $('#search-forum').click(function jump() {
        if (mySelect1.selectedIndex == 5 && mySelect2.selectedIndex == 0) {
            window.location.href = "/university/forum?universityId=1";
        } else {
            if (mySelect2.selectedIndex == 1) {
                window.location.href = "/major/forum?majorId=1";
            } else if (mySelect2.selectedIndex == 2) {
                window.location.href = "/major/forum?majorId=2";
            }
        }
    })
});