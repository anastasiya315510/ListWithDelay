import lombok.SneakyThrows;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

public class LambdaUtils {
    @SneakyThrows
    public static<S,L> void forEachWithDelay(List<S>list, L delay, BiConsumer<List<S>,L> names) throws InterruptedException {
     for(S l:list){
         System.out.println(l);
         TimeUnit.SECONDS.sleep((Long) delay);

     }

    }


}

