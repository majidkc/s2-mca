import java.util.Scanner;
public class Complex {
    int real;
    int imag;

    public void printComplex() {
        System.out.println(this.real + " + i" + this.imag);
    }

    public void readData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real part :");
        this.real = sc.nextInt();
        System.out.println("Enter imaginary part :");
        this.imag = sc.nextInt();
    }

    public static Complex addComplex(Complex c1, Complex c2) {
        Complex res = new Complex();
        res.real = c1.real + c2.real;
        res.imag = c1.imag + c2.imag;
        return res;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Complex c1 = new Complex();
        Complex c2 = new Complex();
        c1.readData();
        c2.readData();
        c1.printComplex();
        c2.printComplex();
        Complex res = addComplex(c1, c2);
        res.printComplex();
    }
}
