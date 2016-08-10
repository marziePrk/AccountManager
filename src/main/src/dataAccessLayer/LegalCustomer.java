package dataAccessLayer;

/**
 * Created by Dotin school 6 on 8/7/2016.
 */
public class LegalCustomer extends Customer{
    private long id;
    private String companyName;
    private String registerDate;
    private String economicId;

    //getter

    public long getId() {
        return id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRegisterDate() {
        return registerDate;
    }

    public String getEconomicId() {
        return economicId;
    }


    //setter

    public void setId(long id) {
        this.id = id;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public void setRegisterDate(String registerDate) {
        this.registerDate = registerDate;
    }

    public void setEconomicId(String economicId) {
        this.economicId = economicId;
    }


    @Override
    public String toString() {
        return companyName +"\n"+ registerDate +"\n" + economicId +"\n" ;
    }
}
