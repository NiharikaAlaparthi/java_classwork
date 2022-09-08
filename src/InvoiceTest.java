public class InvoiceTest {
    public static void main(String args[]){
        Invoice test = new Invoice("tv","this is a machine",10,25000);
        System.out.println(test.getPartNumber());
        System.out.println(test.getPartDescription());
        System.out.println(test.getQuantity());
        System.out.println(test.getPrice());
        System.out.println(test.getInvoiceAmount());
        Invoice test1 = new Invoice("milk","this is a diary product",10,25.50);
        System.out.println(test1.getPartNumber());
        System.out.println(test1.getPartDescription());
        System.out.println(test1.getQuantity());
        System.out.println(test1.getPrice());
        System.out.println(test1.getInvoiceAmount());
    }
    }

