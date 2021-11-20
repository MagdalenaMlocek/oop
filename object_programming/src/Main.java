public class Main {
    public static void main(String[] args) {

        Car audi = new Car(0, 1, "a6", true);
        audi.startEngine();
        audi.setLights(true);
        System.out.println(audi.getLights());
        audi.setGear(1);
        audi.accelerate( 20);
        audi.accelerate(20);
        audi.slowDown(10);
        audi.stopEngine();

        Car nissan = new Car(0,2);
        nissan.startEngine();




    }

}
