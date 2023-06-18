FROM tomcat:10-jdk17-openjdk-buster
COPY Docker-web-project-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps
