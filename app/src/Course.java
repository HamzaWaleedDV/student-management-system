public class Course {
    private int _ID;
    private int _maxDegree;
    private int students = 0;
    private String _name;
    private String _content;
    private String _duration;

    public Course(int _maxDegree, String _name, String _content, String _duration) {
        set_ID(Util.genUniqueCourseID());
        set_maxDegree(_maxDegree);
        set_name(_name);
        set_content(_content);
        set_duration(_duration);
        Main.courses.add(this);
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

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
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

    public static int findCourse(int id) {
        for (int i = 0; i < Main.courses.size(); i++)
            if (Main.courses.get(i).get_ID() == id)
                return i;
        return -1;
    }

    public static boolean updateCourse(int index, String userInput, String newinfo) {
        switch (userInput) {
            case "Course Title":
                Main.courses.get(index).set_name(newinfo);
                return true;
            case "Content":
                Main.courses.get(index).set_content(newinfo);
                return true;
            case "Duration":
                Main.courses.get(index).set_duration(newinfo);
                return true;
            default:
                return false;
        }
    }

    public static boolean updateCourse(int index, String userInput, int newinfo) {
        switch (userInput) {
            case "Max Degree":
                Main.courses.get(index).set_maxDegree(newinfo);
                return true;
            default:
                return false;
        }
    }
    

    private static void deleteCoursesFromStudent(int id) {
        for(int i = 0 ; i > Main.students.size();i++){
                for(int j = 0 ; j > Main.students.get(i).get_courses().size() ; j++){
                    if (id == Main.students.get(i).get_courses().get(j).get_ID()) {
                        Main.students.get(i).get_courses().remove(j);
                        j--; 
                    }
                }
            }
    }


    public static boolean deleteCourse(int index) {
        if (index >= 0 && index < Main.courses.size()) {
            deleteCoursesFromStudent(Main.courses.get(index).get_ID());
            Main.courses.remove(index);
            return true;
        } else {
            return false;
        }
    }

}
