# Docker image for SpringBoot file run
# VERSION latest
# Author: wanghuabing
# 基础镜像使用java
FROM java:8

VOLUME /tmp

RUN echo "Asia/Shanghai" > /etc/timezone

ARG JAR_FILE

COPY target/${JAR_FILE} app.jar

ENV JAVA_OPTS=""

ENV SPRING_PROFILES_ACTIVE=""

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE -jar app.jar"]

#docker run --name tran-gateway --restart always \
#     -d -p 16800:16800 \
#     -e SPRING_PROFILES_ACTIVE="dev" \
#     -e SKYWALKING_OAP_SERVER="192.168.10.30:11800" \
#     -e SKYWALKING_AGENT_SERVICE_NAME="tran-gateway" \
#     tran-gateway:latest