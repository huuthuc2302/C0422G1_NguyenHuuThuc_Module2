package furama_resort.models;

public class Contract {
    private String idContract; //số hợp đồng
    private int idBooking; //mã booking
    private String prePayment; //Số tiền cọc trước
    private String expense; //tổng số tiền thanh toán
    private int idCustomer; //mã khách hàng

    public Contract() {
    }

    public Contract(String idContract,
                    int idBooking,
                    String prePayment,
                    String expense,
                    int idCustomer) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.prePayment = prePayment;
        this.expense = expense;
        this.idCustomer = idCustomer;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public String getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(String prePayment) {
        this.prePayment = prePayment;
    }

    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "idContract='" + idContract + '\'' +
                ", idBooking=" + idBooking +
                ", prePayment='" + prePayment + '\'' +
                ", expense='" + expense + '\'' +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
