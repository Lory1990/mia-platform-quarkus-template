package eu.miaplatform.quarkus.config;

import io.quarkus.smallrye.openapi.runtime.OpenApiDocumentService;
import org.eclipse.microprofile.openapi.annotations.Operation;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/")
public class CPStatusController {

    @Inject
    OpenApiDocumentService openApiDocumentService;

    @GET
    @Path("/-/healthz")
    @Operation(summary = "Mia health endpoint")
    public Response healthz() {
        return Response.ok().build();
    }

    @GET
    @Path("/-/ready")
    @Operation(summary = "Mia ready endpoint")
    public Response ready() {
        return Response.ok().build();
    }

    @GET
    @Path("/-/check-up")
    @Operation(summary = "Mia checkup endpoint")
    public Response checkUp() {
        return Response.ok().build();
    }

    @GET
    @Path("/documentation/json")
    @Operation(summary = "Mia documentation endpoint", hidden = true)
    public Response getDocumentation() {
        return Response.ok(openApiDocumentService.getJsonDocument()).build();
    }
}
