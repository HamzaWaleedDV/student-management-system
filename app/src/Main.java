import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class Util {
    public static String readString(String message){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        scanner.close();
        
        return str;
    }

    public static int readValidNumber(String message) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print(message + " ");

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input! That's not an integer. Try again: ");
            scanner.next(); // delete last input
        }

        num = scanner.nextInt();
        scanner.close();

        return num;
    }

    public static int genUniqueID() {
        int randomID = (int)Math.random() * 10000;
        
        for (int i = 0 ; i < Main.students.size();i++) {
            if (Main.students.get(i).get_ID() == randomID) {
                randomID = (int)Math.random() * 10000;
                i = 0;
            }
        }
        
        return randomID;
    }
}


public class Main {
    public static ArrayList<Student> students = new ArrayList<Student>();
    
    public static void main(String[] args) {

    }
}
