//dziedziczenie//

public class Nissan extends Vehicle{
    private String TypeOfSeats;

    public Nissan (int dateOfProduction, String model, boolean airCon, int mileage, String TypeOfSeats) {
        super(dateOfProduction, model, airCon, mileage);                                                       //odnosi się do klasy głownej//
        this.TypeOfSeats = TypeOfSeats;
    }
    @Override
    public void startEngine(){
        System.out.println("Start Nissan engine");
    }

}
