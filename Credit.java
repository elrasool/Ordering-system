import java.util.Date;

public class Credit extends Payment{
    private String number;
    private String type;
    private Date expDate;

    public Credit(String number, String type, Date expDate) {
        this.number = number;
        this.type = type;
        this.expDate = expDate;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public void authorized(){

    }
}
