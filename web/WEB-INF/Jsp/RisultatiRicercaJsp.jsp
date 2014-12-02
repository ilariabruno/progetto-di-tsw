<%-- 
    Document   : RisultatiRicercaJsp
    Created on : 26-nov-2014, 12.20.17
    Author     : Stefano
--%>

<%@page import="it.unimol.profiles.beans.pagine.RisultatiRicerca"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="Css/stile.css" />
        <title>Risultati Ricerca</title>

    </head>
    <body>
        <%@include file="../Html/Header.html" %>

        <%
            RisultatiRicerca risultatiRicerca = (RisultatiRicerca) request.getAttribute("risultati_ricerca");

            out.print("<div>");
            out.print(risultatiRicerca);
            out.print("</div>");
        %>

        <%@include file="../Html/Footer.html" %>
    </body>
</html>