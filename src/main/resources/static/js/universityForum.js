var universityId;

$(document).ready(function () {
    universityId = parseInt(window.location.href.split('?')[1]);

    getMajorList(universityId);

    function getMajorList(universityId) {
        getRequest(
            '/search/getSchoolInfo/'+universityId,
            function (res) {
                if (res.success) {
                    renderMajorList(res.majors);
                } else {
                    $('#none-hint').css("display", "");
                }
            },
            function (error) {
                alert(error);
            }
        );
    }

    function renderMajorList(majors) {
        $('.majors-list').empty();
        var majorDomStr = '';
        list.forEach(function (major) {
            major.description = major.description || '';
            majorDomStr +=
                "<li class='major-item card'>" +
                "<img class='major-logo' src='" + (major.logoUrl || "../images/success.png") + "'/>" +
                "<div class='major-info'>" +
                "<div class='major-title'>" +
                "<span class='primary-text'>" + major.name + "</span>" +
                "</div>" +
                "<div class='major-description dark-text'><span>" + major.briefIntro||"这是简介" + "</span></div>" +
                "<div>类型：" + movie.type + "</div>" +
                "<div style='display: flex'>"+
                "<div class='-operation'><a href='/major/forum?majorId="+ major.id +"'>进入论坛</a></div></div>" +
                "</div>"+
                "</li>";
        });
        $('.majors-list').append(majorDomStr);
    }
});

