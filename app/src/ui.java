public class ui {

    public static void printMainMenu() {
        int userInput;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out
                .println("\t\t  *************************************************************************************");
        System.out
                .println("\t\t  *****                                                                           *****");
        System.out
                .println("\t\t  *****             S T U D E N T   M A N A G E M E N T  S Y S T E M              *****");
        System.out
                .println("\t\t  *****            = = = = = = = = = = = = = = = = = = = = = = = = = =            *****");
        System.out
                .println("\t\t  *****                      = = = = = = = = = = = = = = =                        *****");
        System.out
                .println("\t\t  *************************************************************************************");
        System.out
                .println("\t\t                                                                                       ");
        System.out
                .println("\t\t                                                                                       ");
        System.out
                .println("\t\t                         [1] Students Dashboard                                        ");
        System.out
                .println("\t\t                                                                                       ");
        System.out
                .println("\t\t                         [2] Courses  Dashboard                                        ");
        System.out
                .println("\t\t                                                                                       ");
        System.out
                .println("\t\t                                                                                       ");
        userInput = Util.readValidNumber("\t\t                         Enter Your Option : ");
        switch (userInput) {
            case 1:
                printStudentMenu();
                break;
            case 2:
                printCourseMenu();
                break;
            default:
                System.out.println(
                        "\t\t                                                                                       ");
                System.out.println(
                        "\t\t                                                                                       ");
                System.out.println("\t\t                         Invalid Input, Please Try Again.");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                break;
        }
    }

    // ==========================================================
    //                       Courses UI 
    // ==========================================================

    public static void printCourseMenu() {
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            int userInput;
            System.out.println(
                    "\t\t  *************************************************************************************");
            System.out.println(
                    "\t\t  *****                                                                           *****");
            System.out.println(
                    "\t\t  *****                       C O U R S E   D A S H B O A R D                     *****");
            System.out.println(
                    "\t\t  *****              = = = = = = = = = = = = = = = = = = = = = = = =              *****");
            System.out.println(
                    "\t\t  *****                      = = = = = = = = = = = = = = =                        *****");
            System.out.println(
                    "\t\t  *************************************************************************************");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out
                    .println("\t\t                         [1] Add New Course                                   ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out
                    .println("\t\t                         [2] Update  Course                                   ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out
                    .println("\t\t                         [3] Delete  Course                                   ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out
                    .println("\t\t                         [4] Find    Course                                   ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                                  [5] show    Course List                               ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                                  [0] Return To Main Menu                              ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                                                                                       ");
            userInput = Util.readValidNumber("\t\t                         Enter Your Option : ");
            switch (userInput) {
                case 1:
                    addNewCourse();
                    break;
                case 2:
                    udpateCourse();
                    break;
                case 3:
                    deleteCourse();
                    break;
                case 4:
                    findCourse();
                    break;
                case 5:
                    showCourserList();
                    break;
                case 0:
                    return;
                default:
                    System.out.println(
                            "\t\t                                                                                       ");
                    System.out.println(
                            "\t\t                                                                                       ");
                    System.out.println(
                            "\t\t                         Invalid Input, Please Try Again.");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    break;
            }
        }
    }

    public static void addNewCourse() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        int maxDegree;
        String name;
        String content;
        String duration;
        System.out.println(
                "\t\t  *************************************************************************************");
        System.out.println(
                "\t\t  *****                                                                           *****");
        System.out.println(
                "\t\t  *****                      C R E A T  N E W  C O U R S E                        *****");
        System.out.println(
                "\t\t  *****             = = = = = = = = = = = = = = = = = = = = = = =                 *****");
        System.out.println(
                "\t\t  *****                        = = = = = = = = = = = = =                          *****");
        System.out.println(
                "\t\t  *************************************************************************************");
        System.out.println(
                "\t\t                                                                                       ");
        maxDegree = Util.readValidNumber("\t\t                         Enter Max Degree      : ");
        System.out.println(
                "\t\t                                                                                       ");
        name = Util.readString("\t\t                         Enter Course Name     : ");
        System.out.println(
                "\t\t                                                                                       ");
        content = Util.readString("\t\t                         Enter Course Content  : ");
        System.out.println(
                "\t\t                                                                                       ");
        duration = Util.readString("\t\t                         Enter Course Duration : ");

        Course temCourse = new Course(maxDegree, name, content, duration);

        System.out.println(
                "\t\t                                                                                       ");
        System.out.println(
                "\t\t                                                                                       ");
        System.out.println(
                "\t\t                         C O U R S E   C R E A T E D   S U C C E S S F U L L Y !");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return;
    }

    public static void udpateCourse() {
        int ID;
        int courseIndex;
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(
                "\t\t  *************************************************************************************");
        System.out.println(
                "\t\t  *****                                                                           *****");
        System.out.println(
                "\t\t  *****                       U P D A T E   C O U R S E                           *****");
        System.out.println(
                "\t\t  *****               = = = = = = = = = = = = = = = = = = = = =                   *****");
        System.out.println(
                "\t\t  *****                       = = = = = = = = = = = = =                           *****");
        System.out.println(
                "\t\t  *************************************************************************************");
        System.out.println(
                "\t\t                                                                                       ");
        ID = Util.readValidNumber("\t\t                         Enter Course ID : ");
        courseIndex = Course.findCourse(ID);
        if (courseIndex == -1) {
                System.out.println(
                        "\t\t                                                                                       ");
                System.out.println(
                        "\t\t                                                                                       ");
                System.out.println(
                        "\t\t                           Invalid ID, Please Try Again.");
                try {
                Thread.sleep(2000);
                } catch (InterruptedException e) {
                e.printStackTrace();
                }                
        }
        while(true){
                System.out.print("\033[H\033[2J");
                System.out.flush(); // maxDegree, name, content, duration
                int userInput;
                Main.courses.get(courseIndex).printCourseCard();
                        System.out.println();
                        System.out.println();
                System.out.println(
                        "\t\t  *************************************************************************************");
                System.out.println(
                        "\t\t  *****            C O U R S E   L O A D E D   S U C C E S S F U L L Y            *****");
                System.out.println(
                        "\t\t  *****                = = = = = = = = = = = = = = = = = = = = =                  *****");
                System.out.println(
                        "\t\t  *************************************************************************************");
                System.out.println(
                        "\t\t                                                                                       ");
                System.out.println(
                        "\t\t                                                                                       ");
                System.out
                        .println("\t\t                         [1] Update  Course Title                              ");
                System.out.println(
                        "\t\t                                                                                       ");
                System.out
                        .println("\t\t                         [2] Update  Course Content                           ");
                System.out.println(
                        "\t\t                                                                                       ");
                System.out
                        .println("\t\t                         [3] Update  Course Duration                          ");
                System.out.println(
                        "\t\t                                                                                       ");
                System.out
                        .println("\t\t                         [4] Update  Course Max Degree                        ");
                System.out.println(
                        "\t\t                                                                                       ");
                System.out
                        .println("\t\t                         [0] Return To Dashboard                              ");
                System.out.println();
                System.out.println();
                        userInput = Util.readValidNumber("\t\t                         Enter Your Option : ");
                switch (userInput) {
                        case 1:
                                String newTitle;
                                newTitle = Util.readString("\t\t                         Enter New Name : ");
                                Course.updateCourse(courseIndex, "Course Title", newTitle);
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                         C O U R S E   U P D A T E D   S U C C E S S F U L L Y !");
                                try {
                                Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                e.printStackTrace();
                                }
                                return;
                        case 2:
                                String Content;
                                Content = Util.readString("\t\t                         Enter New Content : ");
                                Course.updateCourse(courseIndex, "Content", Content);
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                         C O U R S E   U P D A T E D   S U C C E S S F U L L Y !");
                                try {
                                Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                e.printStackTrace();
                                }
                                return;
                        case 3:
                                String newDuration;
                                newDuration = Util.readString("\t\t                         Enter New Duration : ");
                                Course.updateCourse(courseIndex, "Duration", newDuration);
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                         C O U R S E   U P D A T E D   S U C C E S S F U L L Y !");
                                try {
                                Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                e.printStackTrace();
                                }
                                return;
                        case 4:
                                int newMaxDegree;
                                newMaxDegree = Util.readValidNumber("\t\t                         Enter New Name : ");
                                Course.updateCourse(courseIndex, "Max Degree", newMaxDegree);
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                         C O U R S E   U P D A T E D   S U C C E S S F U L L Y !");
                                try {
                                Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                e.printStackTrace();
                                }
                                return;
                        case 0:
                                return;
                        default:
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                                                                                       ");
                                System.out.println(
                                        "\t\t                           Invalid ID, Please Try Again.");
                                try {
                                Thread.sleep(2000);
                                } catch (InterruptedException e) {
                                e.printStackTrace();
                                }                
                                break;
                }
        }
    }


    // ==========================================================
    //                       Students UI 
    // ==========================================================

    public static void printStudentMenu() {
        while (true) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            int userInput;
            System.out.println(
                    "\t\t  *************************************************************************************");
            System.out.println(
                    "\t\t  *****                                                                           *****");
            System.out.println(
                    "\t\t  *****                    S T U D E N T   D A S H B O A R D                      *****");
            System.out.println(
                    "\t\t  *****            = = = = = = = = = = = = = = = = = = = = = = = = = =            *****");
            System.out.println(
                    "\t\t  *****                      = = = = = = = = = = = = = = =                        *****");
            System.out.println(
                    "\t\t  *************************************************************************************");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                         [1] Add New Student                                           ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                         [2] Update  Student                                           ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                         [3] Delete  Student                                           ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                         [4] Update  Student                                           ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                         [5] Enroll  Student In Course                                 ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                         [0] Return To Main Menu                                       ");
            System.out.println(
                    "\t\t                                                                                       ");
            System.out.println(
                    "\t\t                                                                                       ");
            userInput = Util.readValidNumber("\t\t                         Enter Your Option : ");

            switch (userInput) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    updateStudent();
                    break;
                case 3:
                    deleteStudent();
                    break;
                case 4:
                    findStudent();
                    break;
                case 5:
                    enrollStudentInCourse();
                    break;
                case 0:
                    return;
                default:
                    System.out.println(
                            "\\t\\t                         Invalid Input, Please try again . . .");
            }
        }
    }

    public static void addNewStudent() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out.println(
                "\t\t  *************************************************************************************");
        System.out.println(
                "\t\t  *****                                                                           *****");
        System.out.println(
                "\t\t  *****                    C R E A T E  N E W   S T U D E N T                     *****");
        System.out.println(
                "\t\t  *****            = = = = = = = = = = = = = = = = = = = = = = = = = =            *****");
        System.out.println(
                "\t\t  *****                      = = = = = = = = = = = = = = =                        *****");
        System.out.println(
                "\t\t  *************************************************************************************");

        String firstName = Util.readString("\t\t                         Enter your first name: ");
        System.out.println("");

        String lastName = Util.readString("\t\t                         Enter your last name: ");
        System.out.println("");

        int age = Util.readValidNumber("\t\t                         Enter your age: ");
        System.out.println("");

        int grade = Util.readValidNumber("\t\t                         Enter your grade: ");
        System.out.println("");

        int seatNumber = Util.readValidNumber("\t\t                         Enter your seat number: ");
        System.out.println("");

        Student newStudent = new Student(age, grade, seatNumber, firstName, lastName);

        System.out.println("\t\t                         Student Created Successfully!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void updateStudent() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out
                .println("\t\t  *************************************************************************************");
        System.out
                .println("\t\t  *****                                                                           *****");
        System.out
                .println("\t\t  *****                       U P D A T E   S T U D E N T                         *****");
        System.out
                .println("\t\t  *****            = = = = = = = = = = = = = = = = = = = = = = = = = =            *****");
        System.out
                .println("\t\t  *****                      = = = = = = = = = = = = = = =                        *****");
        System.out
                .println("\t\t  *************************************************************************************");

        int studentID = Util.readValidNumber("\t\t                         Enter student ID to update: ");

        while (Student.findStudent(studentID) == -1) {
            System.out
                    .println("\t\t                         Student with " + studentID + " NOT found!, Try again . . .");

            studentID = Util.readValidNumber("\t\t                         Enter student ID to update: ");
        }

        Main.students.get(studentID).printStudentCard();

        String toUpdate = Util.readString(
                "\n\t\t                         What do you want to update (First Name), (Last Name), (Age), (Grade), (Seat Number): ");

        while (toUpdate != "First Name" || toUpdate != "Last Name" || toUpdate != "Age" || toUpdate != "Grade"
                || toUpdate != "Seat Number") {
            System.out.println("\t\t                         " + toUpdate + " NOT found, try again . . .");
            toUpdate = Util.readString(
                    "\t\t                         What do you want to update (First Name), (Last Name), (Age), (Grade), (Seat Number): ");
        }

        Student.updateStudent(studentID, toUpdate,
                Util.readString("\t\t                         Updated (" + toUpdate + ") is: "));

        System.out.println("\t\t                         Student Updated Successfully!");

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void deleteStudent() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out
                .println("\t\t  *************************************************************************************");
        System.out
                .println("\t\t  *****                                                                           *****");
        System.out
                .println("\t\t  *****                       D E L E T E   S T U D E N T                         *****");
        System.out
                .println("\t\t  *****            = = = = = = = = = = = = = = = = = = = = = = = = = =            *****");
        System.out
                .println("\t\t  *****                      = = = = = = = = = = = = = = =                        *****");
        System.out
                .println("\t\t  *************************************************************************************");

        int studentID = Util.readValidNumber("\t\t                         Enter student ID to delete: ");

        while (Student.findStudent(studentID) == -1) {
            System.out
                    .println("\t\t                         Student with " + studentID + " NOT found!, Try again . . .");

            studentID = Util.readValidNumber("\t\t                         Enter student ID to dele: ");
        }

        Main.students.get(studentID).printStudentCard();

        String wantToDelete = "n";
        wantToDelete = Util.readString("\t\t                         Are you sure to delete this student (Y/N): ");

        if (wantToDelete == "y" || wantToDelete == "Y") {
            Student.deleteStudent(studentID);
            System.out.println("\t\t                         Student Deleted Successfully!");
        }

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public static void findStudent() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out
                .println("\t\t  *************************************************************************************");
        System.out
                .println("\t\t  *****                                                                           *****");
        System.out
                .println("\t\t  *****                         F I N D   S T U D E N T                           *****");
        System.out
                .println("\t\t  *****            = = = = = = = = = = = = = = = = = = = = = = = = = =            *****");
        System.out
                .println("\t\t  *****                      = = = = = = = = = = = = = = =                        *****");
        System.out
                .println("\t\t  *************************************************************************************");

        int studentID = Util.readValidNumber("\t\t                         Enter student ID: ");

        while (Student.findStudent(studentID) == -1) {
            System.out
                    .println("\t\t                         Student with " + studentID + " NOT found!, Try again . . .");

            studentID = Util.readValidNumber("\t\t                         Enter student ID: ");
        }

        Student.findStudent(studentID);
    }

    public static void enrollStudentInCourse() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
        System.out
                .println("\t\t  *************************************************************************************");
        System.out
                .println("\t\t  *****                                                                           *****");
        System.out
                .println("\t\t  *****                      E N R O L L  I N  C O U R S E                        *****");
        System.out
                .println("\t\t  *****            = = = = = = = = = = = = = = = = = = = = = = = = = =            *****");
        System.out
                .println("\t\t  *****                      = = = = = = = = = = = = = = =                        *****");
        System.out
                .println("\t\t  *************************************************************************************");

        int studentID = Util.readValidNumber("\t\t                         Enter student ID to enroll in course: ");

        while (Student.findStudent(studentID) == -1) {
            System.out
                    .println("\t\t                         Student with " + studentID + " NOT found!, Try again . . .");

            studentID = Util.readValidNumber("\t\t                         Enter student ID to enroll in course: ");
        }

        Main.students.get(studentID).printStudentCard();

        int courseID = Util.readValidNumber("\t\t                         Enter course ID to enroll: ");

        while (Course.findCourse(courseID) == -1) {
            System.out
                    .println("\t\t                         Course with " + studentID + " NOT found!, Try again . . .");

            studentID = Util.readValidNumber("\t\t                         Enter course ID to enroll: ");
        }

        Main.students.get(studentID).enroll(Main.courses.get(courseID));

        System.out.println("\t\t                         Enrolled Successfully!");
    }

}