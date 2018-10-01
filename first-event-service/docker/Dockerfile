FROM java:8-jre

MAINTAINER ramzess

ADD first-event-service.jar first-event-service.jar

ENV JAVA_OPTS ""
ENV APP_OPTS ""
ENTRYPOINT ["/bin/bash", "-c", "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /railway-outdoor.jar ${APP_OPTS}"]
