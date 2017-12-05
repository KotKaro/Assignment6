import java.util.Random;

public enum Degre {
    Inzynier ,
    Magister ,
    Doktor ,
    DoktorHabilitowany  ,
    Profesor;

    private static final Degre[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static Degre getRandomDegree()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }
}
