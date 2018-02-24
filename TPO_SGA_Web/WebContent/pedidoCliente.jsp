<%@page import="javafx.scene.control.Alert"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List"%>
<%@ page import="dto.ClienteDTO"%>
<%@ page import="java.util.Iterator"%>
<%@ page import="businessDelegate.BusinessDelegate"%>


<!DOCTYPE html>
<!--
This is a starter template page. Use this page to start your new project from
scratch. This page gets rid of all links and provides the needed markup only.
-->
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Die Verrückte Dose | Sistema </title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <link rel="stylesheet" href="assets/bootstrap/dist/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="assets/font-awesome/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="assets/Ionicons/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="dist/css/AdminLTE.min.css">
  <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
        page. However, you can choose any other skin. Make sure you
        apply the skin class to the body tag so the changes take effect. -->
  <link rel="stylesheet" href="dist/css/skins/skin-blue.min.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->

  <!-- Google Font -->
  <link rel="stylesheet"
        href="https://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,600,700,300italic,400italic,600italic">
</head>

<body class="hold-transition skin-blue sidebar-mini">
<%
        		ClienteDTO cliente = new ClienteDTO();
    			cliente =(ClienteDTO) request.getSession().getAttribute("user");
    			
%>
<div class="wrapper">

  <!-- Main Header -->
  <header class="main-header">

    <!-- Logo -->
    <a href="#" class="logo">
      <!-- mini logo for sidebar mini 50x50 pixels -->
      <span class="logo-mini"><b>D</b>VD</span>
      <!-- logo for regular state and mobile devices -->
      <span class="logo-lg"><b>Die Verrückte Dose</b></span>
    </a>

    <!-- Header Navbar -->
    <nav class="navbar navbar-static-top" role="navigation">
      <!-- Sidebar toggle button-->
      <a href="#" class="sidebar-toggle" data-toggle="push-menu" role="button">
        <span class="sr-only">Toggle navigation</span>
      </a>
      <!-- Navbar Right Menu -->
      <div class="navbar-custom-menu">
        <ul class="nav navbar-nav">
          <li class="dropdown user user-menu">
            <!-- Menu Toggle Button -->
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
              <!-- The user image in the navbar-->
              <img src="dist/img/<%=cliente.getNroCliente()%>.jpg" class="user-image" alt="User Image">
              <!-- hidden-xs hides the username on small devices so only the image appears. -->
              <span class="hidden-xs"><%=cliente.getRazonSocial() %></span>
            </a>
            <ul class="dropdown-menu">
              <!-- The user image in the menu -->
              <li class="user-header">
                <img src="dist/img/<%=cliente.getNroCliente()%>.jpg" class="img-circle" alt="User Image">

                <p>
                  <%=cliente.getRazonSocial() %>
                  <small>Miembro desde Agosto-2016</small>
                </p>
              </li>
              <!-- Menu Footer-->
              <li class="user-footer">
                <div class="pull-right">
                  <a href="index.jsp" class="btn btn-default btn-flat">Salir</a>
                </div>
              </li>
            </ul>
          </li>
        </ul>
      </div>
    </nav>
  </header>
  <!-- Left side column. contains the logo and sidebar -->
  <aside class="main-sidebar">

    <!-- sidebar: style can be found in sidebar.less -->
    <section class="sidebar">

      <!-- Sidebar user panel (optional) -->
      <div class="user-panel">
        <div class="pull-left image">
          <img src="dist/img/<%=cliente.getNroCliente()%>.jpg" class="img-circle" alt="User Image">
        </div>
        <div class="pull-left info">
          <p>Cliente</p>
        </div>
      </div>

      <!-- Sidebar Menu -->
      <ul class="sidebar-menu" data-widget="tree">
        <!-- Optionally, you can add icons to the links -->
        <li class="active"><a href="#"><i class="fa fa-link"></i> <span>Agregar Pedido</span></a></li>
      
      </ul>
      <!-- /.sidebar-menu -->
    </section>
    <!-- /.sidebar -->
  </aside>

  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">

    <!-- Main content -->
    <section class="content container-fluid">
      	<section class="content-header">
      	<h1>
    	   <%=cliente.getRazonSocial() %>
    	</h1>
    	</section>

    	<!-- Main content -->
        <div class="col-md-6.invoice-col">
        	
			<br>
			<br>
			<%=cliente.getDireccion() %>
			<br>
			<%=cliente.getLocalidad() %>
			<br>
			<%=cliente.getCodPostal() %>
			<br>
			<%=cliente.getTelefono() %>
			<br>
			<%=cliente.getCuit() %>
			<br>
			<%=cliente.getCondIVA() %>
			<br>
			<%=cliente.getLimiteDeCredito() %>
			<br>
			<%=cliente.getSaldo() %>
        </div>
            
    
    	<section class="content-header">
     		<h3>Pedido Articulos</h3>
		</section>
	</section>
    <!-- /.Datos Cliente -->
    <section class="content container-fluid">
      	<div class="row">
      	  <div class="col-md-12">
      	    <div class="box box-primary">
      		  <div class="box-body">
	      	    <div role="form">
	      		  <table id="pedidoCli" class="table table-bordered table-hover">
				    <thead>
					  <tr>
					    <th style="width:60px">#</th>
					    <th>Articulo</th>
			     	  </tr>
				    </thead>
					<tbody>
					  <tr>
					  	<td><input type="text" style="width:60px" class="form-control" placeholder=""></td>
					    <td> 
						  <div class="form-group">
						    <select class="form-control" name="">
			                  <option>option 1</option>
			                  <option>option 2</option>
			                  <option>option 3</option>
			                  <option>option 4</option>
			                  <option>option 5</option>
			                  <option>option 1</option>
			                  <option>option 2</option>
			                  <option>option 3</option>
			                  <option>option 4</option>
			                  <option>option 5</option>
			                  <option>option 1</option>
			                  <option>option 2</option>
			                  <option>option 3</option>
			                  <option>option 4</option>
			                  <option>option 5</option>
		                    </select>
		                  </div>
		               </td>
	            	  </tr>
	                </tbody>
	              </table>
					         <table>
					        	<tr>
					        		<td><button type="button" style='width:100px; height:30px' class="btn btn-block btn-primary">Agregar</button></td>
					        		<td>&nbsp;&nbsp;&nbsp;</td>
					        		<td><button type="button" style='width:150px; height:30px' class="btn btn-block btn-primary">Confirmar Pedido</button></td>
					        	</tr>	
					        </table>
	      		</div>
	      	  </div>
	      	</div>
	      </div>
	    </div>
	</section>
    <!-- /.content -->
  </div>
  <!-- /.content-wrapper -->  

  <!-- Main Footer -->
  <footer class="main-footer">
    <!-- Default to the left -->
    <strong>Copyright &copy; 2018 Grupo N°1 - Applicaciones Distribuidas - UADE.</strong>
  </footer>
  <!-- Add the sidebar's background. This div must be placed
  immediately after the control sidebar -->
  <div class="control-sidebar-bg"></div>
</div>
<!-- ./wrapper -->

<!-- REQUIRED JS SCRIPTS -->

<!-- jQuery 3 -->
<script src="assets/jquery/dist/jquery.min.js"></script>
<!-- Bootstrap 3.3.7 -->
<script src="assets/bootstrap/dist/js/bootstrap.min.js"></script>
<!-- AdminLTE App -->
<script src="dist/js/adminlte.min.js"></script>

<!-- Optionally, you can add Slimscroll and FastClick plugins.
     Both of these plugins are recommended to enhance the
     user experience. -->
</body>
</html>