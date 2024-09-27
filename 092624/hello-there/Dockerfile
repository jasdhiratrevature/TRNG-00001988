# Runtime stage
FROM openjdk:17
COPY target/hello-there-0.0.1-SNAPSHOT.jar hello-there.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "/hello-there.jar"]