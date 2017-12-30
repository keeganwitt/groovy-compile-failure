package org.example

import org.example.domain.Dog

class DogHolder extends AnimalHolder<Dog> {

    public DogHolder() {
        super(new Dog())
    }

}
