package com.soudegesu.example.quarkus.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces
    public String hello() {
        return "hello";
    }

}
