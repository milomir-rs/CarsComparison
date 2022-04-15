public class Main {
    public static void main(String[] args) {
        System.out.println("Here we start.");

        Car audi = new Car();
        audi.setModel("Audi");
        audi.setBuildYear(2021);
        audi.printInConsole();

        Car bmv = new Car();
        bmv.setModel("BMW");
        bmv.setBuildYear(2015);
        bmv.printInConsole();

    }
}
