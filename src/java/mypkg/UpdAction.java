package mypkg;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
public class UpdAction extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession ses=req.getSession(true);     
// int id=Integer.parseInt((String)ses.getAttribute("ids"));
        

resp.getWriter().println("Hello are u there ");
 int Sstr=Integer.parseInt((String)ses.getAttribute("ids"));
 String str1=(String)ses.getAttribute("ids");



//Login module...
//        String uid=req.getParameter("uid");
      
 
 //stdregistration 
    String fname=req.getParameter("fname");
    String lname=req.getParameter("lname");
    String pass=req.getParameter("mypass");
    String mail=req.getParameter("mymail");
    String mob=req.getParameter("mymob");
    String dob=req.getParameter("mydob");
    String gender=req.getParameter("gen");
    String address=req.getParameter("myadd1");
     String nm3=fname+" "+lname; 
     
//  String address1=req.getParameter("myadd2");
    
     
        resp.getWriter().println("Hello are u there123 ");
        
        String str=Admin.udpDet(str1,fname, lname,mail, mob, dob,gender, address,nm3,str1);     
        
        resp.getWriter().println("Hello are u there656565 ");
        ses.setAttribute("str",str);        
    req.getRequestDispatcher("profile.jsp").forward(req, resp);


  
    }


        
    
    
    
    
    
    
}
