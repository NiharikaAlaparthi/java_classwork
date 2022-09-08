public class ElectricityBill {
    int consumerNumber;
    String consumerName,ebConnection;
    double previousMonthReading,currentMonthReading;

    public ElectricityBill(int consumerNumber, String consumerName, String ebConnection, double previousMonthReading, double currentMonthReading) {
        this.consumerNumber = consumerNumber;
        this.consumerName = consumerName;
        this.ebConnection = ebConnection;
        this.previousMonthReading = previousMonthReading;
        this.currentMonthReading = currentMonthReading;


    }
    public double bill(){
        double price = 0;
        double re = this.currentMonthReading;
        if(this.ebConnection=="domestic"){
            if(re>501){
                price = re*6;
            }
            else if(re>200){
                price = re*4;
            }
            else if(re>100){
                price= re*2.5;
            }
            else{
                price = re*1;
            }

        }
        else if (this.ebConnection=="commercial"){
            if(re>501){
                price = re*7;
            }
            else if(re>200){
                price = re*6;
            }
            else if(re>100){
                price= re*4.5;
            }
            else{
                price = re*2;
            }

        }
        return price;
    }
}
