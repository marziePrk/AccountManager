package presentationLayer;

import dataAccessLayer.LegalCustomer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Dotin school 6 on 8/6/2016.
 */
public class SearchLegalCustomerServlet extends HttpServlet {
    public void doGet(HttpServletRequest request , HttpServletResponse response){
        String companyName = request.getParameter("companyName");
        System.out.println(companyName);
        String registerDate = request.getParameter("registerDate");
        System.out.println(registerDate);
        String economicId = request.getParameter("economicId");
        System.out.println(economicId);
        LegalCustomer legalCustomer = new LegalCustomer();
    }
    public void doPost(HttpServletRequest request , HttpServletResponse response){
        doGet(request , response);
    }

}
