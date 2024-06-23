import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class status extends HttpServlet {

    public void init(ServletConfig config)
    	throws ServletException {
    		super.init(config);
    	}
    
    public void doGet(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("<head>");
        out.println("<title>Hello World!</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Hello World!</h1>");
        out.println("Your request was"+ request.getMethod()+"\n");
        out.println("</body>");
        out.println("</html>");
    }
    
    public void doPost(HttpServletRequest request, HttpServletResponse response)
    throws IOException, ServletException
    {
        Connection c=null;
        
        String pnr=request.getParameter("pnr");
        String pnrk=request.getParameter("pnrk");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String query =null;
        int n;
        int pnr1=Integer.parseInt(pnr);
        int pnr2=Integer.parseInt(pnrk);
   		try{
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c= DriverManager.getConnection("jdbc:odbc:ITMNGMNT","grandtour","grandtour");
            Statement st =c.createStatement();
            query = new String("select * from trainbooking where pnrno1 =("+pnr1+")" );
            ResultSet rs= st.executeQuery(query);                                            
            n=0; 
            if(rs.next())
                n=1; 
            query = new String("select * from trainbooking where pnno2 =("+pnr2+")" );
                  ResultSet rs1= st.executeQuery(query);  
            if(rs1.next() && n==1)
            {
                        
                 
out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
out.println("<html>");
out.println("<head>");
out.println("<title>pnrstatus</title>");
out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">");
out.println("<SCRIPT>");
out.println("function doClear()");
out.println("{       ");
out.println("document.mainform.pnr.value = \"\";");
out.println("document.mainform.pnrk.value = \"\";");
out.println("}");
out.println("function doSubmit()");
out.println("{");
out.println("var strErrMsg;         ");
out.println("strErrMsg = \"\";          ");
out.println("strErrMsg = doValidations();");
out.println("if (strErrMsg == \"\" )");
out.println("{                          ");
out.println("document.mainform.action = \"\";               ");
out.println("document.mainform.submit();");
out.println("}");
out.println("else");
out.println("{alert(strErrMsg);}");
out.println("}");
out.println("function doValidations()");
out.println("{");
out.println("var ddIndex;");
out.println("var strTemp;");
out.println("var strFld;");
out.println("var frmDoc;");
out.println("var strErrMsg;");
out.println("strErrMsg = \"\";");
out.println("frmDoc = document.mainform;            ");
out.println("strFld = frmDoc.pnr");
out.println("if (strFld.value == \"\") ");
out.println("{                      ");
out.println("strErrMsg = strErrMsg + \"Please enter the pnr number\n\";");
out.println("}          ");
out.println("/*strFld = frmDoc.pnrk");
out.println("if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter password\n\"; */");
out.println("return strErrMsg;");
out.println("}");
out.println("</SCRIPT>");
out.println("</head>");
out.println("<body bgcolor=\"#FFFFFF\">");
out.println("<FORM name=mainform method=post>");
out.println("<div align=\"center\"> ");
out.println("<center>");
out.println("<div align=\"center\">");
out.println("<center>");
out.println("<TABLE cellSpacing=0 cellPadding=0 width=750 border=0 style=\"border-collapse: collapse\" bordercolor=\"#111111\">");
out.println("<TBODY>");
out.println("<TR> ");
out.println("<TD class=header><img src=\"http://localhost:2008/hcutravels/images/frontpage.gif\" alt=\"\" width=\"386\" height=\"71\"><img src=\"http://localhost:2008/hcutravels/images/Hdr_AS_Seal.jpg\" width=\"289\" height=\"71\"> ");
out.println("<img src=\"http://localhost:2008/hcutravels/images/1animated12-thumb%5B1%5D.gif\" width=\"67\" height=\"50\"> ");
out.println("</TD>");
out.println("</TR>");
out.println("</TBODY>");
out.println("</TABLE>");
out.println("</center>");
out.println("</div>");
out.println("<p align=\"left\"><font face=\"arial\" size=\"2\"> ");
out.println("<marquee behavior=\"scroll\" style=\"font-family: Courier New; color: #333300; text-decoration: blink; font-size: 18pt; font-style: italic; font-weight: bold\">");
out.println("we share a visi<img src=\"http://localhost:2008/hcutravels/images/Animsun.gif\" width=\"50\" height=\"26\">n ");
out.println("</marquee>");
out.println("</font></p>");
out.println("<div align=\"center\">");
out.println("<center>");
out.println("<p align=\"left\"><font face=\"arial\" size=\"2\">");
out.println("<marquee behavior=\"scroll\" style=\"font-family: Courier New; color: #333300; text-decoration: blink; font-size: 18pt; font-style: italic; font-weight: bold\">");
out.println("</marquee>");
out.println("</font></p>");
out.println("</center>");
out.println("</div>");
out.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
out.println("<tr bordercolor=\"#CCCCCC\" bgcolor=\"#000099\"> ");
out.println("<td width=\"10%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/home.htm\"><font color=\"#FFFFFF\" size=\"5\">Home</font></a></div></td>");
out.println("<td width=\"14%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/services.htm\"><font color=\"#FFFFFF\" size=\"5\">Services</font></a></div></td>");
out.println("<td width=\"25%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/packagefinal.htm\"><font color=\"#FFFFFF\" size=\"5\">Holiday ");
out.println("Packages </font></a></div></td>");
out.println("<td width=\"11%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/faq.htm\"><font color=\"#FFFFFF\" size=\"5\">FAQs</font></a></div></td>");
out.println("<td width=\"25%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/register.htm\"><font color=\"#FFFFFF\" size=\"5\">Register ");
out.println("Yourself</font></a></div></td>");
out.println("<td width=\"15%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/aboutus.htm\"><font color=\"#FFFFFF\" size=\"5\">About ");
out.println("Us</font></a></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td colspan=\"6\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
out.println("<tr bgcolor=\"#0000CC\"> ");
out.println("<td width=\"21%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/acc.htm\"><font color=\"#FFFFFF\" size=\"4\"> ");
out.println("Accommodation</font></a></div></td>");
out.println("<td width=\"24%\" bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travel.htm\"><font color=\"#FFFFFF\" size=\"4\"> ");
out.println("Traveling Means</font></a></div>");
out.println("<div align=\"center\"></div></td>");
out.println("<td width=\"25%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travelguide.htm\"><font color=\"#FFFFFF\" size=\"4\">Travel ");
out.println("Guide</font></a></div></td>");
out.println("<td width=\"30%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travelinsurance.htm\"><font color=\"#FFFFFF\" size=\"4\">Travel ");
out.println("Insurance</font></a></div></td>");
out.println("</tr>");
out.println("</table></td>");
out.println("</tr>");
out.println("</table>");
out.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
out.println("<tr bgcolor=\"#3333FF\"> ");
out.println("<td bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/car.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
out.println("Car</font></a></div></td>");
out.println("<td bgcolor=\"#3399FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/train.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
out.println("Train</font></a></div></td>");
out.println("<td bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/flight.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
out.println("Flight</font></a></div></td>");
out.println("<td> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/cruise.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
out.println("Cruises</font></a></div></td>");
out.println("</tr>");
out.println("</table>");
out.println("<p align=\"center\"><font face=\"arial\" size=\"2\"> ");
out.println("<marquee behavior=\"scroll\" style=\"font-family: Courier New; color: #333300; text-decoration: blink; font-size: 18pt; font-style: italic; font-weight: bold\">");
out.println("</marquee>");
out.println("</font><span class=\"style1\"><u><font color=\"#990000\" size=\"6\">Passenger ");
out.println("Status </font></u></span></p>");
out.println("</center>");
out.println("</div>");
out.println("<table width=\"746\" height=\"137\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FF99FF\">");
out.println("<tr> ");
out.println("<td width=\"268\" height=\"137\"> ");
out.println("<table width=\"119%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FF99FF\">");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFCCFF\"> ");
out.println("<div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/passengerstatus.htm\">Passenger ");
out.println("Status</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"><div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/trainsbetweenimportantstations.htm\">Trains ");
out.println("between important stations</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"> ");
out.println("<div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/avalibiltystatusatstations.htm\">Avalibilty ");
out.println("status at stations</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"><div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/faresoftrains.htm\">Fares ");
out.println("of trains </a> </font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"> <div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/onlinereservation.htm\">Online ");
out.println("Reservation</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td height=\"25\" bgcolor=\"#FFFFCC\"> <div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/timetablet.htm\" target=\"_blank\">Time ");
out.println("Table</a></font></div></td>");
out.println("</tr>");
out.println("</table> ");
out.println("<div align=\"center\"></div>");
out.println("</TD>");
out.println("<td width=\"478\" valign=\"top\" bgcolor=\"#FFCCFF\"> ");
out.println("<p align=\"center\"><font color=\"#660000\" size=\"5\"><em></em></font></p>");
out.println("<p align=\"center\"><font color=\"#660000\" size=\"5\">PNR no is ----"+pnr1+""+pnr2+"</font></p>");
out.println("<p align=\"center\"><font color=\"#660000\" size=\"5\">Status is ------confirm</font><font size=\"5\"> ");
out.println("</font></p>");
out.println("</TD>");
out.println("</tr>");
out.println("</table>");
out.println("<div align=\"center\"></div>");
out.println("<p align=\"center\"><a href=\"http://localhost:2008/hcutravels/passengerstatus.htm\"><img src=\"http://localhost:2008/hcutravels/images/previous.gif\" width=\"27\" height=\"22\" border=\"0\"><font size=\"4\">Back ");
out.println("</font></a>| <u><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/home.htm\">Home </a></font></u>| <a href=\"http://localhost:2008/hcutravels/train.htm\"><font size=\"4\">Trains</font></a></p>");
out.println("<HR align=center noShade>");
out.println("<p align=\"center\"><FONT face=Arial size=1>|| <A ");
out.println("href=\"http://www.indianrail.gov.in/abir.html\">Indian Railways</A>| <A href=\"http://www.indianrail.gov.in/pnr_stat.html\" target=DispArea>Passenger ");
out.println("Status</A> | <A href=\"http://www.indianrail.gov.in/acc_avl.html\" ");
out.println("target=DispArea>Seat Availability</A> | <A ");
out.println("href=\"http://www.indianrail.gov.in/fare_enq.html\" target=DispArea>Fare</A> |<BR>");
out.println("| <A href=\"http://www.indianrail.gov.in/src_dest_trns.html\" ");
out.println("target=DispArea>TrainsBetween Stations</A> | <A ");
out.println("href=\"http://www.indianrail.gov.in/inet_trn_num.html\" ");
out.println("target=DispArea>Schedule</A> | <A href=\"http://www.indianrail.gov.in/stn_code.html\" ");
out.println("target=DispArea>Know Station Code?</A> |<A ");
out.println("href=\"http://www.indianrail.gov.in/inet_trn_num.html\" target=DispArea>Know Train ");
out.println("Number?</A> | <BR>");
out.println("| <A href=\"http://www.indianrail.gov.in/seatkt.html\" ");
out.println("target=DispArea>Season Tickets</A> | <A ");
out.println("href=\"http://www.indianrail.gov.in/class.html\" target=DispArea>Class Codes</A> ");
out.println("| <A href=\"http://www.indianrail.gov.in/quotas.html\" target=DispArea>Quota Codes</A>| ");
out.println("<A ");
out.println("href=\"http://www.indianrail.gov.in/resrules.html\" target=DispArea>Reservation ");
out.println("Rules</A><BR>");
out.println("| <A href=\"http://www.indianrail.gov.in/refund_rules.html\" ");
out.println("target=DispArea>Refund Rules</A> | <A ");
out.println("href=\"http://www.indianrail.gov.in/break.html\" target=DispArea>Break Journey Rules</A> ");
out.println("| <A ");
out.println("href=\"http://www.indianrail.gov.in/tatkal.html\" target=DispArea>Tatkal Trains&nbsp;</A> ");
out.println("||</FONT> </p>");
out.println("<HR align=center noShade>");
out.println("<p>&nbsp;</p>");
out.println("<p>&nbsp;</p>");
out.println("</body>");
out.println("</html>");
        
                    

                        
            } 
            else
              {




out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
out.println("<html>");
out.println("<head>");
out.println("<title>invalidpnrnumber</title>");
out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">");
out.println("<SCRIPT>");
out.println("function doClear()");
out.println("{       ");
out.println("document.mainform.pnr.value = \"\";");
out.println("document.mainform.pnrk.value = \"\";");
out.println("}");
out.println("function doSubmit()");
out.println("{");
out.println("var strErrMsg;         ");
out.println("strErrMsg = \"\";          ");
out.println("strErrMsg = doValidations();");
out.println("if (strErrMsg == \"\" )");
out.println("{                          ");
out.println("document.mainform.action = \"http://localhost:2008/examples/servlet/status\"  ;                ");
out.println("document.mainform.submit();");
out.println("}");
out.println("else");
out.println("{alert(strErrMsg);}");
out.println("}");
out.println("function doValidations()");
out.println("{");
out.println("var ddIndex;");
out.println("var strTemp;");
out.println("var strFld;");
out.println("var frmDoc;");
out.println("var strErrMsg;");
out.println("strErrMsg = \"\";");
out.println("frmDoc = document.mainform;            ");
out.println("strFld = frmDoc.pnr");
out.println("if (strFld.value == \"\") ");
out.println("{                      ");
out.println("strErrMsg = strErrMsg + \"Please enter the pnr number\n\";");
out.println("}          ");
out.println("/*strFld = frmDoc.pnrk");
out.println("if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter password\n\"; */");
out.println("return strErrMsg;");
out.println("}");
out.println("</SCRIPT>");
out.println("</head>");
out.println("<body bgcolor=\"#FFFFFF\">");
out.println("<FORM name=mainform method=post>");
out.println("<div align=\"center\"> ");
out.println("<center>");
out.println("<div align=\"center\">");
out.println("<center>");
out.println("<TABLE cellSpacing=0 cellPadding=0 width=750 border=0 style=\"border-collapse: collapse\" bordercolor=\"#111111\">");
out.println("<TBODY>");
out.println("<TR> ");
out.println("<TD class=header><img src=\"http://localhost:2008/hcutravels/images/frontpage.gif\" alt=\"\" width=\"386\" height=\"71\"><img src=\"http://localhost:2008/hcutravels/images/Hdr_AS_Seal.jpg\" width=\"289\" height=\"71\"> ");
out.println("<img src=\"http://localhost:2008/hcutravels/images/1animated12-thumb%5B1%5D.gif\" width=\"67\" height=\"50\"> ");
out.println("</TD>");
out.println("</TR>");
out.println("</TBODY>");
out.println("</TABLE>");
out.println("</center>");
out.println("</div>");
out.println("<p align=\"left\"><font face=\"arial\" size=\"2\"> ");
out.println("<marquee behavior=\"scroll\" style=\"font-family: Courier New; color: #333300; text-decoration: blink; font-size: 18pt; font-style: italic; font-weight: bold\">");
out.println("we share a visi<img src=\"http://localhost:2008/hcutravels/images/Animsun.gif\" width=\"50\" height=\"26\">n ");
out.println("</marquee>");
out.println("</font></p>");
out.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
out.println("<tr bordercolor=\"#CCCCCC\" bgcolor=\"#000099\"> ");
out.println("<td width=\"10%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/home.htm\"><font color=\"#FFFFFF\" size=\"5\">Home</font></a></div></td>");
out.println("<td width=\"14%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/services.htm\"><font color=\"#FFFFFF\" size=\"5\">Services</font></a></div></td>");
out.println("<td width=\"25%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/packagefinal.htm\"><font color=\"#FFFFFF\" size=\"5\">Holiday ");
out.println("Packages </font></a></div></td>");
out.println("<td width=\"11%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/faq.htm\"><font color=\"#FFFFFF\" size=\"5\">FAQs</font></a></div></td>");
out.println("<td width=\"25%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/register.htm\"><font color=\"#FFFFFF\" size=\"5\">Register ");
out.println("Yourself</font></a></div></td>");
out.println("<td width=\"15%\" bgcolor=\"#000099\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/aboutus.htm\"><font color=\"#FFFFFF\" size=\"5\">About ");
out.println("Us</font></a></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td colspan=\"6\"><table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
out.println("<tr bgcolor=\"#0000CC\"> ");
out.println("<td width=\"21%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/acc.htm\"><font color=\"#FFFFFF\" size=\"4\"> ");
out.println("Accommodation</font></a></div></td>");
out.println("<td width=\"24%\" bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travel.htm\"><font color=\"#FFFFFF\" size=\"4\"> ");
out.println("Traveling Means</font></a></div>");
out.println("<div align=\"center\"></div></td>");
out.println("<td width=\"25%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travelguide.htm\"><font color=\"#FFFFFF\" size=\"4\">Travel ");
out.println("Guide</font></a></div></td>");
out.println("<td width=\"30%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travelinsurance.htm\"><font color=\"#FFFFFF\" size=\"4\">Travel ");
out.println("Insurance</font></a></div></td>");
out.println("</tr>");
out.println("</table></td>");
out.println("</tr>");
out.println("</table>");
out.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
out.println("<tr bgcolor=\"#3333FF\"> ");
out.println("<td bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/car.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
out.println("Car</font></a></div></td>");
out.println("<td bgcolor=\"#3399FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/train.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
out.println("Train</font></a></div></td>");
out.println("<td bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/flight.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
out.println("Flight</font></a></div></td>");
out.println("<td> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/cruise.htm\"><font color=\"#FFFFFF\" size=\"4\">By ");
out.println("Cruises</font></a></div></td>");
out.println("</tr>");
out.println("</table>");
out.println("<p align=\"center\"><font face=\"arial\" size=\"2\"> ");
out.println("<marquee behavior=\"scroll\" style=\"font-family: Courier New; color: #333300; text-decoration: blink; font-size: 18pt; font-style: italic; font-weight: bold\">");
out.println("</marquee>");
out.println("</font><span class=\"style1\"><u><font color=\"#990000\" size=\"6\">Passenger ");
out.println("Status </font></u></span></p>");
out.println("</center>");
out.println("</div>");
out.println("<table width=\"746\" height=\"166\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FF99FF\">");
out.println("<tr> ");
out.println("<td width=\"244\" height=\"166\"> ");
out.println("<table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FF99FF\">");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFCCFF\"> ");
out.println("<div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/passengerstatus.htm\">Passenger ");
out.println("Status</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"><div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/trainsbetweenimportantstations.htm\">Trains ");
out.println("between important stations</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"> ");
out.println("<div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/avalibiltystatusatstations.htm\">Avalibilty ");
out.println("status at stations</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"><div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/faresoftrains.htm\">Fares ");
out.println("of trains </a> </font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"> <div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/onlinereservation.htm\">Online ");
out.println("Reservation</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td height=\"25\" bgcolor=\"#FFFFCC\"> <div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/timetablet.htm\" target=\"_blank\">Time ");
out.println("Table</a></font></div></td>");
out.println("</tr>");
out.println("</table> ");
out.println("<div align=\"center\"></div>");
out.println("</TD>");
out.println("<td width=\"498\" bgcolor=\"#FFCCFF\"> ");
out.println("<p align=\"center\"><font color=\"#660000\" size=\"5\"><em><strong>invalid ");
out.println("PNR number Try again!!!</strong></em></font></p>");
out.println("<p align=\"center\"><font color=\"#660000\" size=\"5\">Enter 10 digit PNR Number ");
out.println("</font></p>");
out.println("<p align=\"center\"> ");
out.println("<INPUT name=pnr class=lf size=3 maxlength=\"3\">");
out.println("<INPUT name=pnrk  class=lf size=7 maxlength=\"7\">");
out.println("</p>");
out.println("<p align=\"center\"onClick=\"javascript:doSubmit();\"><font size=\"5\"> ");
out.println("<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0\" width=\"147\" height=\"34\">");
out.println("<param name=\"movie\" value=\"http://localhost:2008/hcutravels/images/getstatus.swf\">");
out.println("<param name=\"quality\" value=\"high\">");
out.println("<param name=\"bgcolor\" value=\"#FFCCFF\">");
out.println("<embed src=\"http://localhost:2008/hcutravels/images/getstatus.swf\" quality=\"high\" pluginspage=\"http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash\" type=\"application/x-shockwave-flash\" width=\"147\" height=\"34\" bgcolor=\"#FFCCFF\"></embed> ");
out.println("</object>");
out.println("<object classid=\"clsid:D27CDB6E-AE6D-11cf-96B8-444553540000\" codebase=\"http://download.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=5,0,0,0\" width=\"147\" height=\"34\">");
out.println("<param name=\"BGCOLOR\" value=\"#FFCCFF\">");
out.println("<param name=\"movie\" value=\"http://localhost:2008/hcutravels/images/pnrcleardata.swf\">");
out.println("<param name=\"quality\" value=\"high\">");
out.println("<embed src=\"http://localhost:2008/hcutravels/images/pnrcleardata.swf\" width=\"147\" height=\"34\" quality=\"high\" pluginspage=\"http://www.macromedia.com/shockwave/download/index.cgi?P1_Prod_Version=ShockwaveFlash\" type=\"application/x-shockwave-flash\" bgcolor=\"#FFCCFF\" ></embed> ");
out.println("</object>");
out.println("</font></p></TD>");
out.println("</tr>");
out.println("</table>");
out.println("<p align=\"center\"><u><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/home.htm\">Home </a></font></u>| <a href=\"http://localhost:2008/hcutravels/train.htm\"><font size=\"4\">Trains</font></a></p>");
out.println("<div align=\"center\"></div>");
out.println("<HR align=center noShade>");
out.println("<p align=\"center\"><FONT face=Arial size=1>|| <A ");
out.println("href=\"http://www.indianrail.gov.in/abir.html\">Indian Railways</A>| <A href=\"http://www.indianrail.gov.in/pnr_stat.html\" target=DispArea>Passenger ");
out.println("Status</A> | <A href=\"http://www.indianrail.gov.in/acc_avl.html\" ");
out.println("target=DispArea>Seat Availability</A> | <A ");
out.println("href=\"http://www.indianrail.gov.in/fare_enq.html\" target=DispArea>Fare</A> |<BR>");
out.println("| <A href=\"http://www.indianrail.gov.in/src_dest_trns.html\" ");
out.println("target=DispArea>TrainsBetween Stations</A> | <A ");
out.println("href=\"http://www.indianrail.gov.in/inet_trn_num.html\" ");
out.println("target=DispArea>Schedule</A> | <A href=\"http://www.indianrail.gov.in/stn_code.html\" ");
out.println("target=DispArea>Know Station Code?</A> |<A ");
out.println("href=\"http://www.indianrail.gov.in/inet_trn_num.html\" target=DispArea>Know Train ");
out.println("Number?</A> | <BR>");
out.println("| <A href=\"http://www.indianrail.gov.in/seatkt.html\" ");
out.println("target=DispArea>Season Tickets</A> | <A ");
out.println("href=\"http://www.indianrail.gov.in/class.html\" target=DispArea>Class Codes</A> ");
out.println("| <A href=\"http://www.indianrail.gov.in/quotas.html\" target=DispArea>Quota Codes</A>| ");
out.println("<A ");
out.println("href=\"http://www.indianrail.gov.in/resrules.html\" target=DispArea>Reservation ");
out.println("Rules</A><BR>");
out.println("| <A href=\"http://www.indianrail.gov.in/refund_rules.html\" ");
out.println("target=DispArea>Refund Rules</A> | <A ");
out.println("href=\"http://www.indianrail.gov.in/break.html\" target=DispArea>Break Journey Rules</A> ");
out.println("| <A ");
out.println("href=\"http://www.indianrail.gov.in/tatkal.html\" target=DispArea>Tatkal Trains&nbsp;</A> ");
out.println("||</FONT> </p>");
out.println("<HR align=center noShade>");
out.println("<p>&nbsp;</p>");
out.println("<p>&nbsp;</p>");
out.println("</body>");
out.println("</html>");



             }
           
            

			

            
           }catch(Exception e){
            	out.println("Exception"+e.getMessage()+e.toString());
            }
            finally{
            	try{
            		if(c!=null)
            			c.close();
            	}catch(Exception e){
            		out.println("Exception closing the connection"+e.getMessage());
            	}
            }
   		}
   }
   
