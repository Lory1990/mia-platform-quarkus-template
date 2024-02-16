package eu.miaplatform.quarkus.config;

import jakarta.ws.rs.core.Application;
import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Contact;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.info.License;

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
