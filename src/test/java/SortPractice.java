import java.util.ArrayList;
import java.util.List;

public class SortPractice {
    public static void main(String args[]) {
        System.out.println("aaa");
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(4589);
        list.add(45);
        list.add(589);
        list.add(122);
        list.add(9);
        sort(list);
        System.out.println(list);
    }

    public static void sort(List<Integer> a) {
        int len = a.size();
        for(int i = 0; i < len; i ++) {
            for(int j = len-1; j > i; j--) {
                if(a.get(j) < a.get(j-1)) {
                    int temp = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j-1, temp);
                }
            }
        }
    }
}
