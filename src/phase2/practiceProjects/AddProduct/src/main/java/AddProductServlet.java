import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.ecommerce.Product;

public class AddProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve form data
        String name = request.getParameter("name");
        BigDecimal price = new BigDecimal(request.getParameter("price"));
        String partsHdd = request.getParameter("partsHdd");
        String partsCpu = request.getParameter("partsCpu");
        String partsRam = request.getParameter("partsRam");

        // Create Product object
        Product product = new Product();
        product.setName(name);
        product.setPrice(price);
        product.setDateAdded(new Date());
        product.setPartsHdd(partsHdd);
        product.setPartsCpu(partsCpu);
        product.setPartsRam(partsRam);

        // Hibernate operations
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        // Save product to database
        session.save(product);

        // Commit transaction and close session
        transaction.commit();
        session.close();

        // Redirect back to addProduct.jsp
        response.sendRedirect("success.html");
    }
}
