package furama_resort.models.person;

public class Customer extends Person{
    private String typeCustomer; //loại khách hàng

    public Customer() {
    }

    public Customer(int id,
                    String name,
                    String dateOfBirth,
                    String address,
                    String gender,
                    int idCard,
                    int phoneNumber,
                    String email,
                    String typeCustomer) {
        super(id, name, dateOfBirth, address, gender, idCard, phoneNumber, email);
        this.typeCustomer = typeCustomer;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer : " + super.toString() +
                ", TYPECUSTOMER='" + typeCustomer + '\'';
    }

    public String getInfoToCSV() {
        return id + "," +
                name + "," +
                dateOfBirth + "," +
                address + "," +
                gender + "," +
                idCard + "," +
                phoneNumber + "," +
                email + "," +
                typeCustomer;
    }
}
