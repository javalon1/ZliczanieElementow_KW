package com.sda.algorytmy;


public class App {
    public static void main(String[] args) {

        int x = 1;
        int[] a = {4, 1, 6, 1, 1, 4, 3, 3, 1};
        int count = 0;


        for (int i = 0; i <a.length ; i++) {
            if (a[i] == x){
                count++;
            }
        }
        System.out.println(count);

    }
}





