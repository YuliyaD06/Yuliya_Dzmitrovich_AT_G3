package main.java.tasks.day4;

import java.util.Arrays;
import java.util.List;

//найти и вывести в консоль все дубликаты слов в строке текста
public class Duplicates {

    public static void main(String[] args) {

        String text = "test message for duplicate test. Test test for test.";

        List<String> listWords = Arrays.asList(text.split(" "));
        System.out.println("The list of duplicates: ");
        for (int word = 0; word < listWords.size(); word++) {
            if (listWords.get(word) != null) {
                for (int i = word + 1; i < listWords.size(); i++) {
                    if (listWords.get(word).equals(listWords.get(i))){
                        listWords.add(listWords.get(word));
                        System.out.println("- " + listWords.get(i) + " ;");
                    }
                }
            }
        }


/*        String[] listWords = text.split(" ");
        System.out.println("The list of duplicates: ");
        for (int i = 0; i < listWords.length; i++) {
            if (!(listWords[i] == null)) {
                for (int e = i + 1; e < listWords.length; e++) {
                    if (listWords[i].equals(listWords[e])) {
                        listWords[e] = listWords[i];
                        System.out.println("- " + listWords[e] + " ;");
                    }
                }
            }
        }*/
    }
}