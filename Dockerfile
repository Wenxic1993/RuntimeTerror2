FROM maven:3-jdk-11-slim AS build
COPY ./pom.xml ./pom.xml
COPY ./src  ./src
RUN mvn install 
FROM openjdk:11-jre-slim
WORKDIR /RuntimeTerror2
COPY --from=build ./target/runtimeterror2-0.0.1-SNAPSHOT.jar ./runtimeterror2-0.0.1-SNAPSHOT.jar
 
EXPOSE 8080
CMD ["java", "-jar", "./runtimeterror2-0.0.1-SNAPSHOT.jar"]
