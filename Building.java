package company;

public abstract class Building {
    private String street;
    private int year;
    private double number;

    public Building( String street,int year, double number) {
        this.street = street;
        this.year = year;
        this.number = number;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet (String street) {
        this.street = street;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }
    public abstract void build ();
    public abstract void info(String s, int y, double n);
}

