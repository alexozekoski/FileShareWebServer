FROM openjdk:24-jdk

WORKDIR /app

CMD ["java", "-jar", "store/app.jar"]
