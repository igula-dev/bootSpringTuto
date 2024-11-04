# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-alpine

# Set the working directory inside the container
RUN addgroup -S app && adduser -S app -G app

WORKDIR /app

# Copy the JAR file from the target directory to the working directory
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

# Expose the port your application will run on (if applicable)
EXPOSE 8080

# Set the entry point for the container
ENTRYPOINT ["java", "-jar", "app.jar"]