import java.util.ArrayList;

public class ClassSection {
    private String subject;
    private int capacity;
    private int yearLevel;
    private ArrayList<Student> students;

    public ClassSection(String subject, int capacity, int yearLevel) {
        this.subject = subject;
        this.capacity = capacity;
        this.yearLevel = yearLevel;
        this.students = new ArrayList<>();
    }
    public String getSubject(){
        return subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }
    public int getCapacity(){
        return capacity;
    }
    public void setCapacity(int capacity){
        this.capacity = capacity;
    }
    public int getYearLevel(){
        return yearLevel;
    }
    public void setYearLevel(int yearLevel){
        this.yearLevel = yearLevel;
    }
    public ArrayList<Student> getStudents(){
        return students;
    }
    public boolean isStudentEnrolled(Student student){
        return students.contains(student);
    }
    public void addStudent(Student student){
        if (isStudentEnrolled(student)) {
            return;
        }
        else if (student.getAge() > 18) {
            return;
        }
        else if (yearLevel != student.getYearLevel()) {
            return;
        }
        students.add(student);
    }
    public void removeStudent(Student student){
        students.remove(student);
    }
@Override
    public String toString() {
        return "ClassSection{subject='" + subject + "', capacity=" + capacity + ", yearLevel=" + yearLevel + ", students=[]}";
}
}