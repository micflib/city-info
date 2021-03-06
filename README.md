## The application

We want to create a simple frontend + backend microservice,
that display data from two external services:

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

### UX design

You can find the assets under the folder assets and a version of the desktop and mobile versions of the frontend.

### Notes:

* We estimate this challenge to be done around 5 hours.
* You don't have any restriction about languages and methodologies.

## The acceptance criteria

* Follow the UX design and the user story.
* Provide instructions under the **Instructions** section.
* Provide some notes about the challenge into **Impressions** section.
* Use git to deliver your challenge `git bundle create $myName-coya-fs-challenge.git master`.

### Extra point (none mandatory)

We use docker (a lot!!) in our company,
but we know that takes time create Dockerfiles and docker-compose.yml files,
so if you have time please add some basic docker way to run your challenge.

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
