# Docker image for SpringBoot file run
# VERSION latest
# Author: wanghuabing
# 基础镜像使用java
FROM java:8

VOLUME /tmp

RUN echo "Asia/Shanghai" > /etc/timezone

ARG JAR_FILE

COPY target/${JAR_FILE} app.jar

COPY agent /usr/local/agent

ENV JAVA_OPTS=""

ENV SPRING_PROFILES_ACTIVE=""

ENV SKYWALKING_OAP_SERVER=""

ENV SKYWALKING_AGENT_SERVICE_NAME=""

ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -javaagent:/usr/local/agent/skywalking-agent.jar -Dskywalking.agent.service_name=$SKYWALKING_AGENT_SERVICE_NAME -Dskywalking.collector.backend_service=$SKYWALKING_OAP_SERVER -Dspring.profiles.active=$SPRING_PROFILES_ACTIVE -jar app.jar"]

#docker run --name tran-auth --restart always \
#     -d -p 16600:16600 \
#     -e SPRING_PROFILES_ACTIVE="dev" \
#     -e SKYWALKING_OAP_SERVER="192.168.10.30:11800" \
#     -e SKYWALKING_AGENT_SERVICE_NAME="tran-auth" \
#     tran-auth:latest