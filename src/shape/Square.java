package shape;

public class Square extends Rectangle {

    private final double side1;


    public Square(double side) {
        super(side, side); // sadasd
        this.side1 = 1000.1;
//        super.side1 = 100;
    }

    public double getSquareSide() {
        return side1;
    }

}