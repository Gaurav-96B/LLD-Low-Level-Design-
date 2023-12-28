public class Main {
    public static void main(String[] args) {
        // Creating a prototype student
        Student originalStudent = new Student("John Doe", 20, "Computer Science");

        // Cloning the student to create a new instance
        Student clonedStudent = (Student) originalStudent.clone();

        // Modifying the cloned student
        clonedStudent.setName("Jane Doe");
        clonedStudent.setAge(22);

        // Printing original and cloned students
        System.out.println("Original Student: " + originalStudent);
        System.out.println("Cloned Student: " + clonedStudent);
    }
}
