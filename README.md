# async-context

## Description
```
A project to ilustrate the issue opened in spring project 
```
[ISSUE LINK](https://github.com/spring-projects/spring-boot/issues/36763)

### Call two times the request below you will see the error in console

```bash
curl --location --request POST 'http://localhost:8080/cars/async'
```

```bash
curl --location --request POST 'http://localhost:8080/cars/sync'
```
