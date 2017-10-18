<%-- 
    Document   : cart
    Created on : Oct 18, 2017, 12:16:30 AM
    Author     : Laurentsia
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Isi Keranjang</title>
        <link href="<c:url value="/template/css/bootstrap_1.css" />" rel="stylesheet">
    </head>
    <body>
        <h1>Hai ${user.username} ${msg}</h1>
        <h3>Berikut adalah isi keranjang Anda</h3>
        <table>
        <c:forEach items="${user.carts}" var="c">
            <tr>
            <td>${c.productName}</td>
            <td>Rp. ${c.price}  </td>
            <td><a href="itemlist/remove/${c.id}"><button type="submit">Hapus</button></td>
        </tr>
        </c:forEach>
        </table>
        <br>
        <p><a href="/shoppingapp/welcome"><button type="submit">Kembali ke halaman utama</button></a></p>
    </body>
</html>
