/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculatorlabs.controller;

import com.mycompany.calculatorlabs.model.CalculatorService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Roshan
 */
@WebServlet(name = "CalculatorController", urlPatterns = {"/calculator"})
public class CalculatorController extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    private static final String RESULT_PAGE = "/result.jsp";
    private static final String REC_TYPE = "Rec";
    private static final String CIR_TYPE = "Cir";
    private static final String TRI_TYPE = "Tri";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String calType = request.getParameter("calType");
        String des = request.getParameter("destination");
        

            CalculatorService calculator = new CalculatorService();
            if (calType.equalsIgnoreCase(CIR_TYPE)){
                String radius = request.getParameter("radius");
                
                String cirArea = calculator.calculateArea(radius);
                request.setAttribute("cirArea" , cirArea);
            
            } else if (calType.equalsIgnoreCase(TRI_TYPE)){
                String length1 = request.getParameter("length1");
                String length2 = request.getParameter("length2");
                
                String triHypotenuseSide = calculator.calculateHypotenuseSide(length1, length2);
                request.setAttribute("triHypotenuse" , triHypotenuseSide);

            } else if (calType.equalsIgnoreCase(REC_TYPE)){
                String length = request.getParameter("length");
                String width = request.getParameter("width");
        
            
                String area = calculator.calculateArea(length, width);
                request.setAttribute("recArea" , area);

            }

        
        if (des.equalsIgnoreCase("result")){
           RequestDispatcher view = request.getRequestDispatcher(RESULT_PAGE);
           view.forward(request, response); 
        } else if (des.equalsIgnoreCase("lab2")){
            RequestDispatcher view = request.getRequestDispatcher("/lab2.jsp");
                view.forward(request, response);
            
        }else {
                RequestDispatcher view = request.getRequestDispatcher("/lab3.jsp");
                view.forward(request, response);
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
