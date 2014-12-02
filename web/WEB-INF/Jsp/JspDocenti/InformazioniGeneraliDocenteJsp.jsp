<%-- 
    Document   : InfoGeneraliDocente
    Created on : 26-nov-2014, 12.21.54
    Author     : Stefano
--%>

<%@page import="it.unimol.profiles.beans.pagine.docente.InformazioniGeneraliDocente"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    InformazioniGeneraliDocente informazioniGeneraliDocente = (InformazioniGeneraliDocente) request.getAttribute("informazioni_generali_docente");
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
                out.print("Prof. " + docente.getNome() + " " + docente.getCognome());
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
                        <%                            
                            out.println("<li>Nome: " + informazioniGeneraliDocente.getNome() + "</li>");
                            out.println("<li>Cognome: " + informazioniGeneraliDocente.getCognome() + "</li>");
                            out.println("<li>Dipartimento: " + informazioniGeneraliDocente.getDipartimento() + "</li>");
                            out.println("<li>Ruolo: " + informazioniGeneraliDocente.getRuolo() + "</li>");

                            if (informazioniGeneraliDocente.getEmail() != null) {
                                out.println("<li>Email: " + informazioniGeneraliDocente.getEmail() + "</li>");
                            }

                            if (informazioniGeneraliDocente.getTelefono() != null) {
                                out.println("<li>Telefono: " + informazioniGeneraliDocente.getTelefono() + "</li>");
                            }
                        %>
                    </ul>
                </div>
            </div>

        </div>
        <%@include file="../../Html/Footer.html" %>
    </body>
</html>
