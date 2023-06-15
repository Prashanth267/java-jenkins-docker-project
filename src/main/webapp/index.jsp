<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Job Details</title>
</head>
<body>
    <h1>Job Details</h1>
    <button onclick="loadJobDetails()">Load Job Details</button>
    <div id="jobDetails"></div>

    <script>
    function loadJobDetails() {
        var xhttp = new XMLHttpRequest();
        xhttp.onreadystatechange = function() {
            if (this.readyState == 4 && this.status == 200) {
                document.getElementById("jobDetails").innerHTML = this.responseText;
            }
        };
        xhttp.open("GET", "${pageContext.request.contextPath}/JobDetailsServlet", true);
        xhttp.send();
    }
</script>
</body>
</html>
