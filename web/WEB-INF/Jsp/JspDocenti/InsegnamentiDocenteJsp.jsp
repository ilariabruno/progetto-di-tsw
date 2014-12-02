<%-- 
    Document   : InsegnamentiDocente
    Created on : 26-nov-2014, 12.23.01
    Author     : Stefano
--%>

<%@page import="it.unimol.profiles.beans.pagine.docente.InsegnamentiDocente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    InsegnamentiDocente insegnamentiDocente = (InsegnamentiDocente) request.getAttribute("insegnamenti_docente");
    Docente docente = (Docente)request.getAttribute("docente");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link type="text/css" rel="stylesheet" href="Css/stile.css" />
        <title>
            <%
                out.print("Prof. " + docente.getNome() + " " + docente.getCognome());
            %>
        </title>
    </head>
    <body>
        <%@include file="../../Html/Header.html" %>
        <div id="TITOLO_PAGINA">
            <%
                out.print("Prof. " + docente.getNome() + " "
                        + docente.getCognome());
            %>
        </div>
        <div id="CONTENUTO_PAGINA">
            <div id="FOTO_PROFESSORE">
                <img src="Images/faustofasano.png" alt="Foto di Fausto Fasano"/>
            </div>
            <%@include file="../../Jsp/MenuDocente.jsp" %>
            <div id="CONTENUTO_SEZIONE_SELEZIONATA">
                <div id="INFORMAZIONI_GENERALI">
                    <ul>
                        
                    </ul>
                </div>
            </div>

        </div>
        <%@include file="../../Html/Footer.html" %>
    </body>
</html>
