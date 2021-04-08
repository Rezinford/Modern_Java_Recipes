package General_1.L_1_2;

import java.util.stream.Stream;

public class L {

    public static void main(String[] args) {
        forML();
        forMLS();
        genStreem();
    }

    private static void forML() {
        Stream.of(3, 10, 25, 55, 84, 1).forEach(x -> System.out.println(x));
    }

    private static void forMLS() {
        Stream.of(3, 10, 25, 55, 84, 1).forEach(System.out::println);
    }

    private static void genStreem() {
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }

}
