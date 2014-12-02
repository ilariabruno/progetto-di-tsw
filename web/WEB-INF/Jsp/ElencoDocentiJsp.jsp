<%-- 
    Document   : ElencoDocenti
    Created on : 26-nov-2014, 10.52.33
    Author     : Stefano
--%>

<%@page import="it.unimol.profiles.beans.utils.Docente"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="Css/stile.css" />
        <title>Elenco Docenti</title>

    </head>
    <body>
        <%@include file="../Html/Header.html" %>

        <%
            ArrayList<Docente> elencoDocenti = (ArrayList<Docente>) request.getAttribute("elenco_docenti");

            out.print("<div>");
            out.print(elencoDocenti);
            out.print("</div>");
        %>

        <%@include file="../Html/Footer.html" %>
    </body>
</html>
