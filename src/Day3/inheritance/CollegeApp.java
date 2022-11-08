package Day3.inheritance;

public class CollegeApp {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Mahesh");
        student.setAge(19);
        student.setStudentID(1315751);
        student.setStudentCourse("ComputerScience");

        Teacher teacher =new Teacher();
        teacher.setName("Ramesh");
        teacher.setAge(35);
        teacher.setTeacherID(98);
        teacher.setMajorCourses("Informatics");

        Staff staff = new Staff();
        staff.setName("Ram");
        staff.setAge(56);
        staff.setJobLevel("Cleaner");
        staff.setSalary(20000);

    }
}
