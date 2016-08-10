package presentationLayer;

import bussinessLogicLayer.CustomerLogic;
import bussinessLogicLayer.LegalCustomerLogic;
import dataAccessLayer.Customer;
import dataAccessLayer.LegalCustomer;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

import static util.OutPutGenerator.generate;

/**
 * Created by Dotin school 6 on 8/6/2016.
 */
public class CreateLegalCustomerServlet extends HttpServlet
{
  public void doGet(HttpServletRequest request , HttpServletResponse response)
  {
      String companyName = request.getParameter("companyName");
      String registerDate = request.getParameter("registerDate");
      String economicId = request.getParameter("economicId");
      String outputHTML="";

      Customer customer = CustomerLogic.create();
      System.out.println(customer.getId());
      LegalCustomer legalCustomer = LegalCustomerLogic.create(customer.getId(),companyName, registerDate, economicId);
      //legalCustomer.setId(customer.getId());
      System.out.println(legalCustomer);
      System.out.println(customer);
      //TODO show result to customer
      response.setContentType("text/html ;charset=UTF-8");
      response.setCharacterEncoding("UTF-8");
      outputHTML =generate(legalCustomer , customer);
      try {
          PrintWriter out = response.getWriter();
          out.println(outputHTML);
      } catch (IOException e) {
          e.printStackTrace();
      }

  }
    public void doPost(HttpServletRequest request , HttpServletResponse response){
        doGet(request , response);
    }
}
