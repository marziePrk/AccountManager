package dataAccessLayer.CRUD;

import dataAccessLayer.LegalCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import static dataAccessLayer.DBConnection.getDBConnection;

/**
 * Created by Dotin school 6 on 8/7/2016.
 */
public class LegalCustomerCRUD {
    static Connection connection = getDBConnection();

    public static void create(LegalCustomer legalCustomer) {
        String sglStatement = "INSERT INTO legal_customer (id ,economic_id ,company_name ,register_date) VALUES (?,?,?,?)";
        //System.out.println("LCCRUD \n"+legalCustomer);
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sglStatement);
            preparedStatement.setLong(1,legalCustomer.getId());
            preparedStatement.setString(2,legalCustomer.getEconomicId());
            preparedStatement.setString(3,legalCustomer.getCompanyName());
            preparedStatement.setString(4 , legalCustomer.getRegisterDate());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
