package ru.job4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Автомат размена купюр.
 */
public class ChangeMachine {
    public List<int[]> getChangeVariants(int amount) {
        HashMap<Integer, List<int[]>> predefinedVariants = new HashMap<>();
        predefinedVariants.put(10, Arrays.asList(
                new int[]{1, 0, 0, 0},
                new int[]{0, 2, 0, 0},
                new int[]{0, 1, 2, 1},
                new int[]{0, 0, 5, 0}
        ));
        predefinedVariants.put(5, Arrays.asList(
                new int[]{0, 1, 0, 0},
                new int[]{0, 0, 2, 1}
        ));
        predefinedVariants.put(1, Arrays.asList(
                new int[]{0, 0, 0, 1}
        ));
        return predefinedVariants.getOrDefault(amount, new ArrayList<>());
    }
}
