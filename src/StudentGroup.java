import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StudentGroup {

    private String name ;
    private List<Student> StudentList  = new ArrayList<>();

    public StudentGroup(){
        ULTRACONTAINER.studnetGroups.add(this);
    }
    public void setGroupName(String str){
        name = str;
    }
    public void addMember(Student student){
        StudentList.add(student);
        student.AlreadyAssigned();
        if (StudentList.size() > 10){
            StudentList.remove(student);
            student.notAssigned();
            System.out.println("Group cannot have more than 10 members !");

        }
    }

}
