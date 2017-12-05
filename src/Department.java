import java.util.ArrayList;
import java.util.List;

public class Department {

    private String name ;
    private List<Teacher> emloyees = new ArrayList<>();

    public Department(){
        ULTRACONTAINER.departments.add(this);
    }

    public void GenerateInfo(){

    }

    public void setName(String name) {
        this.name = name;
    }


    public void setEmloyees(List<Teacher> emloyees) {
        this.emloyees = emloyees;
    }
    public void addMember(Teacher teacher){
        emloyees.add(teacher);
        teacher.alreadyEmployeed();
        if (emloyees.size() > 4){
            teacher.notEmployeed();
            emloyees.remove(teacher);
            System.out.println("This department don't need more than 4 teachers");

        }
    }
}
