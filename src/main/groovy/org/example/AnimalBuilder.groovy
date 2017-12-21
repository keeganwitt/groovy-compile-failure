package org.example

import org.example.domain.Animal

class AnimalBuilder<T extends Animal> {

    T animal;

    AnimalBuilder(T animal) {
        this.animal = animal
    }

    T getAnimal() {
        return animal
    }

    AnimalBuilder<T> name (String name) {
        animal.setName(name)
        this;
    }

}
