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

    public void printStudentCard() {
        System.out.println("Student Card:");
        System.out.println("------------------------");
        System.out.println("ID: " + get_ID());
        System.out.println("Full Name: " + get_firstName() + " " + get_lastName());
        System.out.println("Age: " + get_age());
        System.out.println("Seat Number: " + get_seatNumber());
        System.out.println("Grade: " + get_grade());
        System.out.println("------------------------");
    }

    public static Student readStudentInfo() {
        Student tempStudent = new Student(
                Util.readString("Enter first name: "), Util.readString("Enter last name: "),
                Util.readValidNumber("Enter you age: "), Util.readValidNumber("Enter your grade: "),
                Util.readValidNumber("Enter your seat number: "));

        return tempStudent;
    }

    public static void createStudent() {
        Student newStudent = readStudentInfo();

        Main.students.add(newStudent);
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

    

}
