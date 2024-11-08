# Use the official OpenJDK 17 image as the base image
FROM openjdk:17-alpine

# Install Maven
RUN apk add --no-cache maven

# Set the working directory
WORKDIR /app

# Copy Maven project files
COPY pom.xml ./
COPY src ./src

# Build the application and create the JAR file
RUN mvn -B clean package

# Run the application directly from the target directory
CMD ["java", "-jar", "target/your-app.jar"]
