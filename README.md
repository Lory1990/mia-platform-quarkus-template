# Quarkus Template for Mia Platform
This is a template to be used in Mia Platform console to create a new Java Application using [Quarkus](https://quarkus.io).


The microservice comes with hello word endpoint
```
GET - https://localhost:8000
```
the technical ones for Kubernetes
```
/-/check
/-/healthz
/-/ready
```
And the documentation one
```
/documentation/json
```
## Local development
Make sure you have installed the following tools
* [Maven](https://maven.apache.org)
* [JDK](https://www.oracle.com/java/technologies/downloads/) (Java Development Kit) >= 17

Simply open the application with your favorite IDE (for example [intelliJIdea]( https://www.jetbrains.com/idea/)) and use the following commands to download libraries
```
mvn clean
mvn install
```
then you can run the application with
```
mvn quarkus:dev
```

if you want to run test you can use
```
mvn test
```
## Environment variables
All vcariables can be customized using `application.properties` files or injecting `UPPERCASE_DASHED_VARIABLES` into Docker container.
The main variables are:
* `HTTP_PORT` port of the container - default 8000

## Deploy
The microservice comes with Build&Deploy gitlab pipeline (see `.gitlab-ci.yml`), simply push the code and tag it when you want to deploy