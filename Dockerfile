FROM gradle:9.2.0-jdk17 AS builder

WORKDIR /app
COPY . .

RUN gradle clean shadowJar -x test

FROM eclipse-temurin:17-jre

WORKDIR /app
COPY --from=builder /app/build/libs/*-all.jar app.jar

EXPOSE 9001
CMD ["java", "-jar", "app.jar"]

