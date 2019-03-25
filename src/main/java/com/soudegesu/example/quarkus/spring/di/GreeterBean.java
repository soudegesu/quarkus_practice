package com.soudegesu.example.quarkus.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class GreeterBean {

    private final MessageProducer messageProducer;

    @Autowired
    @Qualifier("noopFunction")
    StringFunction noopFunction;

    @Autowired
    @Qualifier("capitalizeFunction")
    StringFunction capitalizerStringFunction;

    @Value("${greering.suffix:!}")
    String suffix;

    public GreeterBean(MessageProducer messageProducer) {
        this.messageProducer = messageProducer;
    }

    public String greet(String name) {
        final  String initialValue = messageProducer.getPrefix() + " " + name + suffix;
        return noopFunction.andThen(capitalizerStringFunction).apply(initialValue);
    }
}
