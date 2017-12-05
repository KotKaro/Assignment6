import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class NamesAndSurnames {

    private static String[] POLISHNAMES = {"Karol" ,"Jan" , "Żenon" , "Ókar" , "Filip" ,"Franciszek" ,"Mikołaj","Aleksander","Kacper","Wojciech" ,"Maja"
            ,"Hanna","Zofia","Amelia","Alicja","Aleksandra","Natalia"};
    private static String[] UKRAINIANNAMES = {"Anna" ,"Агафья" , "Катя" , "Миша", "Vlad" , "Kate" , "Artem" , "Dasha" , "Sasha" , "Anastasia" , "Nikita" , "Julia" , "Alex"};
    private static String[] BelarussianNAMES = {"Anastasia","Ivan","Tanya","Vlad","Kate","Max","Alina","Nikita","Dasha","Danik"};
    private static String[] SlovakNAMES={"Dominika","Petru","Michaela","Matus","Lenka","Marek","Martina","Adam","Natalia","Boris"};
    private static String[]  LithuanianNAMES = {"Karolina" , "Гена", "Ignas","Greta","Sauliuis","Laura","Lukas","Ieva","Erika","Monika","Sarunas"};
    private static String[]  LatvianNAMES = {"Anna","Karlis","Linda","Jacobs","Laura","Aleksel","Kristina","Artis","Zane","Kriss"};
    private static String[] BritishNAMES = {"Emily","James","Chloe","Jack","Megan","Alex","Charlotte","Ben","Emma","Daniel"};
    private static String[] IndianNAMES = {"Priya","Rahul","Tanya","Abhishek","Priyanka","Aditya","Dikvya","Amit","Tanvi","Makesh"};
    private static String[] ChineseNAMES = {"Wang","Chen", "Li","Zhang","Lily","Jane","Liu","Xo","Lee"};
    private static String[]  VietnameseNAMES = {"Linh","Nguyen","Xích" , "ỷuQ" ,"Âu","Hoang","Trang","Khanh","Huy","Viet","Nga","Quynch","Duy"};
    private static String[]  POLISHSURNAMES = {"Kot","Cieslak","Jodelka","Ogorek","Szczesniak"};
    private static String[]  UKRAINIANSURNAMES = {"Antonov","Chakya","Gavrilyuk","Holub","Ivanov"};
    private static String[]  BelarussiaSURNAMES = {"Oao","Rup","Ivanova","Zao","Moroz","Otdel"};
    private static String[]  SlovakSURNAMES = {"Banik","Bartos","Hornick","Laska","Pokorny"};
    private static String[]  LithuanianSURNAMES = {"Astraukus","Simoneit","Simons"};
    private static String[]  LatvianSURNAMES = {"Abele" , "Barons" , "Priede" , "Krumos" , "Mednis"};
    private static String[] BritishSURNAMES = {"Smith" , "Jones" , "Williams" , "Taylor" , "Brown" , "Evans"};
    private static String[]  IndianSURNAMES = {"Agarwal" , "Khatri" , "Ahuja" , "Anand" , "Patel" , "Reddy"};
    private static String[]  ChineseSURNAME= {"Bai" , "Chen" ,"Hou", "Jiang" , "Sun" , "Wong"};
    private static String[]  VietnameseSURNAMES= {"Nguyen" , "Tran" , "Le" , "Phan" , "Diang"};
    private static String[]  StudentGroups = {"Hopeless group" , "Just do it" , "The Unknowns" , "Chat Lounge" ,
            "Feel free to write" , "Tech Ninjas"  , "Crazy world" , "Coffee lovers" , "Staunch Ladies" ,
            "Avengers" , "Just talk" , "Open Book" , "Unfired"  , "No Spamming" , "Smile please" ,
            "Ninjas" , "All Us Single Ladies" , "Block heads" , "Join at your own risk"};
    private static String[] DeparmentNames = {"Deparment of Culture" , "Department of Samsink" , "Department of medicine" ,
                                                "Department of Information Technology" , "Department of Law" ,
                                                 "Department of Everything"};
    private static String[] SubjectNames = {"Maths" , "History" , "ASD" , "UYP" , "SYC" , "ZPR" , "WSI" , "ATP" , "GTG"};
    private static  List<String> SubjectNamesLista = new ArrayList<String>(Arrays.asList(SubjectNames));
    private static List<Integer> ints = new ArrayList<>();


    Random radn = new Random();

    public void getRandomSubjectName(Subject subject){
        int ra = radn.nextInt(SubjectNamesLista.size());
        if(ints.contains(ra) == false) {
            subject.setName(SubjectNamesLista.get(ra));
            ints.add(ra);
        }
    }

    public  void getRandomGroupName(StudentGroup grupa){
        grupa.setGroupName(StudentGroups[radn.nextInt(StudentGroups.length)]);
    }
    public void getRandomDepartmentName(Department dep){
        dep.setName(DeparmentNames[radn.nextInt(DeparmentNames.length)]);
    }
    public  void getRandomNamesAndSurname(Person person)  {
        Random radn = new Random();

        if(person.getNationality() == Nations.Polish) {
            person.setFirstName(POLISHNAMES[radn.nextInt(POLISHNAMES.length)]);
            person.setSurname(POLISHSURNAMES[radn.nextInt(POLISHSURNAMES.length)]);
        }
        if(person.getNationality() == Nations.Ukrainian) {
            person.setFirstName(UKRAINIANNAMES[radn.nextInt(UKRAINIANNAMES.length)]);
            person.setSurname(UKRAINIANSURNAMES[radn.nextInt(UKRAINIANSURNAMES.length)]);
        }
        if(person.getNationality() == Nations.Belarussian) {
            person.setFirstName(BelarussianNAMES[radn.nextInt(BelarussianNAMES.length)]);
            person.setSurname(BelarussiaSURNAMES[radn.nextInt(BelarussiaSURNAMES.length)]);
        }
        if(person.getNationality() == Nations.Sloval) {
                person.setFirstName(SlovakNAMES[radn.nextInt(SlovakNAMES.length)]);
                person.setSurname(SlovakSURNAMES[radn.nextInt(SlovakSURNAMES.length)]);
        }
        if(person.getNationality() == Nations.Lithuanian) {
            person.setFirstName(LithuanianNAMES[radn.nextInt(LithuanianNAMES.length)]);
            person.setSurname(LithuanianSURNAMES[radn.nextInt(LithuanianSURNAMES.length)]);
        }
        if(person.getNationality() == Nations.Latvian) {
            person.setFirstName(LatvianNAMES[radn.nextInt(LatvianNAMES.length)]);
            person.setSurname(LatvianSURNAMES[radn.nextInt(LatvianSURNAMES.length)]);
        }
        if(person.getNationality() == Nations.British) {
            person.setFirstName(BritishNAMES[radn.nextInt(BritishNAMES.length)]);
            person.setSurname(BritishSURNAMES[radn.nextInt(BritishSURNAMES.length)]);
        }
        if(person.getNationality() == Nations.Indian) {
            person.setFirstName(IndianNAMES[radn.nextInt(IndianNAMES.length)]);
            person.setSurname(IndianSURNAMES[radn.nextInt(IndianSURNAMES.length)]);
        }
        if(person.getNationality() == Nations.Chinese) {
            person.setFirstName(ChineseNAMES[radn.nextInt(ChineseNAMES.length)]);
            person.setSurname(ChineseSURNAME[radn.nextInt(ChineseSURNAME.length)]);
        }
        if(person.getNationality() == Nations.Vietnamese) {
                person.setFirstName(VietnameseNAMES[radn.nextInt(VietnameseNAMES.length)]);
                person.setSurname(VietnameseSURNAMES[radn.nextInt(VietnameseSURNAMES.length)]);
        }

    }
}
