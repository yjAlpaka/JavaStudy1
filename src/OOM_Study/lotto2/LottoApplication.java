package OOM_Study.lotto2;

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
            if(lottoHistory.size()>100){
                lottoHistory.clear();
            }
            lottoHistory.add(generator.generate());
        }
    }
}
