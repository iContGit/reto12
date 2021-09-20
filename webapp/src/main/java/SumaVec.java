import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "punto5", value = "/punto5")



    public class SumaVec extends HttpServlet {
        private Integer numeros[];
        private Integer sumatoria;
        @Override
        public void init(ServletConfig conf) throws ServletException {
            super.init(conf);
            numeros = new Integer[10];
            sumatoria =0;

        }

      @Override
      protected void doGet (HttpServletRequest request, HttpServletResponse response) throws
        ServletException, IOException {
        numeros = new Integer[10];
        sumatoria =0;

          for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * 10 + 1);
                sumatoria += numeros[i];
            }
            PrintWriter out = response.getWriter();
            out.print("El numero generado del vector es: " + sumatoria);



      }



}
