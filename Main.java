import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        
        List arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(8);
        arrayList.add(22);
        arrayList.add(8);
        arrayList.add(15);

        System.out.println(array(23, arrayList));


    }

    static List array(int a, List arr) {
        int summ;
        List arrayb = new ArrayList<>();
        ListIterator iter = arr.listIterator();
        while (iter.hasNext()) {
            if (!arrayb.isEmpty()) {
                break;
            }
            summ = 0;
            summ += (Integer) iter.next();

            ListIterator iter2 = arr.listIterator();
            while (iter2.hasNext()) {
                int summ2 = (int) iter2.next();
                int tmp = summ + summ2;
                if (tmp == a && (iter.nextIndex() - 1 != iter2.nextIndex() - 1)) {
                    arrayb.add(iter.nextIndex() - 1);
                    arrayb.add(iter2.nextIndex() - 1);
                    break;
                }
                tmp = 0;
            }


        }

        return arrayb;
    }
}



