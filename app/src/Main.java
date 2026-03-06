import java.util.ArrayList;
import java.util.Scanner;

class Util {
    public static String readString(String message){
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        
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

        return num;
    }

    public static int genUniqueStudentID() {
        int randomID = (int)(Math.random() * 10000);
        
        for (int i = 0 ; i < Main.students.size();i++) {
            if (Main.students.get(i).get_ID() == randomID) {
                randomID = (int)(Math.random() * 10000);
                i = 0;
            }
        }
        
        return randomID;
    }

    public static int genUniqueCourseID() {
        int randomID = (int)(Math.random() * 10000);
        
        for (int i = 0 ; i < Main.courses.size();i++) {
            if (Main.courses.get(i).get_ID() == randomID) {
                randomID = (int)(Math.random() * 10000);
                i = 0;
            }
        }
        
        return randomID;
    }
}


public class Main {
    public static ArrayList<Student> students = new ArrayList<Student>();
    public static ArrayList<Course>  courses  = new ArrayList<Course> ();
    public static void main(String[] args) {

        Course course1 = new Course(100, 0, "Java", "OOP Programming Language", "3 Months");
        Course course2 = new Course(80, 0, "Python", "General Purpose Programming Language", "2 Months");
        course1.printCourseCard();
        course2.printCourseCard();

    }
    
}
