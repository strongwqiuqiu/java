import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<int[]> arrayList = new ArrayList();
        ArrayList<int[]> arrayList1 = new ArrayList<>();
        arrayList1.add(new int[]{1,2});
        arrayList1.add(new int[]{2,2});
        arrayList1.add(new int[]{3,2});
        arrayList.add(new int[]{1,2});
        arrayList.add(new int[]{2,2});
        int length = arrayList.size() > arrayList1.size() ? arrayList.size() : arrayList1.size();
        int[][] ret = new int[length][];
        for (int i = 0; i < arrayList.size(); i++) {
            int[] ints = arrayList.get(i);
            int value1 = ints[0];
            int weight1 = ints[1];
            for (int j = 0; j < arrayList1.size(); j++) {
                int[] ints1 = arrayList1.get(j);
                int value2 = ints1[0];
                int weught2 = ints1[1];
                if (value1 == value2){
                    weight1 += weught2;
                }
            }
            ret[i] = new int[]{value1,weight1};
        }
        //2 3
        if (arrayList.size() < arrayList1.size()){
            ret[arrayList.size()] = arrayList1.get(arrayList.size());
        }
        for (int i = 0; i < ret.length; i++) {
            System.out.println("" + ret[i][0] + "\t" + ret[i][1]);
        }

    }
}