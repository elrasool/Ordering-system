import java.util.Date;
 class Order {

    private Date date;

     public Date getDate() {
         return date;
     }

     public void setDate(Date date) {
         this.date = date;
     }

     public String getStatus() {
         return status;
     }

     public void setStatus(String status) {
         this.status = status;
     }

     private String status;

     public Order(Date date, String status) {
         this.date = date;
         this.status = status;
     }

     public void calcSubTotal(){

    }

    public void calcTax(){

    }

    public void calcTotal(){

    }

    public void calcTotalWeight(){

    }


}
