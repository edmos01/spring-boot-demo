FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.18_10
#FROM adoptopenjdk/openjdk11:alpine
EXPOSE 8080
RUN mkdir /opt/app
COPY application.jar /opt/app
CMD ["java", "-jar", "/opt/app/application.jar"]