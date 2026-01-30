/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package co.com.sst360.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import co.com.sst360.modelo.Incidente;
import co.com.sst360.dao.IncidenteDAO;

/**
 *
 * @author Familia
 */
@WebServlet(name = "IncidenteServlet", urlPatterns = {"/IncidenteServlet"})
public class IncidenteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
    

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
        response.sendRedirect("index.html");
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

    String tipoEvento = request.getParameter("tipoEvento");
    String codigo = request.getParameter("codigo");
    String lugar = request.getParameter("lugar");
    String area = request.getParameter("area");
    String descripcion = request.getParameter("descripcion");

    Incidente incidente = new Incidente(
        tipoEvento,
        codigo,
        java.time.LocalDate.now(),
        java.time.LocalTime.now(),
        lugar,
        area,
        descripcion,
        "Pendiente"
    );

    IncidenteDAO dao = new IncidenteDAO();
    boolean guardado = dao.insertarIncidente(incidente);

    request.setAttribute("guardado", guardado);
    request.getRequestDispatcher("resultado.jsp")
           .forward(request, response);
}

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";

}
    
}

