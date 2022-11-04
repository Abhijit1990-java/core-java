package Day2;

public class BankFunction1 {
    public static void main(String[] args) {
        long principal = 60000;
        float rate = 5.67f;//yearly
        int time = 5;//monthly
        double CalculatedInterest = CalculateInterest(principal, rate, time);
        deposit(CalculatedInterest);
        System.out.println(CalculatedInterest);

        double interest = (principal * rate * time / 100);
        System.out.println(interest);

        principal = 70000;
        rate = 9.67f;
        time = 6;

        CalculatedInterest = CalculateInterest(principal, rate, time);
        System.out.println(CalculatedInterest);


        principal = 80000;
        rate = 10.78f;
        time = 7;

        CalculatedInterest = CalculateInterest(principal, rate, time);
        System.out.println(CalculatedInterest);


    }

    static double CalculateInterest(long p, float r, int t) {
        return p * r * t / 100;

    }

    static void deposit(double CalculatedInterest) {


    }
}




