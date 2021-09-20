import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "punto2", value = "/punto2")
public class HolaMundoRecargado extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("    <head>");
        out.println("        <meta charset=\"UTF-8\">");
        out.println("        <title>Punto 2</title>");
        out.println("    </head>");
        out.println("    <body>");
        out.println("        <h1><i>Hola Mundo Recargado</h1></i>");
        out.println("    </body>");
        out.println("</html>");
        out.close();
    }

}
