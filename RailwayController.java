

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Servlet implementation class RailwayController
 */
public class RailwayController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RailwayController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		int pid=Integer.parseInt(request.getParameter("id"));
		String pname=request.getParameter("name");
		String pdate=request.getParameter("date");
		String pclass=request.getParameter("class");
		String psource=request.getParameter("source");
		String pdestination=request.getParameter("destination");
		
		
		
		Passenger pobj=new  Passenger(pname, pdate, pclass, psource, pdestination, pid);
		
		List<Passenger>lst=new ArrayList<Passenger>();
		lst.add(pobj);
		
		RailwayInterface ri=new RailwayInterfaceImpl();
		ri.bookTrain(lst);
		
		System.out.println(pid);
		
		
		
		
		response.sendRedirect("Reservation.html");
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
