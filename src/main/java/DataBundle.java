public class DataBundle implements BillAction{

    private double megabyte;
    double dataPrice;

    public DataBundle(double megabyte){
        this.megabyte = megabyte;
        if(this.megabyte > 1000){
            dataPrice = this.megabyte * 0.35;
        }
        else if(this.megabyte > 500){
            dataPrice = this.megabyte * 0.55;
        }
        else if(this.megabyte < 500){
            dataPrice = this.megabyte * 0.75;
        }
    }

    @Override
    public double totalCost() {
       return dataPrice;
    }


}
