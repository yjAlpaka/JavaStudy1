package OOM_Study.lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LottoApplication {
    private static final List <Set<Integer>> lottoHistory=new ArrayList<>();
    public static void main(String [] args){
        NumberGeneration generator=new NumberGeneration();
        while(true){
            Set<Integer>lottoNumbers=generator.generate();
            System.out.println(lottoNumbers);
            lottoHistory.add(generator.generate());
        }
    }
}
