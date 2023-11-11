FROM maven:3.8.6-openjdk-11 AS builder
COPY . /build
WORKDIR /build
RUN mvn clean package -DskipTests

FROM openjdk:11-slim
COPY --from=builder /build/target/memorySupport-0.0.1-SNAPSHOT.jar /app/memorySupport-0.0.1-SNAPSHOT.jar
WORKDIR /app

EXPOSE 8080

CMD ["java", "-jar", "memorySupport-0.0.1-SNAPSHOT.jar"]