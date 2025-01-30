# Use the java 
FROM eclipse-temurin:21

# Maintainer 
LABEL org.opencontainers.image.authors="maratib@gmail.com"

# Set the working directory
WORKDIR /app

# Copy the jar file
COPY target/gateway-0.0.1-SNAPSHOT.jar /app/spring-docker-app.jar

# Expose the port
EXPOSE 8888
EXPOSE 8080


# Run the jar
ENTRYPOINT ["java", "-jar", "spring-docker-app.jar"]