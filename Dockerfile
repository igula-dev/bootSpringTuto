# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-alpine

# Install Maven
RUN apk add --no-cache maven

WORKDIR /app

# Copy Maven project files
COPY pom.xml ./
COPY src ./src

# Build the application and create the JAR file
RUN mvn -B clean package

ARG JAR_FILE=target/*.jar

# Run the application directly from the target directory
CMD ["java", "-jar", "target/${JAR_FILE}"]
