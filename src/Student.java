public class Student {
    private int id;
    private String name;
    private String course;
    public String email;

    public Student(int id, String name, String course, String email) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.email=email;
    }

    public void displayStudent() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
         System.out.println("Email: " + email);
    }
}