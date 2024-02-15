package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameNumber extends AbstractGame{
    @Override
    List<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
    }
    List<String> generateLatinList() {
        return new ArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "j", "h", "i", "j"));
    }
    List<String> generateCyrillicList() {
        return new ArrayList<>(Arrays.asList("а", "б", "в", "г", "д", "ж", "з", "и", "к", "л"));
    }
}
