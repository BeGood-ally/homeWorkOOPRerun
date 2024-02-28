package logging;

import java.util.ArrayList;
import java.util.List;

public class Store {
    static List<String> store = new ArrayList<>();
    public static void saving(String toSave){
        store.add(toSave);
    }
    public static void view() {
        for (int i = 0; i < store.size(); i++) {
            System.out.println(store.get(i));
        }
    }
}
