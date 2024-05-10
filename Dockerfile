FROM eclipse-temurin:21

WORKDIR /app

COPY Anka.jar Anka.jar

COPY .env .env

EXPOSE 8080

CMD ["java", "-jar", "Anka.jar"]