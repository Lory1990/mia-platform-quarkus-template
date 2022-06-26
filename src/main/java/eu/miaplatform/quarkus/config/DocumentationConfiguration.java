package eu.miaplatform.quarkus.config;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

import javax.ws.rs.core.Application;

@OpenAPIDefinition(
        info = @Info(
                title = "Mia Platform Template",
                version = "0.0.1",
                contact = @Contact(
                        name = "Mia Platform",
                        url = "https://miaplatform.eu",
                        email = "info@miaplatform.eu"),
                license = @License(
                        name = "MIT",
                        url = "https://opensource.org/licenses/MIT"))
)
public class DocumentationConfiguration extends Application {


}
