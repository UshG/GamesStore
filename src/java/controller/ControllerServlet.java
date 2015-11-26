/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.ShoppingCart;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import session.GameFacade;
import session.WishListFacade;

/**
 *
 * @author Matt
 */
@WebServlet(name = "ControllerServlet",
                loadOnStartup = 1,
                urlPatterns = {"/shoppingCart", "/browseGames", "/checkout"})
public class ControllerServlet extends HttpServlet {

    private String surcharge;
    
    @EJB
    private GameFacade gameFacade;
    @EJB
    private WishListFacade wishListFacade;
    
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

        super.init(servletConfig);
        
        // initialize servlet with configuration information
        surcharge = servletConfig.getServletContext().getInitParameter("deliverySurcharge");
        
        // store game list in servlet context
        getServletContext().setAttribute("games", gameFacade.findAll());
    }
    
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
//    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
//            throws ServletException, IOException {
//        response.setContentType("text/html;charset=UTF-8");
//        PrintWriter out = response.getWriter();
//        try {
//            /* TODO output your page here. You may use following sample code. */
//            out.println("<!DOCTYPE html>");
//            out.println("<html>");
//            out.println("<head>");
//            out.println("<title>Servlet ControllerServlet</title>");            
//            out.println("</head>");
//            out.println("<body>");
//            out.println("<h1>Servlet ControllerServlet at " + request.getContextPath() + "</h1>");
//            out.println("</body>");
//            out.println("</html>");
//        } finally {
//            out.close();
//        }
//        String userPath = request.getServletPath();
//        HttpSession session = request.getSession();
//        
//        String url = userPath + ".jsp";
        
//        try {
//            request.getRequestDispatcher(url).forward(request, response);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }

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
        
//        processRequest(request, response);
        String userPath = request.getServletPath();
        HttpSession session = request.getSession();
       
        // if browseGames page is requested
        if (userPath.equals("/viewCart")) {
           
            String clear = request.getParameter("clear");
            
            if ((clear != null) && clear.equals("true")) {
                
                ShoppingCart cart = (ShoppingCart) session.getAttribute("cart");
                cart.clear();
            }

            userPath = "/cart";
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
