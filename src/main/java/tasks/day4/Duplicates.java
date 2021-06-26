package main.java.tasks.day4;

//найти и вывести в консоль все дубликаты слов в строке текста
public class Duplicates {

    public static void main(String[] args) {

        String text = "test message for duplicate test. Test test for test.";
        String[] listWords = text.split(" ");

        String duplicate = listWords[0];

        String[] tempo = new String[listWords.length];
        int counter = 0;

        for (int e = 0; e< tempo.length; e++) {

            for (int i = 0; i < listWords.length; i++) {

                if (listWords[i] == duplicate) {
                    tempo[e] = listWords[i];
                }
            }
        }

        for ( String i :tempo){
            System.out.println(i);
        }

    }

}
