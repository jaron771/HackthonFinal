$(document).ready(function () {
    getRequest(
        "/user/get/" + sessionStorage.getItem('id'),
        function (res) {
            var user = res.content;
            console.log(user);
            document.getElementById("name").innerHTML = "姓名：" + user.username;
            if (user.universityId != null) {
                getRequest(
                    "/search/get/SchoolInfo/" + user.universityId,
                    function (res) {
                        document.getElementById("university").innerHTML = "大学：" + res.content.university.name;
                    },
                    function (error) {
                        alert(error);
                    }
                );
            }
            if (user.majorId != null) {
                getRequest(
                    "/search/getMajorInfo/" + user.majorId,
                    function (res) {
                        document.getElementById("major").innerHTML = "专业：" + res.content.name;
                    },
                    function (error) {
                        alert(error);
                    }
                );
            }
        },
        function (error) {
            alert(error);
        }
    )
});