public class Main {
    public static void main(String[] args) {
        System.out.println("Here we start.");

        Car audi = new Car();
        audi.printInConsole();
        audi.setModel("Audi");
        audi.setBuildYear(2021);
        audi.setConsumption(4.5f);
        audi.printInConsole();

        Car bmv = new Car();
        bmv.setModel("BMW");
        bmv.setBuildYear(2015);
        bmv.setConsumption(5.1f);
        bmv.printInConsole();

        Car lada = new Car("Lada", 1998, 10.3f);
        lada.printInConsole();


    }
}
