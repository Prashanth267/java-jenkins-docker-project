FROM tomcat:10-jdk17-openjdk-buster
COPY ./java-project/target/*.war /usr/local/tomcat/webapps