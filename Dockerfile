FROM registry.access.redhat.com/ubi8/openjdk-21-runtime:1.18-2 AS build

ARG COMMIT_SHA=<not-specified>
ARG BUILD_FILE_NAME=generic-quarkus-template

LABEL maintainer="Lorenzo De Francesco" \
      name="generic-quarkus-template" \
      description="" \
      eu.mia-platform.url="https://www.mia-platform.eu" \
      eu.mia-platform.version="0.1.0"

ENV LANG='en_US.UTF-8' LANGUAGE='en_US:en'

USER root
RUN mkdir -p /home/java/app
RUN echo "service-name: $COMMIT_SHA" >> /home/java/app/commit.sha
RUN chown 185:185 /home/java/app
USER 185

# We make four distinct layers so if there are application changes the library layers can be re-used
COPY --chown=185 target/quarkus-app/lib/ /deployments/lib/
COPY --chown=185 target/quarkus-app/*.jar /deployments/
COPY --chown=185 target/quarkus-app/app/ /deployments/app/
COPY --chown=185 target/quarkus-app/quarkus/ /deployments/quarkus/

USER 185
ENV AB_JOLOKIA_OFF=""
ENV JAVA_OPTS="-Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager"
ENV JAVA_APP_JAR="/deployments/quarkus-run.jar"