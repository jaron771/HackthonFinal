var majorId;

$(document).ready(function () {
    majorId = parseInt(window.location.href.split('?')[1].split('=')[1]);
    $('#add-post').click(function jump() {
        window.location.href = "/major/forum?majorId=" + majorId;
    })
});




