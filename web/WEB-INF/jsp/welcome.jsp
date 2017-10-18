<%-- 
    Document   : welcome
    Created on : Oct 17, 2017, 9:16:47 AM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome Page</title>
        <link href="<c:url value="/template/css/bootstrap_1.css" />" rel="stylesheet">
    </head>
    <body>
        <h1>Hai ${user.username} ${msg}</h1>
        <h3>Jumlah barang di keranjang : ${user.carts.size()}</h3>
        <a href="itemlist"><button type="submit">Lihat Isi Keranjang</button></a>
        <h3>Berikut adalah daftar barang kami</h3>
        <p>
        <table>
            <tr>
                <td><b>Nama Barang</b></td>
                <td><b>Harga</b></td>
                <td></td>
            </tr>
        <c:forEach items="${products}" var="p">
            <tr>
                
                <td>${p.productName}</td>
                <td>Rp. ${p.price}</td>
                <td><a href="itemdetail/${p.id}"><button type="submit">Lihat Barang</button></a></td>
            </tr>
        </c:forEach>
        </table>
        </p>
    </body>
</html>
