import java.util.ArrayList;

public class Student {
    private int _ID;
    private int _age;
    private int _grade;
    private int _seatNumber;
    private String _firstName;
    private String _lastName;
    private ArrayList<Course> enrolledCourses = new ArrayList<Course>();

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

    public void enroll(Course newCourse) {
        enrolledCourses.add(newCourse);
    }

    public ArrayList<Course> get_courses() {
        return enrolledCourses;
    }

    public void printStudentCard() {
        System.out.println("Student Card:");
        System.out.println("------------------------");
        System.out.println("ID          : " + get_ID());
        System.out.println("Full Name   : " + get_firstName() + " " + get_lastName());
        System.out.println("Age         : " + get_age());
        System.out.println("Seat Number : " + get_seatNumber());
        System.out.println("Grade       : " + get_grade());
        System.out.println("------------------------");
    }

    public void printStudentCourses() {
        if (enrolledCourses.size() == 0) {
            System.out.println("Student not enrolled in any course.");
            return;
        }

        for (Course enrolledCourse : enrolledCourses) {
            System.out.println("Course Info:");
            System.out.println("---------------------------");
            System.out.println("ID               : " + enrolledCourse.get_ID());
            System.out.println("Name             : " + enrolledCourse.get_name());
            System.out.println("Content          : " + enrolledCourse.get_content());
            System.out.println("Duration         : " + enrolledCourse.get_duration());
            System.out.println("Max Degree       : " + enrolledCourse.get_maxDegree());
            System.out.println("---------------------------");
        }
    }

    public void createStudent() {
        set_firstName(Util.readString("Enter first name: "));
        set_lastName(Util.readString("Enter last name: "));
        set_age(Util.readValidNumber("Enter you age: "));
        set_grade(Util.readValidNumber("Enter your grade: "));
        set_seatNumber(Util.readValidNumber("Enter your seat number: "));
        
        Main.students.add(this);
    }

    public static int findStudent() {
        int id;

        do {
            id = Util.readValidNumber("Enter the Student ID: ");

            for (int i = 0; i < Main.students.size(); i++)
                if (Main.students.get(i).get_ID() == id)
                    return i;

            System.out.println("The Student ID: " + id + " not found, please try again . . .");

        } while (true);
    }

    public static void updateStudent() {
        int index = findStudent();
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

    public static void deleteStudent() {
        int index = findStudent();
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
