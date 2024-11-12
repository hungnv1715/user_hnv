FROM openjdk:17-jdk-slim
ENV JAVA_OPTS=""
WORKDIR /app
COPY target/user_hnv-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
