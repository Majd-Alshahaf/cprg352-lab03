
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String message = "---";
            request.setAttribute("message", message);
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
       return;
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String operation = request.getParameter("operations");
        
        String firstStr = request.getParameter("firstNum");
        String secondStr = request.getParameter("secondNum");
        
       
       
        
        

        
         request.setAttribute("firstVal", firstStr);
         request.setAttribute("secondVal", secondStr);
        
        String message;
        //if First && Second == null
        if(firstStr == null || secondStr == null || firstStr.equals("") || secondStr.equals("")){
           
            message = "invalid";
            
           
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
        }
        
        
        try{
            int first = Integer.parseInt(firstStr);
            int second = Integer.parseInt(secondStr);
        }
        catch(Exception e){
            message = "invalid";
        
            request.setAttribute("message", message);
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
        return;
        }
        
             if(operation != null && operation.equals("+")){
            int first = Integer.parseInt(firstStr);
            int second = Integer.parseInt(secondStr);
            
            int total = first + second;
           
            request.setAttribute("total", total);
        }
        else if(operation != null && operation.equals("-")){
            int first = Integer.parseInt(firstStr);
            int second = Integer.parseInt(secondStr);
            
            int total = first - second;
            
            request.setAttribute("total", total);
        }
        else if(operation != null && operation.equals("*")){
            int first = Integer.parseInt(firstStr);
            int second = Integer.parseInt(secondStr);
            
            int total = first * second;
           
            request.setAttribute("total", total); 
        }
        else if(operation != null && operation.equals("%")){
            int first = Integer.parseInt(firstStr);
            int second = Integer.parseInt(secondStr);
            
            int total = first / second;
       
            request.setAttribute("total", total);
        }

        
   
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
       getServletContext().getRequestDispatcher("/WEB-INF/arithmeticcalculator.jsp").forward(request,response);
    }



}
