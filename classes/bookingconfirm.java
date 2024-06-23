import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class bookingconfirm extends HttpServlet {

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
   	  	Class.forName(getContext("Driver"));
            c= DriverManager.getConnection(getContext("Url"),getContext("User"),getContext("Password"));
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
           
	String relpath=new java.net.URL(request.getScheme(),request.getServerName(),request.getServerPort(),request.getContextPath()).toString();
				getServletContext().getRequestDispatcher("/Pages/Common/Global.jsp").include(request,response);
				out.println("<TABLE WIDTH=600 align=center cellspacing=0 cellpadding=4 style='font:bold 12px verdana;color:green'>");
				out.println("<TR><Td align=center nowrap><BR>Search&nbsp;:&nbsp;<input type=text name=search class=input>&nbsp;&nbsp;<button accesskey='S'><u>S</u>earch</button>&nbsp;&nbsp;<a href='advanced.htm'>Advanced Search</a><BR><BR></Th></TR>");
				out.println("<TR><TH bgcolor=#234567 colspan=2>Online Car Booking</TH></TR>");
				out.println("<TR><TH bgcolor=#234567 colspan=2><BR>Booking Confirmation<BR></TH></TR>");
				out.println("<TR><TD align=center colspan=2><BR><BR>Your request no. is <B><I>"+pnr1+""+pnr2+"</B></I><BR>Your ticket booking details would be  <BR>sent to you within 3 days on your mail ID<BR><BR><font style='font:bold 15px tahoma'>Thanx for using the sevice</font><BR><BR></TH></TR>");
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