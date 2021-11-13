FROM java:8

VOLUME /tmp

EXPOSE 16800

RUN echo "Asia/Shanghai" > /etc/timezone

ARG JAR_FILE

COPY target/${JAR_FILE} trans-gateway.jar

COPY ../trans-skywalking/agent /usr/local/agent

ENTRYPOINT ["sh", "-c", "java -javaagent:/usr/local/agent/skywalking-agent.jar -Dskywalking.agent.service_name=trans-gateway -Dskywalking.collector.backend_service=192.168.10.30:11800 -jar trans-gateway.jar"]