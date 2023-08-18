import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/welcome")
public class WelcomePage extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");

        HttpSession session = req.getSession(false);
        PrintWriter writer = resp.getWriter();
        writer.println("<h2 style=\"color: green\">Welcome to the Bank </h2>"+session.getAttribute("username"));
        writer.println("<a href=\"logout\">Logout</a>");
    }
}
