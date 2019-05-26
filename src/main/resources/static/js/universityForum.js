var universityId;

$(document).ready(function () {
    universityId = parseInt(window.location.href.split('?')[1].split('=')[1]);
    getMajorList();
});

function getMajorList() {
    getRequest(
        '/search/getSchoolInfo/'+universityId,
        function (res) {
            renderMajorList(res.content.majors);
        },
        function (error) {
            alert(error);
        }
    );
}

function renderMajorList(list) {
    $('#majors-list-container').empty();
    var majorDomStr = '';
    list.forEach(function (major) {
        alert(major.name);
        major.briefIntro = major.briefIntro || '';
        majorDomStr +=
            "<li class='major-item card'>" +
            "<img class='major-logo' src='" + (major.logoUrl || "../images/success.png") + "'/>" +
            "<div class='major-info'>" +
            "<div class='major-title'>" +
            "<span class='primary-text'>" + major.name + "</span>" +
            "</div>" +
            "<div class='major-description dark-text'><span>" + major.briefIntro||"这是简介" + "</span></div>" +
            "<div style='display: flex'>"+
            "<div class='-operation'><a href='/major/forum?majorId="+ major.id +"'>进入论坛</a></div></div>" +
            "</div>"+
            "</li>";
    });
    $('#majors-list-container').append(majorDomStr);
}

