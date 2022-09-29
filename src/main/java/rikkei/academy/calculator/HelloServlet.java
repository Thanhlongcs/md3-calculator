package rikkei.academy.calculator;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DiscountServlet", value = "/display-discount")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String proDes = req.getParameter("proDes");
        PrintWriter writer = resp.getWriter();
        try {
            float listPrice = Float.parseFloat(req.getParameter("listPrice"));
            float disPer = Float.parseFloat(req.getParameter("disPer"));
            float disAmount = (float) (listPrice*disPer*0.01);
            float disPrice = listPrice-disAmount;
            writer.println("<html>");
            writer.println("<h1> product description: "+ proDes+"</h1>");
            writer.println("<h1> List Price: "+ listPrice+"</h1>");
            writer.println("<h1> discount percent: "+ disPer+"</h1>");
            writer.println("<h1> discount amount: "+ disAmount+"</h1>");
            writer.println("<h1> discount price: "+ disPrice+"</h1>");
            writer.println("</html>");
        }catch (Exception ex){
            ex.getMessage();
            writer.println("1xbet - where future billionaire begin" +
                    "( noi san sinh ra nhung ty phu tuong lai):" +
                    " vui long nhap vao so tien de tiep tuc bet!!!");
        }

    }

    public void destroy() {
    }
}