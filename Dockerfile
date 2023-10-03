FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
RUN ls
RUN ls build/libs/
COPY build/libs/Gruppuppgift-0.0.1-SNAPSHOT.jar gradle-wrapper.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/gradle-wrapper.jar"]