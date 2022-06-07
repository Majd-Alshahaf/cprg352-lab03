
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class AgeCalculatorServlet extends HttpServlet{

  
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        getServletContext().getRequestDispatcher("/WEB-INF/Calculators.jsp").forward(request,response);
        return;
    }

   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
       String ageStr =  request.getParameter("age");
       
       if(ageStr == null || ageStr.equals("")){
       String message = "You must enter an age";
       request.setAttribute("message", message);
       
       getServletContext().getRequestDispatcher("/WEB-INF/Calculators.jsp").forward(request,response);
       return;
       }
       
      
       try{
       if(Integer.parseInt(ageStr)<0){
       String message = "You must enter a positive age";
       request.setAttribute("message", message);
       
       getServletContext().getRequestDispatcher("/WEB-INF/Calculators.jsp").forward(request,response);
       return;
       }
       String nextAge = "Your age next birthday will be";
       int age = Integer.parseInt(ageStr);
       age++;
       request.setAttribute("age", age);
       request.setAttribute("nextAge", nextAge);
       }
       catch(Exception e){
       String message = "You must enter a numeric value";
       request.setAttribute("message", message);
       
       getServletContext().getRequestDispatcher("/WEB-INF/Calculators.jsp").forward(request,response);
       return;
       }
       
      
      
   
       
       
       
       
       
       
       
       
       
        
        
        getServletContext().getRequestDispatcher("/WEB-INF/Calculators.jsp").forward(request,response);
        
       
    }

    

}

