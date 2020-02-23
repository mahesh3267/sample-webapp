FROM tomcat:9
ADD build/libs/sample-webapp*.war  /usr/local/tomcat/webapps/sample-webapp.war
