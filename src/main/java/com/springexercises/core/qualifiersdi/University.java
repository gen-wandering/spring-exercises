package com.springexercises.core.qualifiersdi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class University {
    private final Person person1;
    private final Person person2;
    private final Person person3;

    public University(@Qualifier("myBean1") Person person1,
                      @Qualifier("teacher") Person person2,
                      @Qualifier("dean") Person person3) {
        this.person1 = person1;
        this.person2 = person2;
        this.person3 = person3;
    }

    @Override
    public String toString() {
        return "University{" +
                "student=" + person1 +
                ", teacher=" + person2 +
                ", dean=" + person3 +
                '}';
    }
}
