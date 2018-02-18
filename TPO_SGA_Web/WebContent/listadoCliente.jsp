<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List,dto.ClienteDTO,java.util.Iterator"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="BACKEND">
    <meta name="Suegar Armand Pilon" content="">
    <link rel="icon" href="img/favicon.ico">

    <title>Backend Dashboard</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="assets/css/dashboard.css" rel="stylesheet">

  </head>
<body>
    <nav class="navbar navbar-inverse navbar-fixed-top">
      <div class="container-fluid">
        <div class="navbar-header">
          <a class="navbar-brand" href="#">BACKEND</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav navbar-right">
            <li><a href="#">Log-out</a></li>
          </ul>
<!--           <form class="navbar-form navbar-right">
            <input type="text" class="form-control" placeholder="Search...">
          </form> -->
        </div>
      </div>
    </nav>

    <div class="container-fluid">
      <div class="row">
        <div class="col-sm-3 col-md-2 sidebar">
          <ul class="nav nav-sidebar">
            <li class="active"><a href="#">Menu Gestion<span class="sr-only">(current)</span></a></li>
            <li><a href="#">Usuarios</a></li>
            <li><a href="http://localhost/backend/app/clientes">Clientes</a></li>
            <li><a href="#">Proveedores</a></li>
            <li><a href="#">Pedidos</a></li>
          </ul>
        </div>
        <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
          <h2 class="sub-header">Dashboard</h2>
          <div class="table-responsive">
            <table class="table table-striped">
              <thead>
                <tr>
                  <th>Nro Cliente</th>
                  <th>Razon Social</th>
                  <th>Direccion</th>
                  <th>Localidad</th>
                  <th>Codigo Postal</th>
                  <th>Telefono</th>
                  <th>CUIT</th>
                  <th>Cond IVA </th>
                  <th>Cta Cte</th>
                  <th>
                </tr>
              </thead>
              <tbody>
               <%
					ClienteDTO cliente;
					List<ClienteDTO> clientes = (List<ClienteDTO>)request.getAttribute("clientes");
					for(Iterator<ClienteDTO> i = clientes.iterator(); i.hasNext();) {
						cliente = i.next();
				%>
                <tr>
                  <td><%=cliente.getNroCliente() %></td>
                  <td><%=cliente.getRazonSocial() %></td>
                  <td><%=cliente.getDireccion() %></td>
                  <td><%=cliente.getLocalidad() %></td>
                  <td><%=cliente.getCodPostal() %></td>
                  <td><%=cliente.getTelefono() %></td>
                  <td><%=cliente.getCuit() %></td>
                  <td><%=cliente.getCondIVA() %></td>
                  <td><%=cliente.getNroCtaCte() %></td>
                </tr>
                <%} %>
              </tbody>
            </table>
          </div>
        </div>
      </div>
    </div>

  <!-- Bootstrap core JavaScript
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery-1.11.3.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
</body>
</html>