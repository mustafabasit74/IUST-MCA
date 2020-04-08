package edu.iust.advancejava.streams.lambda;

import java.util.ArrayList;
import java.util.Collection;

public class SequenceGenerator {
    public static Collection<Integer> range(int min, int max, int step){
        Collection<Integer> integers = new ArrayList<Integer>();
        for (int i = min; i < max; i += step)
            integers.add(i);
        return integers;
    }

    public static Collection<Integer> rangeWithStepLogic(int min, int max, StepLogic logic){
        Collection<Integer> integers = new ArrayList<>();

        for(int i = min; i < max; i = logic.increment(i))
            integers.add(i);
        return integers;

    }

}
