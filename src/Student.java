import java.util.Random;

public class Student extends Person {

    private int StuBookNr ;
    private Random rand = new Random();
    private boolean AssignedtoGroup = false ;

    public Student(){
        ULTRACONTAINER.students.add(this);
    }
    public void generateBookNumber(){
        this.StuBookNr = rand.nextInt(8999)+1000;
    }
    public String toString(){
        return this.getFirstName() + " "+ this.getBirthday().toString();
    }

    public boolean isAssignedtoGroup() {
        return AssignedtoGroup;
    }
    public void AlreadyAssigned(){
        AssignedtoGroup = true ;
    }
    public void notAssigned(){
        AssignedtoGroup = false ;
    }
}
