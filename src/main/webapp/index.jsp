<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
    <div>
        <h1><p>Wybierz technologie, które znasz</p></h1>
    </div>
    <div style="margin-left: 5rem">
        <form action="PollServlet" method="POST">
            <div>
                <input type="checkbox" id="langC" name="C">
                <label for="langC">C</label>
            </div>
            <div>
                <input type="checkbox" id="langCPP" name="C++">
                <label for="langCPP">C++</label>
            </div>
            <div>
                <input type="checkbox" id="langJava" name="Java">
                <label for="langJava">Java</label>
            </div>
            <div>
                <input type="checkbox" id="langPHP" name="PHP">
                <label for="langPHP">PHP</label>
            </div>
            <div>
                <input type="checkbox" id="langJavaScript" name="JavaScript">
                <label for="langJavaScript">C</label>
            </div>
            <div>
                <input type="checkbox" id="langCSS" name="CSS">
                <label for="langCSS">CSS</label>
            </div>
            <div>
                <input type="checkbox" id="langHTML" name="HTML">
                <label for="langHTML">HTML</label>
            </div>
            <div>
                <input type="submit" value="Wyślij">
            </div>
        </form>
    </div>

</body>
</html>