# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-alpine

# Install Maven and dependencies for DNS resolution (for MongoDB SRV record)
RUN apk add --no-cache maven bash curl

# Set the working directory
WORKDIR /app

# Copy Maven project files
COPY pom.xml ./
COPY src ./src

# Build the application and create the JAR file
RUN mvn -B clean package

# Expose port for the application
EXPOSE 8080

# Use a dynamic JAR file name
CMD ["sh", "-c", "java -jar target/*.jar"]
