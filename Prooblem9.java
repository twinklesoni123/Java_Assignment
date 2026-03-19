10.Create an interface Bank with method getInterestRate(). Create classes SBI,
HDFC, and ICICI that implement the interface and return different interest rates.
Write a Java program to display the interest rate of each bank.
// Interface
interface Bank {
    double getInterestRate();
}

// SBI class
class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

// HDFC class
class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

// ICICI class
class ICICI implements Bank {
    public double getInterestRate() {
        return 7.5;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        Bank sbi = new SBI();
        Bank hdfc = new HDFC();
        Bank icici = new ICICI();

        System.out.println("SBI Interest Rate: " + sbi.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + hdfc.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.getInterestRate() + "%");
    }
}
