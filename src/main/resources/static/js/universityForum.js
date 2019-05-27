var universityId;

$(document).ready(function () {
    universityId = parseInt(window.location.href.split('?')[1].split('=')[1]);
    getMajorList();
});

function getMajorList() {
    getRequest(
        '/search/get/SchoolInfo/'+universityId,
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
        major.briefIntro = major.briefIntro || '';
        majorDomStr +=
            "<li class='major-item card'>" +
                "<img class='major-logo' src='" + major.logoUrl + "'/>" +
                "<div class='major-info'>" +
                    "<div class='major-title'>" +
                        "<span class='primary-text'>" + major.name + "</span>" +
                    "</div>" +
                    "<div class='major-description dark-text'><a href='/major/forum?majorId="+major.id+"'>进入论坛</a>" +
                    "</div>" +
                "</div>"+
            "</li>";
    });
    $('#majors-list-container').append(majorDomStr);
}

