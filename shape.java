import java.util.*;

abstract class TwoD {
    public int l;
    public int b;
    public double area;
    public float r;

    void getdata(int n) {
        Scanner sc = new Scanner(System.in);
        if (n == 1 || n == 2) {
            System.out.println("Enter 1st dimension");
            l = sc.nextInt();
            System.out.println("Enter 2nd dimension");
            b = sc.nextInt();
        } else {
            System.out.println("enter radius:");
            r = sc.nextFloat();
        }
    }

    abstract void calculate();

    void display() {
        System.out.println("Area = " + area);
    }
}

class Rectangle extends TwoD {
    void calculate() {
        area = l * b;

    }
}

class Triangle extends TwoD {
    void calculate() {
        area = (l * b) / 2;

    }
}

class Circle extends TwoD {
    void calculate() {
        area = 3.14 * r * r;
    }
}

class shape {
    public static void main(String args[]) {
        Rectangle R = new Rectangle();
        Triangle T = new Triangle();
        Circle C = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter\n1.rectangle\n2.triangle\n3.circle");
        int n = sc.nextInt();
        switch (n) {
        case 1:
            R.getdata(n);
            R.calculate();
            R.display();
            break;

        case 2:
            T.getdata(n);
            T.calculate();
            T.display();
            break;

        case 3:
            C.getdata(n);
            C.calculate();
            C.display();
            break;

        default:
            System.out.println("invlid input");
        }
    }
}