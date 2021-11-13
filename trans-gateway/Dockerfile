FROM java:8

EXPOSE 16800

ARG JAR_FILE

ADD target/${JAR_FILE} /trans-gateway.jar

ENTRYPOINT ["java", "-jar","/trans-gateway.jar"]