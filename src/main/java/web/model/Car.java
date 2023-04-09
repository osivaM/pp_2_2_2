package web.model;

public class Car {
    private String model;
    private String brand;
    private Integer series;

    public Car() {}

    public Car(String model, String brand, Integer series) {
        this.model = model;
        this.brand = brand;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getSeries() {
        return series;
    }

    public void setSeries(Integer series) {
        this.series = series;
    }
}
