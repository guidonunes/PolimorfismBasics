package br.com.example.view;

import br.com.example.model.User;

public class Main {
    public static void main(String[] args) {

        User us1 = new User();
        User us2 = new User("Admin", "123");
        User us3 = new User("Admin", "123", "a@b.com");

        System.out.println(us1);
        System.out.println(us2);
        System.out.println(us3);

    }
}