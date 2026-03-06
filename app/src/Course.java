public class Course {
    private int _ID;
    private int _maxDegree;
    private int students = 0;
    private String _name;
    private String _content;
    private String _duration;



    public Course(int _maxDegree, int students, String _name, String _content, String _duration) {
        set_ID(Util.genUniqueCourseID());
        set_maxDegree(_maxDegree);
        setStudents(students);
        set_name(_name);
        set_content(_content);
        set_duration(_duration);
        Main.courses.add(this);
        this.students++;
    }

    public int get_ID() {
        return _ID;
    }

    public void set_ID(int _ID) {
        this._ID = _ID;
    }

    public int get_maxDegree() {
        return _maxDegree;
    }

    public void set_maxDegree(int _maxDegree) {
        this._maxDegree = _maxDegree;
    }

    public  int getStudents() {
        return students;
    }

    public  void setStudents(int students) {
        this.students = students;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_content() {
        return _content;
    }

    public void set_content(String _content) {
        this._content = _content;
    }

    public String get_duration() {
        return _duration;
    }

    public void set_duration(String _duration) {
        this._duration = _duration;
    }

    public void printCourseCard() {
        System.out.println("Course Info:");
        System.out.println("---------------------------");
        System.out.println("ID               : " + get_ID());
        System.out.println("Name             : " + get_name());
        System.out.println("Content          : " + get_content());
        System.out.println("Duration         : " + get_duration());
        System.out.println("Max Degree       : " + get_maxDegree());
        System.out.println("Enrolled Student : " + students);
        System.out.println("---------------------------");
    }

    public static int findCourse() {
        int id;

        do {
            id = Util.readValidNumber("Enter the Course ID: ");

            for (int i = 0; i < Main.courses.size(); i++)
                if (Main.courses.get(i).get_ID() == id)
                    return i;

            System.out.println("The Course ID: " + id + " not found, please try again . . .");

        } while (true);
    }

    public static void updateCourse() {
        int index = findCourse();
        Main.courses.get(index).printCourseCard();
        String userInput = Util
                .readString("What do you want to update? (Course Title, Content, Duration, Max Degree)");
        switch (userInput) {
            case "Course Title":
                String name = Util.readString("Please enter new Course Title: ");
                Main.courses.get(index).set_name(name);
                break;
            case "Content":
                String content = Util.readString("Please enter new Course Content: ");
                Main.courses.get(index).set_content(content);
            case "Duration":
                String duration = Util.readString("Please Enter new Duration: ");
                Main.courses.get(index).set_duration(duration);
            case "Max Degree":
                int maxDegree = Util.readValidNumber("Please Enter new Max Degree: ");
                Main.courses.get(index).set_maxDegree(maxDegree);
            default:
                System.out.println("Invalid input, Please Try again.");
                break;
        }
    }

    public static void deleteCourse() {
        int index = findCourse();
        Main.courses.get(index).printCourseCard();
        String userInput = Util
                .readString("Are you sure you wnat to delete this student? (Y, N)");
        switch (userInput) {
            case "Y":
                Main.courses.remove(index);
                break;
            default:
                System.out.println("Nothing have changed.");
                break;
        }
    }

}
