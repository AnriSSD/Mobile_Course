package org.example;

public class Main {
    public static void main(String[] args) {
        SymbolReplacer replacer = new SymbolReplacer();
        String text1 = "Lela";
        String text2 = "Gabelaia";

        System.out.println("Replacing 'a' with 'z': " + replacer.replaceSymbolA(text1));
        System.out.println("Replacing 'b' with 'w': " + replacer.replaceSymbolB(text2));
    }
}
