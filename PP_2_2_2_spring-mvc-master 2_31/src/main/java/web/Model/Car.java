package web.Model;

public class Car {
    private String model;
    private String color;
    private int years;


    public Car(String model, String color, int years) {
        this.model = model;
        this.color = color;
        this.years = years;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYears() {
        return years;
    }

    public void setYears(int years) {
        this.years = years;
    }
}
