package controller;


import DAO.json.UserDAO;
import com.hasher.Hasher;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.User;

/**
 *  @author Mario Carranza Mena B51573
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {
    
    private final String HOME_PAGE = "index.jsp";
    private final String LOGIN_ERROR_PAGE = "pages/loginError.jsp";
    private final String LOGIN_PAGE = "pages/login.jsp"; // <-- Used as a fallback
    private UserDAO udao = new UserDAO();
    
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
            out.println("<title>Servlet LoginServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet LoginServlet at " + request.getContextPath() + "</h1>");
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
        String pass = request.getParameter("password");
        String email = request.getParameter("username");
        String passHash = Hasher.getInstance().getHash(pass);
        System.out.println("LOGIN FORM INPUT DATA:\nEmail " + email + "\nPass Hash: " + passHash);
        
        String redirectAddress = LOGIN_PAGE; // <-- Redirect to Login by default as a fallback
        
        if (pass != null && email != null) {
            System.out.println("LOGIN FORM INPUT DATA:\nEmail " + email + "\nPass: " + pass);
            User user = udao.search(email);
            if (user != null) {
                if (passHash.equals(user.getPassword())) {
                    redirectAddress = HOME_PAGE; // <-- Good Login
                    request.getSession().setAttribute("loggedUser", user);  
                } else {
                    redirectAddress = LOGIN_ERROR_PAGE; // <-Failed Attemp to login
                }
            }
        } else {
            redirectAddress = LOGIN_ERROR_PAGE; // <-- Data omision generates page "reload"
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
