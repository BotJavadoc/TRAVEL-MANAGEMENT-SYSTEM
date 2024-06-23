<%@page isErrorPage="false" errorPage="Error.jsp"%>
<%
	String path=new java.net.URL(request.getScheme(),request.getServerName(),request.getServerPort(),request.getContextPath()).toString();
	String member=session.getAttribute("Member")!=null?"Welcome "+session.getAttribute("Member").toString():"We Share a Vision";
	String client=session.getAttribute("Member")!=null?"<a href='"+path+"/Pages/Signout.jsp' class=caption>Sign Out From Here</a>":"<a href='"+path+"/Pages/About us.jsp' class=caption>Visit On Your Requirement</a>";
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

<TR bgcolor=#234567><TH valign=top width=150>Quick Links</TH><TH width=400><marquee direction=right><%=member%></marquee></TH><TH width=230><%=client%>&nbsp;&nbsp;|&nbsp;&nbsp;<a href="<%=path+"/index.jsp"%>" class=caption>Home</a></TH></TR></TABLE>
<TABLE width=780 align=center cellspacing=0 cellpadding=0><TR><TD>
<SCRIPT>
quickLinks("<%=path+"/Pages/"%>","<%=path+"/Images/Anniversary1.jpg"%>","<%=path+"/Images/trivendrum.jpg"%>");
</SCRIPT></TD><TD valign=top>
<TABLE WIDTH=580 align=center cellspacing=0 cellpadding=0 style="font:bold 11px verdana">
<TR><Td align=center><BR>Search&nbsp;:&nbsp;<input type=text name=search class=input>&nbsp;&nbsp;<input type=image src="<%=path+"/Images/Search.gif"%>" valign=middle>&nbsp;&nbsp;<a href='advanced.htm'>Advanced Search</a></Th></TR>
<TR><TD class=padd style='text-align:justify;color:navy;font:100 11px tahoma'><BR><B>Hotel Reservation</B><BR>
In order to provide the perfectly sounded travel experience, Grandtourtravels has its own hotels portfolio offering the highest standards in comfort, decor and service while super craftsmanship, professional managements and outstanding cuisine are notable highlights.<BR><BR>
<B>Money Saving Choices Rates Programs</b><br>
Ask for special offers from our company. Just call our reservations center for details<BR><BR>
<B>Business Rates</B><BR>
Business travelers Services discounted room rates and special amenities such as newspaper a piping hot cup of coffee and room upgrades when available.<BR><BR>
<B>Mature Travels Programs</B><Br>
Mature travelers here the opportunity for special treatment of you are 60+, you'll save up to 30% off you room rate with advance reservation, call and ask for 60+ rate. If you are 50+, we offer a 10% discount you sound call in advance. 10% saving on advance reservation: Save 10%on future hotel reservation when you call ahead.<br><BR>
<B>Educational & Training Trips</B><BR>
These travelers have the opportunity for special discount of 20% on your room rates<br><BR>
</TD></TR></TABLE>
<SCRIPT>setFooter("<%=path%>","<%=path+"/Images/Back.jpg"%>")</SCRIPT>


