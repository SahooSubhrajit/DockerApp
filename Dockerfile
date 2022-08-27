FROM java:8-jdk-alpine

COPY ./target/demo-0.0.1-SNAPSHOT.war /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java","-war","demo-0.0.1-SNAPSHOT.war"]
