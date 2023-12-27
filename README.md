# Movies
## Table of contents
* [General information](#general-information)
* [Technologies](#technologies)
* [Setup](#setup)

## General Information
The project allows you to manage a database of movies, their categories and the actors appearing in them. The project was an example of CRUD application using Spring Boot and Hibernate.
## Technologies
Technologies used in the project:
* Java 17
* Spring Boot 2.6.7
* Thymleaf
* Lombok
* Docker
* PostgreSQL
* JPA/Hibernate
## Setup
Before run application you should configurate your database and db server in few step:
* Create database connection with Docker pasting in command line:
  <br>`docker run --name movies -e POSTGRES_PASSWORD=password -d -p 5432:5432 postgres`
* Connect with server:
  <br>Login: postgres
  <br>Password: password
   
    
  

