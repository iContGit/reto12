import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "punto4", value = "/punto4")
public class RaizCuad extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String var = request.getParameter("numero");
        Double nraiz = Math.sqrt(Double.parseDouble(var));
        var = nraiz.toString();

        try (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title>Punto 4</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1><i>Respuesta al punto 4</h1></i>");
            out.println("        <ul>");
            out.println("            <li>La raiz cuadrada del numero es: " + var + "</li>");
            out.println("        </ul>");
            out.println("    </body>");
            out.println("</html>");


        }

    }
}
