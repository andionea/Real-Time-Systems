package L1;

public class ComplexNumber {
    
    public int real;
    public int imag;

    public ComplexNumber(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    public int getReal() {
        return real;
    }

    public void setReal(int real) {
        this.real = real;
    }

    public int getImag() {
        return imag;
    }

    public void setImag(int imag) {
        this.imag = imag;
    }

    @Override
    public String toString() {
        return this.real + " | " + this.imag;
    }

    public static ComplexNumber produsComplex(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber rez = new ComplexNumber(0,0);

        rez.real = n1.real * n2.real + n1.imag*n2.imag;
        rez.imag = n1.imag*n2.real + n1.real*n2.imag;

        return rez;
    }

    public static ComplexNumber sumaComplex(ComplexNumber n1, ComplexNumber n2) {
        ComplexNumber rez = new ComplexNumber(0,0);

        rez.real = n1.real + n2.real;
        rez.imag = n1.imag + n2.imag;

        return rez;
    }
}
