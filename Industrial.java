package company;

public class Industrial extends Building {

    private String ind;

    public Industrial (String ind, String street, int year, double number) {
        super(street, year, number);
        this.ind = ind;
    }

    public String getInd() {
        return ind;
    }

    public void setInd(String ind) {
        this.ind = ind;
    }

    @Override
    public void build() {
        System.out.println("На улице " + getStreet() + " в " + getYear() + " году было построено здание для " + ind + " по номеру " + getNumber());
    }

    @Override
    public void info(String s, int y, double n) {

    }


}
