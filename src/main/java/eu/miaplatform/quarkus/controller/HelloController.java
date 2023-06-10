package eu.miaplatform.quarkus.controller;

import org.eclipse.microprofile.openapi.annotations.Operation;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("/")
public class HelloController {

    @GET
    @Path("/")
    @Operation(summary = "Hello controller")
    public String sayHello(){
        return "Hello";
    }
}
