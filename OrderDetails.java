 class OrderDetails {

    private int quantity;
    private String taxStatus;

     public OrderDetails(int quantity, String taxStatus) {
         this.quantity = quantity;
         this.taxStatus = taxStatus;
     }

     public int getQuantity() {
         return quantity;
     }

     public void setQuantity(int quantity) {
         this.quantity = quantity;
     }

     public String getTaxStatus() {
         return taxStatus;
     }

     public void setTaxStatus(String taxStatus) {
         this.taxStatus = taxStatus;
     }

     public void calcSubTotal(){

     }

     public void calcWeight(){

     }

     public void calcTax(){

     }
 }
