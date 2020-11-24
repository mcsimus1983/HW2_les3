package part1;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayWords = createArray();
        Set<String> arrayWordsTree = new TreeSet<>(arrayWords);

        System.out.println(arrayWords);

        for (String str : arrayWordsTree) {
            int count = 0;
            for (String str2 : arrayWords) {

                if (str.equals(str2)) {
                    count++;
                }
            }
            System.out.println("Слово: " + str + " встречается: " + count + " раз(а)");
        }

    }

    private static ArrayList<String> createArray() {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Апельсин");
        arrayList.add("Яблоко");
        arrayList.add("Яблоко");
        arrayList.add("Яблоко");
        arrayList.add("Яблоко");
        arrayList.add("Яблоко");
        arrayList.add("Яблоко");
        arrayList.add("Яблоко");
        arrayList.add("Ананас");
        arrayList.add("Ананас");
        arrayList.add("Ананас");
        arrayList.add("Ананас");
        arrayList.add("Огурец");
        arrayList.add("Огурец");
        arrayList.add("Слива");
        arrayList.add("Слива");
        arrayList.add("Апельсин");
        arrayList.add("Апельсин");
        arrayList.add("Апельсин");
        arrayList.add("Авакадо");
        arrayList.add("Авакадо");
        arrayList.add("Авакадо");

        return arrayList;

    }
}
