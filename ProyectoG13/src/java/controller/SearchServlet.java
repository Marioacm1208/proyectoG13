/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

<<<<<<< HEAD
=======
import DAO.json.JsonVehicleManager;
>>>>>>> mario
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
<<<<<<< HEAD
 * @author Mario
=======
 * @author Mario Carranza Mena B51573
>>>>>>> mario
 */
@WebServlet(name = "SearchServlet", urlPatterns = {"/search"})
public class SearchServlet extends HttpServlet {
    
    String results = "pages/searchResults.jsp";
    String advanced = "pages/search.jsp";
<<<<<<< HEAD
    String home = "index.jsp";
=======
    final String HOME = "index.jsp";
>>>>>>> mario
    
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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SearchServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>" + request.getParameter("userSearch") + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
<<<<<<< HEAD
        String action = request.getParameter("searchParams");
        String redirectTo = "";
        if (action != null) {
            System.out.println("FUE NULL? " + (action));
            switch(action) {
=======
        String params = request.getParameter("searchParams");
        request.setAttribute("searchParams", params);
        String redirectTo = HOME;
        if (params != null) {
            String route = getServletContext().getRealPath("/WEB-INF/vehicles.json");
            JsonVehicleManager.getInstance().setPath(route);
            switch(params) {
>>>>>>> mario
                case "advanced":
                    redirectTo = advanced;
                    break;
                default:
                    redirectTo = results;
<<<<<<< HEAD
            }
        } else {
            redirectTo = home;
        }
            RequestDispatcher dispatcher = request.getRequestDispatcher(redirectTo);
            dispatcher.forward(request, response);
=======
                    //System.out.println("Redirected to " + results + " with: " + params);
                    request.getSession().setAttribute("searchParams", params);
            }
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher(redirectTo);
        dispatcher.forward(request, response);
>>>>>>> mario
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
