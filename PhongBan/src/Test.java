import java.util.List;
import java.util.ArrayList;

public class Test {
    public static void removeAll(List<?> lst){
        int n = lst.size();
        for (int i = 0; i < n; i++){
            lst.remove(0);
        }
    }



    public static void main(String[] args) {
        List<String> lst = new ArrayList<>();

        lst.add("A");
        lst.add("B");
        lst.add("C");
        lst.add("D");

        removeAll(lst);

        System.out.println(lst);
    }
}

