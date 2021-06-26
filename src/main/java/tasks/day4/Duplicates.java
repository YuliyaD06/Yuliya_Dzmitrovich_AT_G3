package main.java.tasks.day4;

//найти и вывести в консоль все дубликаты слов в строке текста
public class Duplicates {

    public static void main(String[] args) {

        String text = "test message for duplicate test. Test test for test.";
        String[] listWords = text.split(" ");
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
        }
    }
}