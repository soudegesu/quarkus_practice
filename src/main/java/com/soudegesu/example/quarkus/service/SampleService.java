package com.soudegesu.example.quarkus.service;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class SampleService {

    public String helloQuarkus() {
        return "Hello, quarkus\n";
    }
}
