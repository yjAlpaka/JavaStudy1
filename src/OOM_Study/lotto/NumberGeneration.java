package OOM_Study.lotto;

import javax.swing.*;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

public class NumberGeneration {
    public Set<Integer> generate(){
        Set<Integer> numbers=new HashSet<>();
        while(numbers.size()<6){
            numbers.add(ThreadLocalRandom.current().nextInt(1,46));
        }
        return numbers;
    }
}
