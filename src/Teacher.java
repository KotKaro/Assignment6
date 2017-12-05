import java.util.Date;
import java.util.Random;

public class Teacher extends Person {
    private Degre degree ;
    private Date hiredate ;
    private boolean employeed = false ;

    public Teacher(){
        ULTRACONTAINER.teachers.add(this);
    }
    public  void GenerateInfo(){
        this.generateInfo();
        long x = 2500000000000L; //2049
        long y = 2200000000000L; //1971
        hiredate = new Date(Math.abs(System.currentTimeMillis() - (long)(new Random().nextDouble()*(x-y))));
        degree = Degre.getRandomDegree();
    }
    public String toString(){
        return this.getFirstName() + " " + this.getSurname() + degree;
    }
    public void alreadyEmployeed(){
        employeed = true ;
    }
    public void notEmployeed(){
        employeed = false ;
    }

    public boolean isEmployeed() {
        return employeed;
    }
}
