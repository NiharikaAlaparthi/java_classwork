public class elecTest {
    public static void main(String args[]){
        ElectricityBill b = new ElectricityBill(123,"Neha","domestic",100,300);
        System.out.println("monthly electric bill is "+b.bill());
        ElectricityBill b1 = new ElectricityBill(4206,"Niharika","commercial",200,360);
        System.out.println("monthly electric bill is "+b1.bill());
    }
}
