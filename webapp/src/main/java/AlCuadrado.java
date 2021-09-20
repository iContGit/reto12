import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "punto3", value = "/punto3")
public class AlCuadrado extends HttpServlet {
    @Override


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        String var = request.getParameter("numero");
        Integer ncuadrado = Integer.parseInt(var) * Integer.parseInt(var);
        var = ncuadrado.toString();
        PrintWriter out = response.getWriter();
        out.print("El numero al cuadradrado es: "+ var);



/* protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        //String var = request.getParameter("numero");
        //Integer ncuadrado = Integer.parseInt(var) * Integer.parseInt(var);
        //var = ncuadrado.toString();

        }*/

        /*try
            (PrintWriter out = response.getWriter()){
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("    <head>");
            out.println("        <meta charset=\"UTF-8\">");
            out.println("        <title>Punto 3</title>");
            out.println("    </head>");
            out.println("    <body>");
            out.println("        <h1><i>Respuesta al punto 3</h1></i>");
            out.println("        <ul>");
            out.println("            <li>El cuadrado del número es: " + var + "</li>");
            out.println("        </ul>");
            out.println("    </body>");
            out.println("</html>");
            out.close();

        }*/
    }
}
