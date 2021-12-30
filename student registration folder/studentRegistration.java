
package studentRegistration;

public class Main {
    private static int size1=1;
    public static void main(String[] args) {


        System.out.println("This program let students input their credentials for registration \n");

        String[] name = new String[size1];
        String[] age = new String[size1];
        String[] email = new String[size1];
        String[] course = new String[size1];

        studentRegistration callToMainMethod = new studentRegistration();
        callToMainMethod.studentDecision();
        System.out.print("Enter your Complete Name in the format SURNAME, FIRST NAME MIDDLE INITIAL: ");
        callToMainMethod.fillArray(name, name.length);
        System.out.print("Enter your age: ");
        callToMainMethod.fillArray(age, age.length);
        System.out.print("Enter your email: ");
        callToMainMethod.fillArray(email, email.length);
        System.out.print("Enter your course: ");
        callToMainMethod.fillArray(course, course.length);




        System.out.println("\n Student's credential \n");
        System.out.print("Name: ");
        callToMainMethod.printArray(name, name.length);
        System.out.println();
        System.out.print("Age: ");
        callToMainMethod.printArray(age, age.length);
        System.out.println();
        System.out.print("Email: ");
        callToMainMethod.printArray(email, email.length);
        System.out.println();
        System.out.print("Course: ");
        callToMainMethod.printArray(course, course.length);

        System.out.print("\n");
        callToMainMethod.sendAdditionalInfo();


    }
}
