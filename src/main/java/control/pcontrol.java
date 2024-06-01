package control;

import javax.servlet.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter("/pcontrol")

public class pcontrol implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // Initialization code, if any
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setHeader("Content-Security-Policy", "directive-value");
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {
        // Cleanup code, if any
    }
}
