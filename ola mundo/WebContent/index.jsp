<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% 
	String metodo = (String) request.getAttribute("cliMetodo");
	String uri = (String) request.getAttribute("cliUri");
	String protocolo = (String) request.getAttribute("cliProtocolo");

	String host = (String) request.getAttribute("cliHost");
	String ua = (String) request.getAttribute("cliUa");
	String ae = (String) request.getAttribute("cliAe");
	String al = (String) request.getAttribute("cliAl");
%>

<p>i. <% if(metodo != null) out.print(metodo); %><% if(host != null)out.print(host); %> </p>
<p>ii. <% if(uri != null) out.print(uri); %><% if(ua != null) out.print(ua); %> </p>
<p>iii. <% if(protocolo != null) out.print(protocolo); %><% if(ae != null) out.print(ae); %> </p>
<p><% if(al != null) out.print("iv. "+ al); %></p>

</body>
</html>