import java.util.ArrayList;

public class Student {
    private int _ID;
    private int _age;
    private int _grade;
    private int _seatNumber;
    private String _firstName;
    private String _lastName;
    private ArrayList<Course> enrolledCourses = new ArrayList<Course>();

    public Student(int age, int grade, int seatNumber, String firstName, String lastName) {
        set_ID(Util.genUniqueStudentID());
        set_firstName(firstName);
        set_lastName(lastName);
        set_age(age);
        set_grade(grade);
        set_seatNumber(seatNumber);

        Main.students.add(this);
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

    public void enroll(Course newCourse) {
        enrolledCourses.add(newCourse);
        newCourse.setStudents(newCourse.getStudents() + 1);
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

    public static int findStudent(int studentID) {

        for (int i = 0; i < Main.students.size(); i++)
            if (Main.students.get(i).get_ID() == studentID)
                return i;

        return -1;

    }

    public static boolean updateStudent(int studentIndex, String targetString, String desString) {
        switch (targetString) {
            case "First Name":
                Main.students.get(studentIndex).set_firstName(desString);
                return true;
            case "Last Name":
                Main.students.get(studentIndex).set_lastName(desString);
                return true;
            case "Age":
                Main.students.get(studentIndex).set_age(Integer.parseInt(desString));
                return true;
            case "Grade":
                Main.students.get(studentIndex).set_grade(Integer.parseInt(desString));
                return true;
            case "Seat Number":
                Main.students.get(studentIndex).set_seatNumber(Integer.parseInt(desString));
                return true;
            default:
                return false;
        }
    }

    public static boolean deleteStudent(int studentIndex) {
        if (findStudent(studentIndex) == -1)
            return false;

        for (Course course : Main.students.get(studentIndex).enrolledCourses)
            course.setStudents(course.getStudents() - 1);

        Main.students.remove(studentIndex);
        return true;
    }
}
