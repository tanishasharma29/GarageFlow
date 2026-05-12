# Use Java 17 (stable for Spring Boot)
FROM eclipse-temurin:17-jdk

# Work directory
WORKDIR /app

# Copy project files
COPY . .

# Give permission to Maven wrapper
RUN chmod +x mvnw

# Build the project
RUN ./mvnw clean package -DskipTests

# Run the jar
CMD ["java", "-jar", "target/garageflow-0.0.1-SNAPSHOT.jar"]