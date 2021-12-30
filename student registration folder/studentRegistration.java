package studentRegistration;

import java.util.Scanner;
public class studentRegistration {
    static Scanner read = new Scanner(System.in);

    public static void fillArray(String[] list, int noOfElements){
        int index;
        for(index = 0; index < noOfElements; index++){
            list[index] = read.nextLine();
        }
    }
    public static void printArray( String[] list, int noOfElements){
        int index;
        for(index = 0; index < noOfElements; index++){
            System.out.print(list[index] + " ");
        }
    }
    public static void studentDecision(){
        String decide;
        System.out.println("Would you like to enroll in this school? Yes or No? ");
        decide = read.nextLine();
        if (decide.equalsIgnoreCase("Yes")) {
            System.out.println("Nice! We will proceed to the next step");
        }
        else{
            System.out.println("Thank you, feel free to come back if you change your mind!");
            System.exit(0);
        }
    }
    public static void sendAdditionalInfo(){
        System.out.println("\n Thank you for registering");
        System.out.println("Wait for 3 working days to process your information! We'll be sending you ny that time, an email for the enrollment part");
    }
}
