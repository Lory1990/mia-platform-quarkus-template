package eu.miaplatform.quarkus.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.container.ContainerResponseContext;
import jakarta.ws.rs.core.MultivaluedMap;
import lombok.extern.slf4j.Slf4j;
import org.jboss.resteasy.reactive.server.ServerResponseFilter;


@ApplicationScoped
@Slf4j
public class AppLifecycleBean {

    @ServerResponseFilter
    public void postResponseHeaders(ContainerResponseContext ctx) {
        MultivaluedMap<String, Object> headers = ctx.getHeaders();
        if(headers.get("content-type") == null) {
            headers.add("content-type", "application/json");
        }
    }

}