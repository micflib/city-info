# Coya full stack challenge

This repository holds the full stack development challenge for applicants of COYA.

## The application

A simple frontend + backend microservice, that display data from two external services:

* https://restcountries.eu/
* https://openweathermap.org/api

### User stories

1. As a user, I access to the root path and see:
* The Berlin country name
* The Berlin weather description
* The Berlin temperature
* The Berlin currency

2. As a user, if I add a `rootPAth/:city-name` sub-path:
* The city country name
* The city weather description
* The city temperature
* The city currency

## Instructions

### To get the code:
Clone the repository: 
https://github.com/micflib/city-info.git

### To run the application:
From the command line:
```
$ cd {path}/coya
$ mvn jetty:run 
```

Access the deployed web application at: http://localhost:8080/coya/

### Technology components
* Java
* Spring Framework
* Javascript
* JQuery
* HTML, CSS

### API
* http://localhost:8080/coya/
* http://localhost:8080/coya/{cityName}

## Impressions
* My first impression of the challenge is it is simple mainly because the complexity of the task is not that hard. 
* Since I was given the freedom to choose the technologies, it gave me an extra amount of confidence to finish the task. 
* There were some challenges along the way, but I was able to provide the solution. Thanks to the internet.
* I want to implement some functions and features (animation, backend optimization, docker) but I don't have enough time.
* Some of specification, material were not given/ complete but I already expected it to happen. It is a normal scenario that not all specification are given.
