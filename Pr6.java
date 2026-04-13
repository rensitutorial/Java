public class Rectangle {
    double width = 1;
    double height = 1;

    Rectangle() {
    }

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4, 5);

        System.out.println("Default Rectangle Area: " + r1.getArea());
        System.out.println("Default Rectangle Perimeter: " + r1.getPerimeter());

        System.out.println("Rectangle Area: " + r2.getArea());
        System.out.println("Rectangle Perimeter: " + r2.getPerimeter());
    }
}

//output:Default Rectangle Area: 1.0
//Default Rectangle Perimeter: 4.0
//Rectangle Area: 20.0
//Rectangle Perimeter: 18.0
