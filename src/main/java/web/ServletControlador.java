package web;

import datos.ClienteDaoJDBC;
import dominio.Cliente;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        try {
            List<Cliente> clientes = new ClienteDaoJDBC().listar();
            System.out.println("clientes = " + clientes);
            request.setAttribute("clientes", clientes);
            request.setAttribute("totalClientes", clientes.size());
            request.setAttribute("saldoTotal", calcularSaldoTotal(clientes));
            request.getRequestDispatcher("clientes.jsp").forward(request, response);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    private double calcularSaldoTotal(List<Cliente> clientes){
        double saldoTotal = 0;
        
        for(Cliente cliente : clientes){
            saldoTotal += cliente.getSaldo();
        }
        return saldoTotal;
    }
}
