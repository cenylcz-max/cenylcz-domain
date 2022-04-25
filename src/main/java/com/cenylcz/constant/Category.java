package com.cenylcz.constant;

public enum Category {
    WORD("WORD"),
    PHRASE("PHRASE");

    private String category;

    Category(String category) {
        this.category = category;
    }

    public String getCategory() {
        return category;
    }
}
