# Coya full stack challenge

This repository holds the full stack development challenge for applicants of COYA.

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

## Instructions

### To get the code:
Clone the repository: 
https://github.com/micflib/city-info.git

### To run the application:
-------------------
From the command line:
$ cd {path}/coya
$ mvn jetty:run

Access the deployed web application at: http://localhost:8080/coya/

## Impressions

**TODO:** Add here your impressions and notes.
