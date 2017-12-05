import java.text.Collator;
import java.util.*;
import java.util.stream.Collectors;

public class ULTRACONTAINER {

    public static LinkedHashSet<Department> departments = new LinkedHashSet<Department>();
    public static LinkedHashSet<Person> persons = new LinkedHashSet<Person>();
    public static LinkedHashSet<Student> students = new LinkedHashSet<Student>();
    public static LinkedHashSet<StudentGroup> studnetGroups = new LinkedHashSet<StudentGroup>();
    public static LinkedHashSet<Subject> subjectLists = new LinkedHashSet<Subject>();
    public static LinkedHashSet<Teacher> teachers = new LinkedHashSet<Teacher>();

    public static  List<Person>sortPerson(List<Person> list){
        Collator coll = Collator.getInstance(new Locale("pl", "PL"));
        Collections.sort(list , coll);
        return list ;
    }
    public static List<Person> secondSort(List<Person> list , Nations nations){
        List<Person> subList = new ArrayList<>();
        for(int i = 0 ; i < list.size() ; i++){
            if(list.get(i).getNationality() == nations ){
                subList.add(list.get(i));
            }
        }

        subList = subList.stream().sorted().collect(Collectors.toList());

        //Collections.sort(subList, Collator.getInstance(new Locale(group[0], group[1])));
        return subList ;
    }

}
