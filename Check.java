public class Check extends Payment{

    private String name;
    private String bankId;

    public Check(String name, String bankId) {
        this.name = name;
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }

    public void authorized(){

    }
}
