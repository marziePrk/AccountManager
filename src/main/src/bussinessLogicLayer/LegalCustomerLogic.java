package bussinessLogicLayer;

import dataAccessLayer.CRUD.LegalCustomerCRUD;
import dataAccessLayer.LegalCustomer;

/**
 * Created by Dotin school 6 on 8/8/2016.
 */
public class LegalCustomerLogic extends CustomerLogic{

    public static LegalCustomer create(long id, String companyName, String registerDate, String economicId){
        //TODO CHECK VALIDATION
        LegalCustomer legalCustomer = new LegalCustomer();
        legalCustomer.setId(id);
        legalCustomer.setCompanyName(companyName);
        legalCustomer.setRegisterDate(registerDate);
        legalCustomer.setEconomicId(economicId);
        LegalCustomerCRUD.create(legalCustomer);

        return legalCustomer;
    }


}
