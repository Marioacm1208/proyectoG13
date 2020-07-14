/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.json.JsonUserManager;
import DAO.json.JsonVehicleManager;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Mario Carranza Mena B51573
 */
@WebServlet(name = "Controller", urlPatterns = {"/Controller"})
public class Controller extends HttpServlet {

    final String HOME_PAGE = "index.jsp";
    final String LOGIN_PAGE = "pages/login.jsp";
    final String SHOW_UNITS = "pages/unitsList.jsp";
    final String SEARCH_PAGE = "pages/search.jsp";
    final String SELLS_REP = "pages/sellsReports.jsp"; 
    final String REPORTS_PAGE = "pages/reports.jsp";
    final String PROFILE_PAGE = "pages/profile.jsp";

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
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
            out.println("<title>Servlet Controller</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Controller at " + request.getContextPath() + "</h1>");
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
        String action = request.getParameter("action");
        String redirectAddress = HOME_PAGE; // <--- redirect to HomePage by defaul as a fallback
        if (action != null) {
            JsonUserManager.getInstance().setPath(getServletContext().getRealPath("/WEB-INF/users.json"));
            JsonVehicleManager.getInstance().setPath(getServletContext().getRealPath("/WEB-INF/vehicles.json"));
            switch(action.toLowerCase()) {
                case "list":
                    redirectAddress = SHOW_UNITS;
                break;

                case "search":
                    redirectAddress = SEARCH_PAGE;
                break;

                case "login":
                    redirectAddress = LOGIN_PAGE;
                    break;
                    
                case "profile":
                    redirectAddress = PROFILE_PAGE;
                    break;
                case "reports":
                    redirectAddress = REPORTS_PAGE;
                    break;
                case "home":
                    redirectAddress = HOME_PAGE;
                    break;
                case "logout":
                    request.getSession().invalidate();
                    // And just to be shure session invalitation deletes all info about session variables...
                    request.getSession().removeAttribute("loggedUser");
                    break;
                    
                case "reports":
                    redirectAddress = SELLS_REP;
                    break;
                default:
                    redirectAddress = HOME_PAGE;
            }
        }
        RequestDispatcher requestDispatcher = request.getRequestDispatcher(redirectAddress);
        requestDispatcher.forward(request, response);
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