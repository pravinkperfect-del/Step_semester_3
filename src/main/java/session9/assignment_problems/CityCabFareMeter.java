package main.java.session9.assignment_problems;
import java.util.*;

interface NightService {
    double nightFare(double fare);
}
abstract class Cab {
    double km;
    Cab(double km) {
        this.km = km;
    }
    abstract double calculateFare();

    double fare() {
        return Math.max(km * rate(), 100);
    }
    abstract double rate();
}

class Mini extends Cab {
    Mini(double km) {
        super(km);
    }
    double rate() {
        return 10;
    }
    double calculateFare() {
        return fare();
    }
}

class Sedan extends Cab implements NightService {
    Sedan(double km) {
        super(km);
    }
    double rate() {
        return 14;
    }
    public double nightFare(double fare) {
        return fare * 1.2;
    }
    double calculateFare() {
        return fare();
    }
}

class SUV extends Cab implements NightService {
    SUV(double km) {
        super(km);
    }
    double rate() {
        return 18;
    }
    public double nightFare(double fare) {
        return fare * 1.2;
    }
    double calculateFare() {
        return fare();
    }
}

public class CityCabFareMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double total = 0;

        for (int i = 0; i < n; i++) {
            String type = sc.next();
            double km = sc.nextDouble();
            String time = sc.next();

            Cab c;

            if (type.equals("MINI"))
                c = new Mini(km);
            else if (type.equals("SEDAN"))
                c = new Sedan(km);
            else
                c = new SUV(km);

            if (time.equals("NIGHT") && !(c instanceof NightService)) {
                System.out.println(type + ": night service not available");
                continue;
            }

            double amount = c.calculateFare();

            if (time.equals("NIGHT"))
                amount = ((NightService) c).nightFare(amount);

            total += amount;
            System.out.printf("%s: %.2f%n", type, amount);
        }

        System.out.printf("Total: %.2f%n", total);
        sc.close();
    }
}