package com.springexercises.parta.customdicontainer;

import com.springexercises.parta.model.Database;
import com.springexercises.parta.model.MySQLDatabase;
import com.springexercises.parta.model.UserRepository;

public class Main {
    private static final Container container = new Container();

    public static void main(String[] args) {
        container.bind(Database.class, new MySQLDatabase());
        container.bind(UserRepository.class);

        UserRepository userRepository = container.make(UserRepository.class);
        System.out.println(userRepository);

        UserRepository repository = container.make(UserRepository.class);

        System.out.println(repository); // Output: UserRepository@<hashcode>
        System.out.println(repository.getDb()); // Output: MySQLDatabase@<hashcode>
    }
}
