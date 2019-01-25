<!DOCTYPE html>
<html>
<head>
<style>

body {
	 background-image: url("https://portalregional.net.br/wp-content/uploads/2018/11/FARMACIA.jpg");
	 background-repeat: no-repeat;
    background-size: 100% 100%;
}
html {
    height: 100%
}
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
  margin-left:15%;
}

li a, .dropbtn {
  display: inline-block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover, .dropdown:hover .dropbtn {
  background-color: red;
}

li.dropdown {
  display: inline-block;
}

.dropdown-content {
  display: none;
  position: absolute;
  background-color: #f9f9f9;
  min-width: 160px;
  box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
  z-index: 1;
}

.dropdown-content a {
  color: black;
  padding: 12px 16px;
  text-decoration: none;
  display: block;
  text-align: left;
}

.dropdown-content a:hover {background-color: #f1f1f1}

.dropdown:hover .dropdown-content {
  display: block;
}
</style>
</head>
<body>

<ul>
  <li><a href="/Farmaciaspring/">Home</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Clientes</a>
    <div class="dropdown-content">
      <a href="/Farmaciaspring/clientes/form/">Cadastre-se</a>
      <a href="/Farmaciaspring/clientes/">Clientes Cadastrados</a>
    </div>
    </li>
    
    <li class="dropdown">
    <a href="javascript:void(1)" class="dropbtn">Produtos</a>
    <div class="dropdown-content">
      <a href="/Farmaciaspring/produtos/form/">Adicione Um Produto</a>
      <a href="/Farmaciaspring/produtos/">Produtos Disponiveis</a>
    </div>
    </li>
    
    <li class="dropdown">
    <a href="javascript:void(2)" class="dropbtn">Compras</a>
    <div class="dropdown-content">
      <a href="/Farmaciaspring/compras/form">Realizar Compra</a>
      <a href="/Farmaciaspring/compras/listar">Compras Realizadas</a>
    </div>
    </li>
 </ul>

</body>
</html>    

