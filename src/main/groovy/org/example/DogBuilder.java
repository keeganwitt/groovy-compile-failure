package org.example;

import org.example.domain.Dog;

public class DogBuilder extends AnimalBuilder<Dog> {

    public DogBuilder(String name) {
        super(name, new Dog());
    }

}
