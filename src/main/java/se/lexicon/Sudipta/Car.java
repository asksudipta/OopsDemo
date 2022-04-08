package se.lexicon.Sudipta;

public class Car {
    // fields
    private String model;
    private int id;
    private int year;
    private String colour;
    private String motorSize;


    // constructors

    public Car(String model, int id, int year, String colour, String motorSize) {
        this.model = model;
        this.id = id;
        this.year = year;
        this.colour = colour;
        this.motorSize = motorSize;
    }

    public Car() {
    }

    //methods
    public void drive(){
        System.out.println(model+" with motor "+motorSize+" can drive now");
    }

    // getters and setters


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(String motorSize) {
        this.motorSize = motorSize;
    }


}
