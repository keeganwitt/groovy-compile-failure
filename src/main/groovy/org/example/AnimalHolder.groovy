package org.example

import org.example.domain.Animal

class AnimalHolder<T extends Animal> {
    T animal

    AnimalHolder(T animal) {
        this.animal = animal
    }
}
