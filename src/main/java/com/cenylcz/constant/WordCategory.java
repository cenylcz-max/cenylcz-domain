package com.cenylcz.constant;

public enum WordCategory {
    WORD("WORD"),
    PHRASE("PHRASE");

    private String wordCategory;

    WordCategory(String wordCategory) {
        this.wordCategory = wordCategory;
    }

    public String getWordCategory() {
        return wordCategory;
    }
}
