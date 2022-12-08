import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html:charset=UTF-8");
        try(PrintWriter out=response.getWriter()) {
            String uname=request.getParameter("username");
            String password=request.getParameter("password");

            if(uname.equals("Navin") && password.equals("123456")){
                out.println(("Welcome  "+uname));
            }
            else {
                out.println(("Correct User Name and Password"));
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req,resp);
    }

}
