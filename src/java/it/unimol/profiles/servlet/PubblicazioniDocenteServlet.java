package it.unimol.profiles.servlet;

import it.unimol.profiles.ManagerDocenti;
import it.unimol.profiles.beans.pagine.docente.InformazioniGeneraliDocente;
import it.unimol.profiles.beans.pagine.docente.PubblicazioniDocente;
import it.unimol.profiles.beans.utils.Docente;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Stefano
 */
@WebServlet(name = "PubblicazioniDocente", urlPatterns = {"/PubblicazioniDocente"})
public class PubblicazioniDocenteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Docente docente = new Docente();
        docente.setId(((String) request.getParameter("id")));
        docente.setNome(((String) request.getParameter("nome")));
        docente.setCognome(((String) request.getParameter("cognome")));

        PubblicazioniDocente pubblicazioniDocente = ManagerDocenti.getInstance().getPubblicazioniDocente(docente);
        request.setAttribute("pubblicazioni_docente", pubblicazioniDocente);
        request.setAttribute("docente", docente);


        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/Jsp/JspDocenti/PubblicazioniDocenteJsp.jsp");
        dispatcher.forward(request, response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
