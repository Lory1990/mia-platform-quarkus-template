package eu.miaplatform.quarkus.config;

import lombok.extern.slf4j.Slf4j;
import org.jboss.resteasy.reactive.server.ServerResponseFilter;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.core.MultivaluedMap;
import java.util.UUID;

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