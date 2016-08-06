package presentationLayer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by Dotin school 6 on 8/6/2016.
 */
public class CreateRealCustomerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        String firstName = request.getParameter("firstName");
        System.out.println(firstName);
        String lastName = request.getParameter("lastName");
        System.out.println(lastName);
        String fatherName = request.getParameter("fatherName");
        System.out.println(fatherName);
        String birthDate = request.getParameter("birthDate");
        System.out.println(birthDate);
        String nationalCode = request.getParameter("nationalCode");
        System.out.println(nationalCode);

    }
    public void doPost(HttpServletRequest request , HttpServletResponse response){

        try {
            doGet(request , response);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
