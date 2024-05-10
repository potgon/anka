FROM eclipse-temurin:21

WORKDIR /app

COPY .mvn/ .mvn

COPY mvnw pom.xml ./

COPY .env .env

RUN ./mvnw dependency:go-offline

COPY src ./src

EXPOSE 8080

CMD ["./mvnw", "spring-boot:run"]