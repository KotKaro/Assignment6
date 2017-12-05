import java.time.LocalDate;
import java.util.*;
import java.util.function.Supplier;

import static java.util.Arrays.stream;
import static java.util.stream.Collectors.toMap;

public enum Nations {
    Polish(new Locale("pl", "PL")),
    Ukrainian(new Locale("uk","UA")),
    Belarussian(new Locale("be", "BY")),
    Sloval(new Locale("sk","SK")),
    Lithuanian(new Locale("lt","LT")),
    Latvian(new Locale("lv","LV")),
    British(new Locale("en","GB")),
    Indian(new Locale("en","IN")),
    Chinese(Locale.CHINA),
    Vietnamese(new Locale("vi","VN"));

    private final Locale loc ;
    Nations(Locale locale) {
        loc = locale;
    }
    private int nat;
    private static final Nations[] VALUES = values();
    private static final int SIZE = VALUES.length;
    private static final Random RANDOM = new Random();

    public static Nations getRandomNation()  {
        return VALUES[RANDOM.nextInt(SIZE)];
    }


    /*private final int legNo;*/

    private final static Map<Nations, Locale> map =
            stream(Nations.values()).collect(toMap(leg -> leg, leg -> leg.loc));



    public static Locale valueOf(Nations legNo) {
        return map.get(legNo);
    }

}

