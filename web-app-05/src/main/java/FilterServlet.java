import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
import java.io.PrintWriter;

@WebFilter(urlPatterns = {"/second"})
public class FilterServlet implements Filter {
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init method of security filter");
    }

    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("security filter");
        PrintWriter writer = servletResponse.getWriter();
        writer.println("Security filter request");

        filterChain.doFilter(servletRequest, servletResponse);

        writer.println("Security response check");
    }

    public void destroy() {
        System.out.println("destroy method of filter");
    }
}
