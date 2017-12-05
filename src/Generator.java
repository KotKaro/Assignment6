import java.util.*;


public class Generator{

    private Random rand = new Random();


    public static void StudentGenerate(int i) {
        for(int j = 0 ; j < i ; j++){ new Student();  }
        ULTRACONTAINER.students.forEach(e-> e.generateInfo());
        ULTRACONTAINER.students.forEach(e -> e.generateBookNumber());

    }
    public static void GrupyGenerator(List<Student> lista , int amount){

        for(int i =0 ; i< amount ;i++){
            new StudentGroup();
        }
        ULTRACONTAINER.studnetGroups.forEach(e -> (new NamesAndSurnames()).getRandomGroupName(e));

        ArrayList<StudentGroup> set = new ArrayList<>(ULTRACONTAINER.studnetGroups);
        while(lista.size() != 0){
            int numb = (new Random()).nextInt(lista.size());
            if(lista.get(numb).isAssignedtoGroup() == false) {
                set.get((new Random()).nextInt(set.size())).addMember(lista.get(numb));
                if(lista.get(numb).isAssignedtoGroup() == true){
                    lista.remove(numb);
                }
            }
            else {
                continue;
            }
        }
    }
    public static void TeacherGenerator(int j) {
        for (int i = 0 ; i < j ; i++){new Teacher();}
        ULTRACONTAINER.teachers.forEach(e -> e.GenerateInfo());
    }
    public static void DepartmentGenerator(List<Teacher> list , int j){
        for(int i = 0 ; i < j ; i++){ new Department(); }
        ULTRACONTAINER.departments.forEach(e -> (new NamesAndSurnames()).getRandomDepartmentName(e));

        ArrayList<Department> set = new ArrayList<>(ULTRACONTAINER.departments);
        while(list.size() != 0) {
            int numb = (new Random()).nextInt(list.size());
            if (list.get(numb).isEmployeed() == false) {
                set.get((new Random()).nextInt(set.size())).addMember(list.get(numb));
                if (list.get(numb).isEmployeed() == true) {
                    list.remove(numb);
                }
            } else {
                continue;
            }
        }
    }
    public static void GenerateSubject(List<Department> dep  , int j){
        for (int i = 0 ; i < j ; i++){
            new Subject();
        }
        ULTRACONTAINER.subjectLists.forEach(e -> e.GenerateInfo());

    }
}
