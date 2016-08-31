public class SecondPart3 {
//    public static void main(String[] args) {
 //       int[] balances = {1200, 250, 2000, 500, 3200};
  //      String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};
//        System.out.println();
  //  }
    //        private static double withdraw(double balance, double withdrawal, double comission) {
      //      return balance - balance * comission - withdrawal;
        //}
//
  //      public static void main(String[] args) {
    //        double balance = 180, withdraw = 137.3, comission = 0.05;
      //      double balanceAfter = withdraw(balance, withdraw, comission);
        //    if (withdraw(balance, withdraw, comission) < 0)
          //      System.out.println("NO");
            //else
              //  System.out.println("Ok " + comission + "%  " + balanceAfter);
        //}
//}



         static public void main(String[] args) {
                int[] balance = {570, 630, 2160, 243, 1867};
                String[] ownerNames = {"Jim", "Henk", "Mary", "Josh", "Bred"};
                double withdrawal = 250, comission =0.05;
                if (balance-withdrawal+comission*withdrawal)<0);
        }

        static private int max(int array1[], String[]) {

                int max = array[0];

                for (int i = 1; i < array.length; i++) if (max < array[i]) max = array[i];

                return max;

        }

        private static double withdraw(double balance, double withdrawal, double comission) {
         return balance-withdrawal+withdrawal*comission;
        }

        }