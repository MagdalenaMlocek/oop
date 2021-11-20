public class Bmw extends Vehicle{                               //extends - rozszerza do klasy vehicle//

//    public String drive;
    public Drive naped;
    public Bmw(int dateOfProduction, String model, boolean airCon, int mileage, Drive drive){
        super (dateOfProduction, model, airCon, mileage);
        this.naped = drive;

    }


}
