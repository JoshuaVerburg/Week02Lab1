/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 727334
 */
public class AgeCalculatorServet extends HttpServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //retrieves age
        String age = request.getParameter("age");
         
        if (age == null) {
                    getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

        }
        
        //validation
        if (age.isEmpty()) {
             // set error message
             request.setAttribute("errorMessage", "Please enter a value.");
             // forward the request back to index.jsp
             getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);
             // stop other execution of code
             return;
         }

        int n = Integer.parseInt(age);
        n = n+1;
        request.setAttribute("age", "Your age next birthday will be " + n);
        getServletContext().getRequestDispatcher("/WEB-INF/ageCalculator.jsp").forward(request, response);

                
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // TODO
    }
    
}
