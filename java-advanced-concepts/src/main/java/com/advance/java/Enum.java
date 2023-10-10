package com.advance.java;

//*An enum can help us to define variables that will never change, like days or months. */

enum Color {
    WHO("World Health Organization"), GREEN, BLUE;

    private String value;

    Color(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}