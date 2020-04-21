public class JavaMethods {

    public static void main(String[] args) {

        String pay;

           pay = finalPay(85);
           displayAmount("Billu", pay);

           pay = finalPay(75);
           displayAmount("Heysus", pay);

           pay = finalPay(5);
           displayAmount("Flaco", pay);

    }
    public static String finalPay(int money) {

        String pay;
        if (money >= 80 && money <= 90) {
            pay = "Ballin";
        } else if (money >= 70 && money < 80) {
            pay = "Chillen";
        } else if (money >= 60 && money < 70) {
            pay = "Good";
        } else {
            pay = "Okay";
        }

        return pay;

    }
        public static void displayAmount(String barberName, String money){
            System.out.println("_____________________________");
            System.out.println("Salary of " + barberName + " is:" + money);
            System.out.println("_____________________________");
        }

    }


