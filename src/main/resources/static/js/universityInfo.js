$(document).ready(function () {
    var universityId = 1;//TODO:要写获取学校id的方法
    getRequest(
        "/search/getSchoolInfo/" + universityId,
        function (res) {
            $("#brief-introduce").innerHTML = res.content.university.briefIntro;
            for (var i = 0; i < 9; i++) {
                $("#major" + i).innerHTML = res.content.majors[i].name;
                //TODO:这里把按钮的href指定为该专业的详情页
            }
        },
        function (error) {
            alert(error);
        }
    );

});