package Day3.inheritance;

public class Teacher {
    private String name;
    private int teacherID;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMajorCourses() {
        return majorCourses;
    }

    public void setMajorCourses(String majorCourses) {
        this.majorCourses = majorCourses;
    }

    private String majorCourses;


}
