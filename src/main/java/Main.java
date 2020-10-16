import java.util.List;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import static java.util.Arrays.*;


public class Main {
    private static Object BiConsumer;

    public static void main(String[] args) throws InterruptedException {
        List<String> names = asList("Vasya", "Petya", "Alla", "Igor");
        LambdaUtils lu = new LambdaUtils();
        Long delay = 1l;
        BiConsumer<List<String>, Long> add = (a, b) -> {};
       lu.forEachWithDelay(names, delay, add);
    }
}
