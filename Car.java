public class Car {
    private String model;
    private int buildYear;
    private Float consumption;

    public Car() {
        this.setModel("UNDEFIEND");
        this.setConsumption(0.0f);
        this.setBuildYear(0000);
    }

    public Car(String model, int buildYear, Float consumption) {
        this.setModel(model);
        this.setBuildYear(buildYear);
        this.setConsumption(consumption);
    }

    public void setModel(String modelValue) {
        this.model = modelValue;
    }

    public String getModel() {
        return this.model;
    }

    public void setBuildYear(int year) {
        this.buildYear = year;
    }

    public int getBuildYear() {
        return this.buildYear;
    }

    public void setConsumption(Float consumption) {
        this.consumption = consumption;
    }

    public Float getConsumption() {
        return this.consumption;
    }

    public void printInConsole() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Build year: " + this.getBuildYear());
        System.out.println("Consuption is " + this.getConsumption() + "l per 100 kilometers");
        System.out.println();
    }
}
