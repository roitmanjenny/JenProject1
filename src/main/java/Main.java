import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to currency converter");
        screen();
        System.out.println("Start over? (Y/N)");
        Scanner s3 = new Scanner(System.in);
        String over = s3.next();

        switch (over){
            case "Y":
                screen();
                break;
            case "N":
                end();
                break;
        }
    }
    public static void screen() {
        System.out.println("Please choose an option (1/2):");
        System.out.println("1. Dollars to Shekels");
        System.out.println("2. Shekels to Dollars");
        Scanner s1 = new Scanner(System.in);
        int number = s1.nextInt();
        System.out.println("Please enter an amount to convert");
        Scanner s2 = new Scanner(System.in);
        double input = s2.nextDouble();

        double result = 0;
        switch (number) {
            case 1:
                result = Usd.calculate(input);
            case 2:
                result = Ils.calculate(input);
        }
        System.out.println("Your results is:" + result);
        ArrayList<Double> myList = new ArrayList<Double>();
        myList.add(result);
    }
    public static void end(){
        System.out.println("Thanks for using our currency converter");
        // Print all the array elements
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

}
