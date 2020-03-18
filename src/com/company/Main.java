package com.company;

import com.company.Words;

public class Main {

    public static void main(String[] args) {
        Words words = new Words();
        System.out.printf("Your new password is: \"%s\"!", words.generatePassword());

    }
}
