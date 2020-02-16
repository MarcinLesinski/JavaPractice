package FizzBuzz;

import com.sun.istack.internal.NotNull;
import lombok.Getter;
import lombok.experimental.Accessors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * task: FizzBuzz
 * Print numbers from A to B,
 * if the number is divisible by 3 then write Fizz,
 * if divisible by 5 then Buzz,
 * if divisible by 3 and 5 then write FizzBuzz.
 * Otherwise, write the number.
 */
public class FizzBuzz {
    @Accessors(fluent = true)
    private enum FizzBuzzType {
        FIZZ(3, "FIZZ"),
        BUZZ(5, "BUZZ"),
        FIZZ_BUZZ(FIZZ.value * BUZZ.value, "FIZZ_BUZZ"),

        EXTERNAL(0);

        private final Integer value;
        @Getter
        private String label;

        FizzBuzzType(Integer value, String label)
        {
            this.value = value;
            this.label = label;
        }

        FizzBuzzType(Integer value)
        {
            this(value, "");
        }

        public static FizzBuzzType typeOfNumber(@NotNull Integer number)
        {
            if (isNumberTypeOf(number, FIZZ_BUZZ))
                return FIZZ_BUZZ;

            if (isNumberTypeOf(number, FIZZ))
                return FIZZ;

            if (isNumberTypeOf(number, BUZZ))
                return BUZZ;

            return EXTERNAL;
        }

        private static boolean isNumberTypeOf(Integer number, FizzBuzzType type)
        {
            return number % type.value == 0;
        }
    }

    public static final Integer FIZZ_BASE = FizzBuzzType.FIZZ.value;
    public static final Integer BUZZ_BASE = FizzBuzzType.BUZZ.value;
    public static final Integer FIZZ_BUZZ_BASE = FizzBuzzType.FIZZ_BUZZ.value;
    public static final String BUZZ_LABEL = FizzBuzzType.BUZZ.label;
    public static final String FIZZ_LABEL = FizzBuzzType.FIZZ.label;
    public static final String FIZZ_BUZZ_LABEL = FizzBuzzType.FIZZ_BUZZ.label;


    public List<String> generate(@NotNull Integer from, @NotNull Integer to)
    {
        IntStream inputs = IntStream.rangeClosed(from, to);
        return inputs.mapToObj(this::map).collect(Collectors.toList());
    }

    private String map(Integer number)
    {
        FizzBuzzType type = FizzBuzzType.typeOfNumber(number);
        switch (type) {
            case FIZZ:
            case BUZZ:
            case FIZZ_BUZZ:
                return type.label();
            case EXTERNAL:
                return number.toString();
            default:
                throw new IllegalStateException(FizzBuzzType.class.getName() + "illegal enum value");
        }
    }
}
