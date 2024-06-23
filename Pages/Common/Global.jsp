<%
	String path=new java.net.URL(request.getScheme(),request.getServerName(),request.getServerPort(),request.getContextPath()).toString();
	String member=session.getAttribute("Member")!=null?"Welcome "+session.getAttribute("Member").toString():"We Share a Vision";
	String user=session.getAttribute("Member")!=null?session.getAttribute("Member").toString():"";
//	if(session.getAttribute("Member")==null) response.sendRedirect(path+"/Pages/Login.jsp");
%>
<LINK HREF="<%=path+"/Styles/Travel.css"%>" REL="STYLESHEET">
<BODY LEFTMARGIN=0 TOPMARGIN=0>
<TABLE WIDTH=780 align=center cellspacing=0 cellpadding=0>
<TR><TD valign=top>
					<img style="position:relative;top:-20px;left:20px;" valign=top src="<%=path+"/Images/Animsun.gif"%>" width="40" height="26">
					<img src="<%=path+"/Images/frontpage.gif"%>" alt="" width="356" height="71">
					<img src="<%=path+"/Images/Hdr_AS_Seal.jpg"%>" width="289" height="71">
					<img src="<%=path+"/Images/animated.gif"%>" width="67"  valign=top style="position:relative;top:-20px"></TD></TR></TABLE>
<SCRIPT SRC="<%=path+"/Scripts/Menubar.js"%>"></SCRIPT>
<TABLE WIDTH=780 align=center cellspacing=0 cellpadding=4 style="font:bold 11px verdana">
<TR bgcolor=#234567><TH valign=top width=150>Quick Links</TH><TH width=400><marquee direction=right><%=member%></marquee></TH><TH width=230><a href="<%=path+"/Pages/Signout.jsp"%>" class=caption>Sign Out From Here</a>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="<%=path+"/index.jsp"%>" class=caption>Home</a></TH></TR></TABLE>
<TABLE width=780 align=center cellspacing=0 cellpadding=0><TR><Th valign=top>
<SCRIPT>
quickLinks("<%=path+"/Pages/"%>","<%=path+"/Images/Anniversary1.jpg"%>","<%=path+"/Images/trivendrum.jpg"%>");
</SCRIPT></TD><TD valign=top>