# springboot
Create H2 based REST API with scheduler
#
Author: Mariasoosai Simeon
Feb 1, 2023
#
#
This a middleware application to do the following:
#
 1. Create a spring boot application that serves as a middleware microservices for TODO list APIs
 2. The rest API should cover all CRUD operation for TODO records and be able to run the application as a JAR package
 3. This is code is built using Maven
 4. TODO dataset is persisted in H2 DB and uses JDBC packages for data persistence
 5. Incorporated facility for Swagger Rest API Docs
#
#  
# For Bonus Points:
1. Wrote a scheduler job to send email on UNCOMPLETE TODOs within the application using Spring Scheduler 
#
# Setup Instructions
#
1. Using Spring initializer to select Java version 8, Maven builder, Spring boot version (2.7.8), Spring boot web starter, JPA, H2 Database
2. Added scheduled tasks class for bonus point
3. Coded using SpringToolSuite 4


# How to run Instructions
1. Install htdemo project from https://github.com/simeon-mc/springboot 
2. Note that I have given access to Susil for both python project and springboot projects
3. Open SpringToolSuite 4
4. Open h2demo project
5. Right Click on h2demo project and Run as Spring Boot App. This will run Tomcat and listen on port 8080 and run as scheduled tasks
#
# View H2 database Instruction
6. on a browser you can view the h2 database using the following command http://localhost:8080/h2-console
7. Click on Test Connection, then click on Connect to view TODO table
#
# View TODO API Instruction
8. on a browser you can view the TODO API using the following command http://localhost:8080/swagger-ui.html
9. Click on TODO Rest Controller to view REST API and play with them
#
