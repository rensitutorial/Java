class VolumeCalculator {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(float radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }
}

public class Pr12 {
    public static void main(String[] args) {

        VolumeCalculator v = new VolumeCalculator();

        System.out.println("Volume of Cube: " + v.calculateVolume(5));
        System.out.println("Volume of Rectangular Cube: " + v.calculateVolume(4, 5, 6));
        System.out.println("Volume of Sphere: " + v.calculateVolume(3.0f));
    }
}

//output:Volume of Cube: 125.0
//Volume of Rectangular Cube: 120.0
//Volume of Sphere: 113.09733552923255
