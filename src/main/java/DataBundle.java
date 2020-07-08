public class DataBundle implements BillAction{

    private double dataPrice;

    public DataBundle(double megabyte){
        if(megabyte > 1000){
            dataPrice = 0.35;
        }
        else if(megabyte > 500){
            dataPrice = 0.55;
        }
        else if(megabyte < 500){
            dataPrice = 0.75;
        }
    }

    @Override
    public double totalCost() {
       return getDataPrice();
    }

    public double getDataPrice() {
        return dataPrice++;
    }
}
