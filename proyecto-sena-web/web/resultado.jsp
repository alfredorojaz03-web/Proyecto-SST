<%@ page contentType="text/html;charset=UTF-8" %>
<html>
<head>
    <title>Resultado</title>
</head>
<body>

<%
    Boolean guardado = (Boolean) request.getAttribute("guardado");
%>

<% if (guardado != null && guardado) { %>
    <h2> Incidente guardado correctamente</h2>
<% } else { %>
    <h2> Error al guardar el incidente</h2>
<% } %>

<a href="index.html">Volver</a>

</body>
</html>
