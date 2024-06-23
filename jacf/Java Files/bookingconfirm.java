import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class bookingconfirm extends HttpServlet {

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
        
        String loginid=request.getParameter("loginid");
        String source=request.getParameter("source");
        String destination=request.getParameter("destination");
        String sdd=request.getParameter("sdd");
        String smm=request.getParameter("smm");
        String syy=request.getParameter("syy");
        String not=request.getParameter("not");
        String noc=request.getParameter("noc");
        String clas=request.getParameter("class");
        String trainno=request.getParameter("trainno");
        String cardno=request.getParameter("cardno");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String query =null;
   		try{
   			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            c= DriverManager.getConnection("jdbc:odbc:ITMNGMNT","grandtour","grandtour");
            Statement st =c.createStatement();
            int pnr1=0;   
            int pnr2=6234612;        
            ResultSet rs= st.executeQuery("select * from trainbooking");
                               
            if(rs.next())
            {
                        
                        query = new String("select max(pnrno1) as rno from trainbooking"); 
                        ResultSet rs2= st.executeQuery("select max(pnrno1) as rno from trainbooking");
                        if(rs2.next())
                        pnr1= rs2.getInt(1) + 1;
                        
            } 
            else
               pnr1=121;    
            String status="confirm";   
            query = new String("insert into trainbooking values('"+loginid+"','"+source+"','"+destination+"','"+sdd+"','"+smm+"','"+syy+"','"+not+"','"+noc+"','"+clas+"','"+trainno+"','"+cardno+"',"+pnr1+","+pnr2+",'"+status+"')");           
                           
            st.executeUpdate(query);
           
out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
out.println("<html>");
out.println("<head>");
out.println("<title>bookingconfirm</title>");
out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">");
out.println("<SCRIPT>");
out.println("/*function doClear()");
out.println("{       ");
out.println("document.mainform.BudgetAmtPDay.value = \"\";");
out.println("document.mainform.BudgetAmtPTrip.value = \"\";");
out.println("}*/");
out.println("function doSubmit()");
out.println("{         ");
out.println("var strErrMsg;");
out.println("strErrMsg = \"\";          ");
out.println("strErrMsg = doValidations();");
out.println("if (strErrMsg == \"\" )");
out.println("{              ");
out.println("document.mainform.action = \"http://localhost:2008/examples/servlet/trainbook\"  ;                     ");
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
out.println("strFld = frmDoc.login");
out.println("if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter loginId\n\";          ");
out.println("strFld = frmDoc.password");
out.println("if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter password\n\"; ");
out.println("return strErrMsg;");
out.println("}");
out.println("</SCRIPT>");
out.println("</head>");
out.println("<body>");
out.println("<FORM name=mainform method=post>");
out.println("<div align=\"center\">");
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
out.println("<p align=\"center\"><span class=\"style1\"><u><font color=\"#990000\" size=\"6\"><strong>Online ");
out.println("resrevation</strong></font></u></span></p>");
out.println("<div align=\"center\"></div>");
out.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
out.println("<tr> ");
out.println("<td width=\"33%\" height=\"225\" bgcolor=\"#FFCCFF\"> ");
out.println("<table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"#FF99FF\">");
out.println("<tr> ");
out.println("<td bgcolor=\"#FFFFCC\"> <div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/passengerstatus.htm\">Passenger ");
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
out.println("<td bgcolor=\"#FFCCFF\"> ");
out.println("<div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/onlinereservation.htm\">Online ");
out.println("Reservation</a></font></div></td>");
out.println("</tr>");
out.println("<tr> ");
out.println("<td height=\"25\" bgcolor=\"#FFFFCC\"> <div align=\"center\"><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/timetablet.htm\" target=\"_blank\">Time ");
out.println("Table</a></font></div></td>");
out.println("</tr>");
out.println("</table>");
out.println("</td>");
out.println("<td width=\"46%\"><table width=\"100%\" height=\"225\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">");
out.println("<tr bgcolor=\"#FFCCFF\"> ");
out.println("<td height=\"45\"> ");
out.println("<div align=\"center\"><strong><font color=\"#660033\" size=\"5\">Booking ");
out.println("Confirmation</font></strong></div></td>");
out.println("</tr>");
out.println("<tr bgcolor=\"FFCCFF\"> ");
out.println("<td width=\"51%\"><div align=\"left\"><font size=\"4\"><strong> Your PNR no. ");
out.println("is "+pnr1+""+pnr2+"</strong></font></div></td>");
out.println("</tr>");
out.println("<tr bgcolor=\"FFCCFF\"> ");
out.println("<td><div align=\"center\"><font size=\"4\">Your ticket booking details would ");
out.println("be</font></div></td>");
out.println("</tr>");
out.println("<tr bgcolor=\"#FFCCFF\"> ");
out.println("<td height=\"127\"> ");
out.println("<div align=\"center\" > ");
out.println("<p><font size=\"4\">sent to you within 3 days on your mail ID</font></p>");
out.println("<p><font color=\"#663300\" size=\"5\">Thanx for using the sevice</font></p>");
out.println("<p>&nbsp;</p>");
out.println("</div></td>");
out.println("</tr>");
out.println("</table></td>");
out.println("<td width=\"21%\"><img src=\"http://localhost:2008/hcutravels/images/Southern%20GP59.jpg\" width=\"162\" height=\"225\"></td>");
out.println("</tr>");
out.println("</table>");
out.println("<p align=\"center\"><u><font size=\"4\"><a href=\"http://localhost:2008/hcutravels/home.htm\">Home </a></font></u>| <a href=\"http://localhost:2008/hcutravels/train.htm\"><font size=\"4\">Trains</font></a></p>");
out.println("<HR align=center noShade>");
out.println("<p align=\"center\"><FONT face=Arial size=1>|| <A ");
out.println("href=\"http://www.indianrail.gov.in/abir.html\">Indian Railways</A>| <A href=\"http://localhost:2008/hcutravels/passengerstatus.htm\" target=DispArea>Passenger ");
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
out.println("</body>");
out.println("</html>");

			

            
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