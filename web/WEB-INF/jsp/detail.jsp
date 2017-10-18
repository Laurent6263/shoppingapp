<%-- 
    Document   : detail
    Created on : Oct 17, 2017, 1:20:42 PM
    Author     : user
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Detail Page</title>
        <link href="<c:url value="/template/css/bootstrap_1.css" />" rel="stylesheet">
    </head>
    <body>
        <h1>Hai ${user.username} </h1>
        <h3>Jumlah barang di keranjang : ${user.carts.size()}</h3>
        <h3>Berikut detail barang</h3>
        <p>${productInformation.productName}</p>
        <p>${productInformation.productInfo}</p>
        <p>Harga : Rp. ${productInformation.price}</p>
        <p><a href="/shoppingapp/additem/${productInformation.id}"><button type="submit">Tambahkan ke keranjang</button></a></p>
        <p><a href="/shoppingapp/welcome"><button type="submit">Kembali ke halaman utama</button></a></p>
    </body>
</html>
