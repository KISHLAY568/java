public class Course {

    // Data fields
    private String courseName;
    private String[] students = new String[100]; // null, null, null... null
    private int numberOfStudents; // 0

    // Constructors
    public Course(String courseName) {
        this.courseName = courseName;
    }

    // Getters and Setters

    public String getCourseName() {
        return courseName;
    }

    public String[] getStudent() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }
    // Methods

    public void addStudent(String student) {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {

    }

}