package org.example

import org.example.domain.Animal

class AnimalBuilder<T extends Animal> {

    T animal;

    AnimalBuilder(String name, T animal) {
        this.animal = animal
        animal.setName(name)
    }

    T getAnimal() {
        return animal
    }

    AnimalBuilder<T> name (String name) {
        animal.setName(name)
        this;
    }

}
