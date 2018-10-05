FROM java:8-jre

MAINTAINER ramzess

ADD app.jar app.jar

ENV JAVA_OPTS ""
ENV APP_OPTS ""

ENTRYPOINT ["/bin/bash", "-c",  "java ${JAVA_OPTS} -Djava.security.egd=file:/dev/./urandom -jar /app.jar ${APP_OPTS}"]