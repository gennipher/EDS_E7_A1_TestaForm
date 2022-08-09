package br.edu.infnet.app;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.security.auth.message.callback.PrivateKeyCallback;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.lang.StringUtils;

@WebServlet(name = "CadastrarServlet", urlPatterns = {"/cadastrar"})
public class CadastrarServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        // 1 passo - Obter os dados do formulário:
        String nome = request.getParameter("nome");
        String senha = request.getParameter("senha");
        String cor = request.getParameter("cor");
        String [] planetas = request.getParameterValues("planetas");
        
        //2 passo - Validar os dados do formulário:
        ArrayList<String> erros = new ArrayList<>();
        if(StringUtils.isBlank(nome)) {
            // tem que adicionar a dependencia commons-lang
            erros.add("O campo Nome é obrigatório");
        } 
        if(StringUtils.isBlank(senha)) {
            erros.add("O campo Senha é obrigatório");
        } 
        
        //3 passo - Processar a requisição:
        // ...
        
        //4 passo - Colocar os objetos de resposta
        
        if(!erros.isEmpty()) {
            request.setAttribute("erros", erros);
            
        } else {
            request.setAttribute("sucesso", "Dados Cadastrados com sucesso!");
        }
        
        
        //5 passo - Redirecionar para a tela de resultado:
        RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
        rd.forward(request, response);
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
