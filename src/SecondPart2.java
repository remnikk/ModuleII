
public class SecondPart2 {
    private static double withdraw(double balance, double withdrawal, double comission) {
        return balance - balance * comission - withdrawal;
    }

    public static void main(String[] args) {
        double balance = 180, withdraw = 137.3, comission = 0.05;
        double balanceAfter = withdraw(balance, withdraw, comission);
        if (withdraw(balance, withdraw, comission) < 0)
            System.out.println("NO");
        else
            System.out.println("Ok " + comission + "%  " + balanceAfter);
    }
}



