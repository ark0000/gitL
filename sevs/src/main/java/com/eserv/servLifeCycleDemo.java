package com.eserv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class servLifeCycleDemo
 */
@WebServlet(urlPatterns = "/lifeDemo")
public class servLifeCycleDemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servLifeCycleDemo() {
        super();
        // TODO Auto-generated constructor stub
    }

           @Override
        public void init() throws ServletException {
        	// TODO Auto-generated method stub
        System.out.println("FIRST INIT");
        }
           @Override
        public void destroy() {
        	// TODO Auto-generated method stub
        	   System.out.println("FIRST DESTROY");
        }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("inside Do get");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("inside Do POST");
	}

}
