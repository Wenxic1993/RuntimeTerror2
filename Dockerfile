# start container: docker run -d -p 80:80 rtt2 rtt2
FROM maven:3-jdk-11-slim AS build 

# Copy the java source files to docker image 
COPY ./src ./src

# Copy the pom file from java source to docker image
COPY ./pom.xml ./pom.xl

# Run a maven build to package the jar 
FROM openjdk:11-jre-slim

# Copy jar from the target folder to the docker image 
COPY --from=build /home/app/target/rtt2.jar target/rtt2.jar

# Expose port
EXPOSE 8080 

# Set the Entrypoint to run the java .jar
ENTRYPOINT ["java", "-jar", "./rtt2.jar"]
