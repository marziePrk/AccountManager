package presentationLayer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dotin school 6 on 8/6/2016.
 */
public class SearchRealCustomerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response) {
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
        doGet(request , response);
    }
}
