<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<form method="post" action="/display-discount">
    <label>product description</label> <br>
    <input type="text" name="proDes" placeholder="product description: "><br>
    <label >list price</label> <br>
    <input type="text" name="listPrice" placeholder="list price: "><br>
    <label >discount percent</label> <br>
    <input type="text" name="disPer" placeholder="discount percent: "><br>
    <input type="submit" value="Calculate discount">

</form>
</body>
</html>