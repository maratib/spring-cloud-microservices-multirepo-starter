# Use the java 
FROM eclipse-temurin:21

# Maintainer 
LABEL org.opencontainers.image.authors="maratib@gmail.com"

# Set the working directory
WORKDIR /app

# Copy the jar file
COPY target/*.jar /app/spring-docker-app.jar

# Run the jar
ENTRYPOINT ["java", "-jar", "spring-docker-app.jar"]