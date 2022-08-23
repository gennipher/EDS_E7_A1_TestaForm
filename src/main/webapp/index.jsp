<%@page import="java.util.Date"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Testa Form</title>
    </head>
    <body>
        <h1>Testa Form</h1>
        <hr />
        
        <h2><%= new Date() %></h2>
        
        <form action="cadastrar" method="post">
            <table>
                <tr>
                    <td>Nome:</td>
                    <td>
                        <input 
                            type="text" 
                            name="nome" 
                            maxlength="50" 
                            size="50"
                        />
                    </td>
                </tr>
                <tr>
                    <td>Senha:</td>
                    <td>
                        <input 
                            type="password" 
                            name="senha" 
                            maxlength="10" 
                            size="10"
                        />
                    </td>
                </tr>
                <tr>
                    <td>Cor:</td>
                    <td>
                        <input type="radio" name="cor" value="vermelho" /> Vermelho 
                        <input type="radio" name="cor" value="verde" /> Verde 
                        <input type="radio" name="cor" value="azul" /> Azul 
                    </td>
                </tr>
                <tr>
                    <td>Planetas:</td>
                    <td>
                        <Select name="planetas" size="4" multiple>
                            <option>Mercúrio</option>
                            <option>Vênus</option>
                            <option>Terra</option>
                            <option>Marte</option>
                            <option>Saturno</option>
                            <option>Júpter</option>
                            <option>Urano</option>
                            <option>Neturno</option>
                        </Select>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="Cadastrar" />
                    </td>
                </tr>
            </table>
        </form>
        <h3 style="color: red">${erros}</h3>
        <h3 style="color: green">${sucesso}</h3>
    </body>
</html>
