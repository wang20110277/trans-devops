FROM java:8

EXPOSE 16600

ARG JAR_FILE

ADD target/${JAR_FILE} /trans-oauth2.jar

ENTRYPOINT ["java", "-jar","/trans-oauth2.jar"]