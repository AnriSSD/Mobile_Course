package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] arr = {18, -3, 5, -7, 6, 89, 13, 0, -89};

        // ბაბლ სორტირების ალგორითმი
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // ასივის ზრდადობით დაბეჭდვა
        System.out.println("Sorted array in ascending order:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
