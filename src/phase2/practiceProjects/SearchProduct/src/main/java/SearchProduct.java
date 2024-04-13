

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ecommerce.DbConnection;

/**
 * Servlet implementation class SearchProduct
 */
@WebServlet("/SearchProduct")
public class SearchProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String productId = request.getParameter("id");
		try
		{
			
			Connection con = DbConnection.getConnection();
            PreparedStatement psObj = con.prepareStatement("SELECT * FROM eproduct WHERE ID=?");
            psObj.setString(1, productId);
            
            ResultSet rs = psObj.executeQuery();
            
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            
            if (rs.next()) 
            {
                String productName = rs.getString("name");
                double productPrice = rs.getDouble("price");
                String dateAdded = rs.getString("date_added");

                out.println("<h2>Product Details</h2>");
                out.println("<p><strong>Name:</strong> " + productName + "</p>");
                out.println("<p><strong>Price:</strong> $" + productPrice + "</p>");
                out.println("<p><strong>Date Added:</strong> " + dateAdded + "</p>");
            } 
            else 
            {
                out.println("<p>No product found with ID: " + productId + "</p>");
            }

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
