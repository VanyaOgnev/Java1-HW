public class Projects2 {


    public static void main(String[] args) {
        System.out.println( within10and20(8,20));
         isPositiveOrNegative (-8);
        System.out.println (isNegative(8));
        printWordNTimes("Hello", 6);
        System.out.println (leapyear(400));
           }

    public static boolean within10and20(int a, int b) {


        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
          return false;


    }

    public static void isPositiveOrNegative(int x) {
        if(x >= 0){
            System.out.println("Positive");
        }
        else {
           System.out.println("Negative");
        }

    }
    public static boolean isNegative(int x){
        if (x <=0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void printWordNTimes(String word, int times) {
        for (int i = 1; i <= 10; i++) {
            System.out.println("[" + i + "]" + " " + word);
        }
    }
    public static boolean leapyear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    }