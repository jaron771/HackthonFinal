var majorId;

$(document).ready(function () {
    majorId = parseInt(window.location.href.split('?')[1].split('=')[1]);
    getMajorInfo();
    $('#add-post').click(function jump() {
        window.location.href="/add/post?majorId="+majorId;
    })
});


function getMajorInfo() {
    getRequest(
        '/search/getMajorInfo/'+majorId,
        function (res) {
            renderMajorInfo(res.content);
        },
        function (error) {
            alert(error);
        }
    )
}

function renderMajorInfo(major) {
    $('#major-info-container').empty();
    var majorDomStr = '';
    major.briefIntro = major.briefIntro || '';
    majorDomStr +=
    "<li class='major-item card'>"+
        "<img class='major-logo' src='"+major.logoUrl+"'/>"+
        "<div class='major-info'>"+
            "<div class='major-title'>"+
                "<span class='primary-text'>"+major.name+"</span>"+
            "</div>"+
            "<div class='major-description dark-text'>"+
                "<span>"+major.briefIntro+"</span>"+
            "</div>"+
            "<div class='major-description dark-text'>"+
                "<span>地址："+major.address+"</span>"+
            "</div>"+
            "<div class='major-description dark-text'>"+
                "<span>电话："+major.tel+"</span>"+
            "</div>"+
        "</div>"+
    "</li>";
    $('#major-info-container').append(majorDomStr);
}

