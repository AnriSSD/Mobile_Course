package org.example;

public class Main {
    public static void main(String[] args) {
        VowelCounter counter = new VowelCounterImpl();
        String str = "Hello";
        int vowelCount = counter.countVowel(str);
        System.out.println("Number of vowels in \"" + str + "\": " + vowelCount);
    }
}
