FROM openjdk:24-jdk

WORKDIR /app

CMD ["java", "-jar", "app/store/app.jar"]
