package com.banana.java;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by bellis on 4/19/17.
 */
public class HelloWorld extends HttpServlet{



    public HelloWorld() {


        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{


        response.setContentType("text/html");
        PrintWriter printWriter = response.getWriter();
        printWriter.println("<h>Howdie Y'all</h>");

    }

    //protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{

   // }

}
