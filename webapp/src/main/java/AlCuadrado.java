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




    }
}
