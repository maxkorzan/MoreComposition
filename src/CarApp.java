public class CarApp {
    public static void main(String[] args) {

        Car c = new Car();
        c.setColor("red");
        c.setModel("Porsche");

        Driver d = new Driver();
        d.setName("Dave");

        System.out.println("The " + c.getColor() + " " + c.getModel() + " is being driven by " + d.getName());

    }
}
