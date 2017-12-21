package org.example;

import org.example.domain.Cat;

public class CatBuilder extends AnimalBuilder<Cat> {

    public CatBuilder(String name) {
        super(name, new Cat());
    }

}
