package pl.sdacademy;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DodajServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest reqest, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("doGet");
        int x = Integer.parseInt(reqest.getParameter("p1")) + Integer.parseInt(reqest.getParameter("p2"));
        response.getWriter().println("<HTML><body><h1>" + x + "</h1></body></HTML>");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Servlet " + this.getServletName() + " has started");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost");
        int x = Integer.parseInt(req.getParameter("p1")) + Integer.parseInt(req.getParameter("p2"));
        resp.getWriter().println("<HTML><body><h1>" + x + "</h1></body></HTML>");
    }

    @Override
    public void destroy() {
        System.out.println("Servlet " + this.getServletName() + " has stopped");
    }

}
