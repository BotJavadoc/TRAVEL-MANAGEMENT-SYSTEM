import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class currencyconversion extends HttpServlet {

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
        
        String amount=request.getParameter("amount");
        String source=request.getParameter("source");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String query =null;
        int money=Integer.parseInt(amount); 
        int n=Integer.parseInt(source);
        double convert=0;
        String sourcep=new String();
   		try{
            
              if(n==1)
                  {
                   convert=money*82.4949; 
                   sourcep="GBP United Kingdom Pounds";
                  }  
                   
              else if(n==2)
                  {
                   convert=money*0.415394; 
                   sourcep="JPY Japan Yen";
                  }  
             else if(n==3)
                  {
                   convert=money*0.0291286; 
                   sourcep="ITL Italy Lire ";
                  } 
             else if(n==4)
                  {
                   convert=money*32.7315; 
                   sourcep="AUD Australia Dollars";
                  } 
               else if(n==5)
                  {
                   convert=money*35.8603; 
                   sourcep="CAD Canada Dollars ";
                  } 
               else if(n==6)
                  {
                   convert=money*49.4969; 
                   sourcep="USD United States Dollars";
                  } 
               else if(n==7)
                  {
                   convert=money* 30.6087 ; 
                   sourcep="NZD New Zealand Dollars ";
                  }                
                    
                
                out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>currencyconversionresult</title>");
                out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\">");
                out.println("<SCRIPT>");
                out.println("function doClear()");
                out.println("{       ");
                out.println("document.mainform.amount.value = \"\";");
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
                out.println("strFld = frmDoc.amount");
                out.println("if (strFld.value == \"\") ");
                out.println("{                      ");
                out.println("strErrMsg = strErrMsg + \"Please enter the amount\n\";");
                out.println("}  ");
                out.println("strFld = frmDoc.source");
                out.println("if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter source currency\n\";");
                out.println("strFld = frmDoc.destination.value");
                out.println("alert(strFld);");
                out.println("if (strFld.value == \"\") strErrMsg = strErrMsg + \"Please enter destination currency\n\"; ");
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
                out.println("we share a visi<img src=\"http://localhost:2008/hcutravels/images/Animsun.gif\" alt=\"\" width=\"50\" height=\"26\">n ");
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
                out.println("<td width=\"21%\" height=\"20\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/acc.htm\"><font color=\"#FFFFFF\" size=\"4\"> ");
                out.println("Accommodation</font></a></div></td>");
                out.println("<td width=\"24%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travel.htm\"><font color=\"#FFFFFF\" size=\"4\"> ");
                out.println("Traveling Means</font></a></div>");
                out.println("<div align=\"center\"></div></td>");
                out.println("<td width=\"25%\" bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travelguide.htm\"><font color=\"#FFFFFF\" size=\"4\">Travel ");
                out.println("Guide</font></a></div></td>");
                out.println("<td width=\"30%\" bgcolor=\"#0000CC\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/travelinsurance.htm\"><font color=\"#FFFFFF\" size=\"4\">Travel ");
                out.println("Insurance</font></a></div></td>");
                out.println("</tr>");
                out.println("</table></td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("<table width=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">");
                out.println("<tr bgcolor=\"#3333FF\"> ");
                out.println("<td width=\"21%\" bgcolor=\"#3333FF\"> ");
                out.println("<div align=\"center\"><a href=\"http://localhost:2008/hcutravels/cityguide.htm\"><font color=\"#FFFFFF\" size=\"4\">city ");
                out.println("guide</font></a></div></td>");
                out.println("<td width=\"25%\" bgcolor=\"#3333FF\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/weather.htm\"><font color=\"#FFFFFF\" size=\"4\">weather ");
                out.println("report </font></a></div></td>");
                out.println("<td width=\"25%\" bgcolor=\"#3399FF\"> ");
                out.println("<div align=\"center\"><a href=\"http://localhost:2008/hcutravels/currencyconversion.htm\"><font color=\"#FFFFFF\" size=\"4\">currency ");
                out.println("conversion </font></a></div></td>");
                out.println("<td width=\"29%\"> <div align=\"center\"><a href=\"http://localhost:2008/hcutravels/distancecalculator.htm\"><font color=\"#FFFFFF\" size=\"4\">distance ");
                out.println("calculator </font></a></div></td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("<p align=\"center\"><font face=\"arial\" size=\"2\"> ");
                out.println("<marquee behavior=\"scroll\" style=\"font-family: Courier New; color: #333300; text-decoration: blink; font-size: 18pt; font-style: italic; font-weight: bold\">");
                out.println("</marquee>");
                out.println("</font><font size=\"6\"><strong><font color=\"#990000\"><u>hcutravels currency ");
                out.println("conversion results</u></font></strong></font></p>");
                out.println("</center>");
                out.println("</div>");
                out.println("<table width=\"100%\" border=\"0\" cellspacing=\"1\" cellpadding=\"0\">");
                out.println("<tr>");
                out.println("<td height=\"171\" bgcolor=\"#FFCCFF\">");
                out.println("<div align=\"center\">");
                out.println("<p>&nbsp;</p>");
                out.println("<p>&nbsp;</p>");
                out.println("<p>"+money+"<font size=\"4\">");
                out.print(sourcep+"<font size=\"4\">");
                out.print("  =  "+convert+  "  INR Indian Rupees<font size=\"4\"></p>");
                out.println("<p>&nbsp;</p>");
                out.println("<p><u></u></p>");
                out.println("</div></td>");
                out.println("</tr>");
                out.println("</table>");
                out.println("<p align=\"center\"><u><a href=\"http://localhost:2008/hcutravels/currencyconversion.htm\"><img src=\"http://localhost:2008/hcutravels/images/previous.gif\" alt=\"\" width=\"27\" height=\"22\" border=\"0\"><font size=\"4\">Back ");
                out.println("</font></a><font size=\"3\">| <a href=\"http://localhost:2008/hcutravels/home.htm\"><font color=\"#0000FF\" size=\"4\">Home</font></a></font></u></p>");
                out.println("<p align=\"center\"><font size=\"3\"><a href=\"http://localhost:2008/hcutravels/aboutindia.htm\"><font color=\"#0000FF\">About ");
                out.println("India</font></a><font color=\"#0000FF\"> </font>|<a href=\"http://localhost:2008/hcutravels/indiahistory.htm\"> <font color=\"#0000FF\">History ");
                out.println("of India</font></a>| <a href=\"http://localhost:2008/hcutravels/usefullinks.htm\"><font color=\"#0000FF\">Useful ");
                out.println("links </font></a></font></p>");
                out.println("<HR align=center noShade>");
                out.println("<p align=\"left\"><font size=\"5\"><strong><font face=\"arial\"> </font></strong></font></p>");
                out.println("<p><strong><font face=\"arial\" size=\"2\">");
                out.println("<marquee behavior=\"scroll\" style=\"font-family: Courier New; color: #333300; text-decoration: blink; font-size: 18pt; font-style: italic; font-weight: bold\">");
                out.println("</marquee>");
                out.println("</font></strong></p>");
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
   
