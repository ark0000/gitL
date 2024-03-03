package co.eserv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.sound.midi.Soundbank;

/**
 * Servlet implementation class BatchServ
 */
@WebServlet(urlPatterns = {"/addBatch"})
public class BatchServ extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BatchServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
	      PrintWriter out=response.getWriter();
	      String batchname=request.getParameter("batchName");
	      String ins=request.getParameter("InsName");
	      String date=request.getParameter("Date");
	    String ch[] =request.getParameterValues("ch");
	 out.println(Arrays.toString(ch));
	   out.println(batchname);
	out.println(ins);
	 out.println(date);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
