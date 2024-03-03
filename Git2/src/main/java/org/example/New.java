package org.example;

class SymbolReplacer implements SymbolReplacerA, SymbolReplacerB {
    //Override
    public String replaceSymbolA(String str) {
        return str.replace('a', 'z');
    }

    //Override
    public String replaceSymbolB(String str) {
        return str.replace('b', 'w');
    }
}
