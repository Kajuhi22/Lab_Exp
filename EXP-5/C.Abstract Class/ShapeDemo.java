abstract class shape {
    abstract double area();
}

class Rectangle extends shape {
    double l = 12.5, b = 2.5;

    double area() {
        return l * b;
    }
}

class Triangle extends shape {
    double b = 4.2, h = 6.5;

    double area() {
        return 0.5 * b * h;
    }
}

class Square extends shape {
    double s = 6.5;

    double area() {
        return 4 * s;
    }
}

class ShapeDemo {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Triangle t1 = new Triangle();
        Square s1 = new Square();
        System.out.println("The area of rectangle is: " + r1.area());
        System.out.println("The area of triangle is: " + t1.area());
        System.out.println("The area of square is: " + s1.area());
    }
}