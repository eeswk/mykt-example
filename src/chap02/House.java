package chap02;

public class House {
    private String name;
    private boolean apt;

    public House(String name, boolean apt) {
        this.name = name;
        this.apt = apt;
    }

    public String getName() {
        return name;
    }

    public boolean isApt() {
        return apt;
    }

    public void setApt(boolean apt) {
        this.apt = apt;
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(40, 30);
        System.out.println(rectangle.isSquare());
    }
}
