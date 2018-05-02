import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", urlPatterns = "/display-discount")
public class DiscountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String productDescription = request.getParameter("ProductDescription");
        double listPrice = Double.parseDouble(request.getParameter("ListPrice"));
        double discountPercent = Double.parseDouble(request.getParameter("DiscountPercent"));

        PrintWriter writer = response.getWriter();
        double discountAmount = listPrice * discountPercent * 0.1;
        double discountPrice = listPrice - discountAmount;
        writer.print("<html>");
        writer.print("<h1>" + "Product Description: " + productDescription + "</h1>");
        writer.print("<h1>" + "List Price: " + listPrice + "</h1>");
        writer.print("<h1>" + "Discount Percent: " + discountPercent + "</h1>");
        writer.print("<h1>" + "Discount Amount: " + discountAmount + "</h1>");
        writer.print("<h1>" + "Discount Price: " + discountPrice + "</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
