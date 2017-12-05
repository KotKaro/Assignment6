import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args){
        
    }

    @Test
    public void test1(){
        Generator.StudentGenerate(100);
        //ULTRACONTAINER.students.forEach(e -> System.out.println(e.toString()));
        Generator.GrupyGenerator((new ArrayList<>(ULTRACONTAINER.students)) , 12);
        //ULTRACONTAINER.studnetGroups.forEach(e -> System.out.println(e.StudentList.size()));
        List<Person> lista = new ArrayList<>();
        //List<Person> some = ULTRACONTAINER.secondSort(new ArrayList<Person>(ULTRACONTAINER.students), Nations.Ukrainian);
        //System.out.println(some.size());
        Generator.TeacherGenerator(10);
        //ULTRACONTAINER.teachers.forEach(e -> System.out.println(e.toString()));
        //System.out.println(ULTRACONTAINER.teachers.size());
        //some.forEach(e -> System.out.println(e.toString()));
        Generator.DepartmentGenerator(new ArrayList<>(ULTRACONTAINER.teachers) ,3);

        Generator.GenerateSubject((new ArrayList<>(ULTRACONTAINER.departments)) , 10);

    }
}
