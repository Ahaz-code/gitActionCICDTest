#FROM ubuntu:latest
#LABEL authors="Yidne"
#
#ENTRYPOINT ["top", "-b"]

FROM openJdk:17
EXPOSE 8080
ADD target/git-action-cicd.jar git-action-cicd.jar
ENTRYPOINT ["java","-jar","/git-action-cicd.jar"]
