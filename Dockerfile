FROM eclipse-temurin:21

WORKDIR /app

COPY . .

# COPY .env /app/.env INJECT VARIABLES INSTEAD

EXPOSE 8080

CMD ["java", "-jar", "Anka.jar"]