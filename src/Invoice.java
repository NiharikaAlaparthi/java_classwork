public class Invoice {
     String partNumber,partDescription;
     int quantity;
     double price;

    public Invoice(String pn, String pd, int q, double p) {
        partNumber = pn;
        partDescription = pd;
        quantity = q;
        price = p;
    }

    String getPartNumber() {
        return partNumber;
    }

    void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    String getPartDescription() {
        return partDescription;
    }

    void setPartDescription(String partDescription) {
        this.partDescription = partDescription;
    }

     int getQuantity() {
        return quantity;
    }

     void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    double getPrice() {
        return price;
    }

    void setPrice(double price) {
        this.price = price;
    }

    public double getInvoiceAmount(){
        if (this.quantity<=0){
            return 0;
        }
        if(this.price<=0){
            return 0;
        }
        return this.quantity*this.price;
    }
}
