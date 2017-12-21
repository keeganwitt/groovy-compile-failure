package org.example;

import org.example.domain.Dog;

public class DogBuilder extends AnimalBuilder<Dog> {

    public DogBuilder() {
        super(new Dog());
    }

}
