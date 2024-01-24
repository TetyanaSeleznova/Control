package company;

public class Flat extends Building {
    int size;
    public Flat (int size, String street, int year, double number) {
        super(street, year, number);
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    @Override
    public void info(String s, int y, double n) {

    }
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void build() {
        System.out.println("На улице " + getStreet() + " в " + getYear() + " году было построено здание с квартирами " +
                + size + "квадратов, по номеру " + getNumber());
    }

}