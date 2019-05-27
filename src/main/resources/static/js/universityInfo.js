$(document).ready(function () {
    let universityId = $("#universityId").text();

    getRequest(
        "/search/get/SchoolInfo/" + universityId,
        function (res) {
            console.log(res);
            $('.department').empty();
            let majorDomStr = '';

            for (let k = 0; k < res.content.majors.length;) {
                majorDomStr += "<div class=\"row\">\n";
                for (let l = 0; l < 3 && k < res.content.majors.length; l++) {
                    majorDomStr += "<div class=\'col-md-3 offset-1\'>\n" +
                        "    <a class=\'btn btn-success\' role=\'button\' href=\'/major/forum?majorId=" + res.content.majors[k].id + "\'>" + res.content.majors[k].name + "</a>\n" +
                        "</div>\n";
                    k++;
                }
                majorDomStr += "</div>";
            }
            console.log(majorDomStr);
            $('.department').append(majorDomStr);
        },
        function (error) {
            alert(error);
        }
    );

});