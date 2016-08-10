package bussinessLogicLayer;

import dataAccessLayer.CRUD.CustomerCRUD;
import dataAccessLayer.Customer;

/**
 * Created by Dotin school 6 on 8/7/2016.
 */
public class CustomerLogic {
    //create customer??
    public static Customer create() {
        Customer customer = CustomerCRUD.createCustomer();
        return customer;
    }
}
