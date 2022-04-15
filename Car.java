public class Car {
    private String model;
    private int buildYear;

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

    public void printInConsole() {
        System.out.println("Model: " + this.getModel());
        System.out.println("Build year: " + this.getBuildYear());
        System.out.println();
    }
}
