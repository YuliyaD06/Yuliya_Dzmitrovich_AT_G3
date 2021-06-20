package main.java.tasks.day3;

import java.util.Random;

public class ReturnIntArray {
    int n;

    public void intArray() {
        int index = 0;

        int[] arrayInt = new int[5];
        Random random = new Random();
        System.out.println("Исходный массив: ");
        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println(arrayInt[i] = random.nextInt(20));
        }
        int[] arrayUpdated = new int[5];


        for (int l = 0; l < arrayUpdated.length; l++) {

            for (int i = 0; i < arrayInt.length; i++) {
                if (arrayInt[i] > n) {
                    arrayUpdated[l] = arrayInt[i];
                    l++;
                }
            }
            //if (arrayUpdated[l] == 0){
            //    break;
            //}
            System.out.println("Выбранный массив: " + arrayUpdated[l]);
            break;
        }
        System.out.println("Выбранный массив в обратном порядке: ");
        for (int l = arrayUpdated.length - 1; l >= 0; l--) {
            System.out.println(arrayUpdated[l]);
        }

        //int counter =0;
        //for ( int i = 0; i < arrayInt.length; i++){
        //  if (arrayInt[i]....){
        // arrayUpdated[counter++]=arrayInt[i];
        //{
        // int[] fine = new int[coiunter];
        //for (int i=0; i<counter; i++){
        //  fine[i]=counter[i];
        //{
        // for( int i:fine){
        // sout
        //}

    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }
}
