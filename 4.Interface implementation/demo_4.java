interface Shape{
    public double area(double x);
}

class Square implements Shape{
    public double area(double a){
        double area = a*a;
        return area;
    }
}

class Circle implements Shape{
    public double area(double r){
        double area = Math.PI*r*r;
        return area;
    }
}

public class demo_4 {

    public static void main(String[] args){

        Square sq = new Square();
        System.out.println("square area: "+sq.area(2));
        Circle ci = new Circle();
        System.out.println("circle area: "+ci.area(3));
    }
}
