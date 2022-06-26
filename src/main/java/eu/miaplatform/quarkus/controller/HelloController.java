package eu.miaplatform.quarkus.controller;

import org.eclipse.microprofile.openapi.annotations.Operation;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/")
public class HelloController {

    @GET
    @Path("/")
    @Operation(summary = "Hello controller")
    public String sayHello(){
        return "Hello";
    }
}
