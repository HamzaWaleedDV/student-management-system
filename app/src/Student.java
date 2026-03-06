import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {
    private int _ID;
    private int _age;
    private int _grade;
    private int _seatNumber;
    private String _firstName;
    private String _lastName;

    public Student(String firstName, String lastName, int age, int grade, int seatNumber) {
        _firstName = firstName;
        _lastName = lastName;
        _age = age;
        _ID = Util.genUniqueID();
        _seatNumber = seatNumber;
        _grade = grade;
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public int get_age() {
        return _age;
    }

    public void set_age(int _age) {
        this._age = _age;
    }

    public int get_grade() {
        return _grade;
    }

    public void set_grade(int _grade) {
        this._grade = _grade;
    }

    public int get_seatNumber() {
        return _seatNumber;
    }

    public void set_seatNumber(int _seatNumber) {
        this._seatNumber = _seatNumber;
    }

    public String get_firstName() {
        return _firstName;
    }

    public void set_firstName(String _firstName) {
        this._firstName = _firstName;
    }

    public String get_lastName() {
        return _lastName;
    }

    public void set_lastName(String _lastName) {
        this._lastName = _lastName;
    }

    public static void createStudent() {
        Student newStudent = new Student(Util.readString("Enter first name: "), Util.readString("Enter last name: "),
                Util.readValidNumber("Enter you age: "), Util.readValidNumber("Enter your grade: "),
                Util.readValidNumber("Enter your seat number: "));

        Main.students.add(newStudent);
    }

    public static void updateStudent() {
        int index = findStudent(Util.readValidNumber("Please Enter Student ID: "));
        Scanner scanner = new Scanner(System.in);
        Main.students.get(index).printStudentCard();
        String userInput = Util
                .readString("What do you want to update? (First Name, Last Name, Age, Grade, Seat Number)");
        switch (userInput) {
            case "First Name":
                String firstName = Util.readString("Please enter new First Name: ");
                Main.students.get(index).set_firstName(firstName);
                break;
            case "Last Name":
                String lastname = Util.readString("Please enter new Last Name: ");
                Main.students.get(index).set_lastName(lastname);
            case "Age":
                int age = Util.readValidNumber("Please Enter new age: ");
                Main.students.get(index).set_age(age);
            case "Grade":
                int grade = Util.readValidNumber("Please Enter new grade: ");
                Main.students.get(index).set_grade(grade);
            case "Seat Number":
                int seatNumber = Util.readValidNumber("Please Enter new Seat Number: ");
                Main.students.get(index).set_seatNumber(seatNumber);
            default:
                System.out.println("Invalid input, Please Try again.");
                break;
        }
    }

    // public void updateStudent() {
    //     String userInput = Util
    //             .readString("What do you want to update? (First Name, Last Name, Age, Grade, Seat Number)");
    //     switch (userInput) {
    //         case "First Name":
    //             String firstName = Util.readString("Please enter new First Name: ");
    //             set_firstName(firstName);
    //             break;
    //         case "Last Name":
    //             String lastname = Util.readString("Please enter new Last Name: ");
    //             set_lastName(lastname);
    //         case "Age":
    //             int age = Util.readValidNumber("Please Enter new age: ");
    //             set_age(age);
    //         case "Grade":
    //             int grade = Util.readValidNumber("Please Enter new grade: ");
    //             set_grade(grade);
    //         case "Seat Number":
    //             int seatNumber = Util.readValidNumber("Please Enter new Seat Number: ");
    //             set_seatNumber(seatNumber);
    //         default:
    //             System.out.println("Invalid input, Please Try again.");
    //             break;
    //     }
    // }

    public static void deleteStudent() {
        int index = findStudent(Util.readValidNumber("Please Enter Student ID: "));
        Scanner scanner = new Scanner(System.in);
        Main.students.get(index).printStudentCard();
        String userInput = Util
                .readString("Are you sure you wnat to delete this student? (Y, N)");
        switch (userInput) {
            case "Y":
                Main.students.remove(index);
                break;
            default:
                System.out.println("Nothing have changed.");
                break;
        }
        
    }

}
