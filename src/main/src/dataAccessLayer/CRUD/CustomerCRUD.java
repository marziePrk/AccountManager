package dataAccessLayer.CRUD;

import dataAccessLayer.Customer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static dataAccessLayer.DBConnection.getDBConnection;

/**
 * Created by Dotin school 6 on 8/7/2016.
 */
public class CustomerCRUD {
    static PreparedStatement preparedStatement = null;

    public static Customer createCustomer() {
        long id = 01;
        Customer customer = new Customer();
        String customerNumber = generateCustomerNumber();
        customer.setCustomerNumber(customerNumber);
        //TODO INSERT INTO CUSTOMER TABLE
        try {
            preparedStatement = getDBConnection().prepareStatement("INSERT INTO customer(customer_number) VALUES (?)" , Statement.RETURN_GENERATED_KEYS);
            preparedStatement.setString(1,customerNumber);
            preparedStatement.executeUpdate();
            ResultSet resultSet = preparedStatement.getGeneratedKeys();
            if (resultSet.next()){
              id = (long) resultSet.getInt(1);
            }
            customer.setId(id);
            resultSet.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customer;
    }

    public static String generateCustomerNumber() {
        String customerNumber = null;
        try {
            preparedStatement = getDBConnection().prepareStatement("SELECT MAX(customer_number) FROM customer");

            ResultSet resultSet = preparedStatement.executeQuery();
            boolean result = resultSet.next();
            if (result) {
                customerNumber = String.valueOf(resultSet.getInt(1) + 1);

            } else {
                //legalCustomer.setCustomerNumber(1000);
                customerNumber = "1000";
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerNumber;
    }

}
