import java.math.BigDecimal;
import java.text.Collator;
import java.text.SimpleDateFormat;
import java.util.*;

public abstract class Person implements Comparable<Student> {
    private  BigDecimal PESEL ;
    private String surname ;
    private String firstName ;
    private Date birthDate ;
    private Nations nationality;
    private String ix ;
    private String[] group ;

    public Person(){
        ULTRACONTAINER.persons.add(this);
    }

    public void setPESEL(BigDecimal i){
        PESEL = i ;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }


    public Date getBirthday() {
        return birthDate;
    }
    public String getSurname() {return surname ;}
    public String getFirstName(){ return firstName ;}
    public BigDecimal getPESEL(){return PESEL ;}

    public Nations getNationality(){ return nationality ;}
    public void generateInfo(){
        long x = 2500000000000L; //2049
        long y = 40000000000L; //1971
        birthDate = new Date(Math.abs(System.currentTimeMillis() - (long)(new Random().nextDouble()*(x-y))));
        Calendar cal = Calendar.getInstance();
        cal.setTime(birthDate);
        int month = cal.get(Calendar.MONTH);

        int mounth =  cal.get(Calendar.MONTH);
        int day =  cal.get(Calendar.DAY_OF_MONTH);
        PESEL = new BigDecimal(String.valueOf((birthDate.getYear()) % 100) + String.valueOf((birthDate.getYear()) % 10)
                + String.valueOf(mounth)+ String.valueOf(day) + String.valueOf(new Random().nextInt(89999) + 10000));
        nationality = Nations.getRandomNation();
        NamesAndSurnames a1 = new NamesAndSurnames();
        a1.getRandomNamesAndSurname(this);

        ix = Nations.valueOf(nationality).toString();
        group = ix.split("_");

    }


    @Override
    public int compareTo(Student o) {
        Collator usCollator = Collator.getInstance(new Locale(group[0], group[1])); //Your locale here
        usCollator.setStrength(Collator.PRIMARY);
        return usCollator.compare(this.getFirstName(), o.getFirstName());

    }
}
