import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class pckgbooking extends HttpServlet {

    public void init(ServletConfig config)
    	throws ServletException {
    		super.init(config);
    	}
       public String getContext(String param) {
		ServletContext sc=getServletContext();
		String prop=sc.getInitParameter(param);
		prop=prop!=null&&prop.length()>0?""+prop:"";
		System.out.println("Contex param:"+prop);
		return prop;
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
        String pckgid=request.getParameter("pckgid");
        String sdd=request.getParameter("sdd");
        String smm=request.getParameter("smm");
        String syy=request.getParameter("syy");
        //String not=request.getParameter("not");
        //String clas=request.getParameter("class");
        //String type=request.getParameter("type");
        String ddd=request.getParameter("ddd");
        String dmm=request.getParameter("dmm");
        String dyy=request.getParameter("dyy");
        //String cardno=request.getParameter("cardno");
        
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String query =null;
   		try{
         	Class.forName(getContext("Driver"));
            c= DriverManager.getConnection(getContext("Url"),getContext("User"),getContext("Password"));
            Statement st =c.createStatement();
            int reqno=0;
            ResultSet rs= st.executeQuery("select * from pckgbooking");
                               
            if(rs.next())
            {
            			
            			//query = new String("select max(reqno) as rno from pckgbooking"); 
            			ResultSet rs2= st.executeQuery("select max(reqno) as rno from pckgbooking");
            			if(rs2.next())
            			reqno= rs2.getInt(1) + 1;
            			
            }
            else
            	reqno =500;
           	System.out.println("hai......"+reqno+" "+loginid+" "+pckgid+" "+sdd+" "+smm+" "+syy+" "+source+" "+ddd+" "+dmm+" "+dyy);
			query = new String("insert into pckgbooking values("+reqno+",'"+loginid+"','"+source+"','"+pckgid+"','"+sdd+"','"+smm+"','"+syy+"','"+ddd+"','"+dmm+"','"+dyy+"')");
			st.executeUpdate(query);
			String relpath=new java.net.URL(request.getScheme(),request.getServerName(),request.getServerPort(),request.getContextPath()).toString();
			getServletContext().getRequestDispatcher("/Pages/Common/Global.jsp").include(request,response);
			out.println("<TABLE WIDTH=600 align=center cellspacing=0 cellpadding=4 style='font:bold 12px verdana;color:green'>");
			//out.println("<TR><Td align=center nowrap><BR>Search&nbsp;:&nbsp;<input type=text name=search class=input>&nbsp;&nbsp;<button accesskey='S'><u>S</u>earch</button>&nbsp;&nbsp;<a href='advanced.htm'>Advanced Search</a><BR><BR></Th></TR>");
			out.println("<TR><TH bgcolor=#234567 colspan=2>Online Package Booking</TH></TR>");
			out.println("<TR><TH bgcolor=#234567 colspan=2>Status Confirmation</TH></TR><TR><TD colspan=2>");
			out.println("<p align=\"center\"><font color=\"#660000\" size=\"5\">Request no :  ------>> "+reqno+"</font></p>");
			out.println("<p align=\"center\"><font color=\"#660000\" size=\"5\">Package Id :  ------>> "+pckgid+"</font></P><BR><BR><B>ThanX For Exerting Our Services</B><BR><BR></TD></TR>");
			out.println("<TR><TD colspan=2 align=center><BR><BR><button onclick='location=\""+relpath+"/index.jsp\"' accesskey='C'><u>C</U>ontinue</button>&nbsp;&nbsp;&nbsp;<button onclick='location=\""+relpath+"/Pages/Signout.jsp\"' accesskey='S'><u>S</U>ignout</button></TD></TR>");
			out.println("</TD></TR></tABLE><SCRIPT>setFooter(\""+relpath+"\",\""+relpath+"/Images/Back.jpg\")</SCRIPT>");
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
   
