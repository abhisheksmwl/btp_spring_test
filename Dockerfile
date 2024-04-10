FROM eclipse-temurin:17-jdk-focal
EXPOSE 8081
COPY ./target/spring-boot-data-jpa-*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]