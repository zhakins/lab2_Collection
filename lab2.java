import java.util.*;

public class lab2 {
    public static void main(String[] args) {

        List arrayList = new ArrayList<>();

        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(6);
        arrayList.add(5);


        Set set = new HashSet(arrayList);

        System.out.println(set);
        System.out.println(duplicate(arrayList));

        Map<Integer, Integer> map = new HashMap<>(duplicate(arrayList));

        Map.Entry<Integer, Integer> maxValue = null;


        for (Map.Entry<Integer, Integer> value : map.entrySet()) {
            if (maxValue == null || value.getValue().compareTo(maxValue.getValue()) > 0) {
                maxValue = value;
            }
        }
        System.out.println("Число: " + maxValue.getKey() + " Максимально дублирующее число: " + maxValue.getValue());

    }

    static HashMap duplicate(List arr) {
        Set set = new HashSet();
        HashMap hashMap = new HashMap<Integer, Integer>();
        int count = 0;
        if (set.size() == arr.size()) {
            return hashMap;
        }

        for (int i = 0; i < arr.size(); i++) {

            if (set.contains(arr.get(i))) {

                count = hashMap.containsKey(arr.get(i)) ? (int) hashMap.get(arr.get(i)) : 1;
                hashMap.put(arr.get(i), count + 1);
                ;
            }
            set.add(arr.get(i));

        }
        return hashMap;
    }

}
