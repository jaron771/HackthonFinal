$(document).ready(function () {
    getRequest(
        "/user/get/" + sessionStorage.getItem('id'),
        function (res) {
            var user = res.content;
            $("#name").innerHTML = user.name;
            getRequest(
                "/getSchoolInfo/" + user.universityId,
                function (res) {
                    $("#university").innerHTML = res.content.university.name;
                },
                function (error) {
                    alert(error);
                }
            );
            getRequest(
                "/getMajorInfo/" + user.majorId,
                function (res) {
                    $("#major").innerHTML = res.content.name;
                },
                function (error) {
                    alert(error);
                }
            )

        }
    )
});