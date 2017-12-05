import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Subject {

    private String name ;
    private Department supervisor ;
    private Teacher lecturer ;
    private List<Student> attend  = new ArrayList<>();
    private Random rand = new Random() ;
    private static List<Student> allStudents = new ArrayList<>(ULTRACONTAINER.students);
    private static List<Teacher> allTeachers = new ArrayList<>(ULTRACONTAINER.teachers);
    private static List<Department> allDepartments = new ArrayList<>(ULTRACONTAINER.departments);

    public Subject(){
        ULTRACONTAINER.subjectLists.add(this);
    }
    public void setName(String name) { this.name = name; }
    public void setAttend(List<Student> attend) { this.attend = attend; }
    public void setLecturer(Teacher lecturer) { this.lecturer = lecturer; }
    public void setSupervisor(Department supervisor) { this.supervisor = supervisor; }

    public Department getSupervisor() { return supervisor; }
    public String getName() { return name; }
    public Teacher getLecturer() { return lecturer; }
    public List<Student> getAttend() { return attend; }

    public void GenerateInfo(){
        (new NamesAndSurnames()).getRandomSubjectName(this);
        int size = rand.nextInt(20)+10;
        for(int i = 0 ; i < size ; i++){
            int randx = (new Random()).nextInt(allStudents.size());
            attend.add(allStudents.get(randx));
            allStudents.remove(randx);
        }
        allStudents = new ArrayList<>(ULTRACONTAINER.students);

        int ix = rand.nextInt(allTeachers.size());
        lecturer = allTeachers.get(ix); allTeachers.remove(ix);

        int iy = rand.nextInt(allDepartments.size());
        supervisor = allDepartments.get(iy);

    }
}
