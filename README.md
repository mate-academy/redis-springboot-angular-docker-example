# redis-springboot-angular-docker-example

This project is an example of a popular technology stack based on Redis + Angular + SpringBoot + Docker.
This project can be useful if you have the test task required technologies listed above.

#### Strongly recommended:
Go through official Angular [tutorial](https://angular.io/tutorial) if you haven't done it yet

### For launch project
1. Install Docker Desktop and register on DockerHub

1. Run next command in terminal from `tour-of-heroes-api` directory:

    > mvn clean package

1. Run next command in terminal from the main directory:

    > docker-compose up --build

1. Open your browser on http://localhost:4200.

1. To verify redis is woring send the following HTTP GET requests:
    - insert data:
        > http://localhost:8080/redis/add?key=alice&value=1234
        > http://localhost:8080/redis/add?key=bob&value=3456
    - get data back
        > http://localhost:8080/redis?key=alice
        > http://localhost:8080/redis?key=bob

### For local development
1. Install redis: [doc](https://redis.io/topics/quickstart)

1. After installation run tests. The command will be printed in the console right after installation.

1. Run redis:
    > redis-server

1. Test redis is up
    > redis-cli ping

1. If everything is OK - run SpringBoot app and send get request:
    - insert data:
        > http://localhost:8080/redis/add?key=alice&value=1234
        > http://localhost:8080/redis/add?key=bob&value=3456
    - get data back
        > http://localhost:8080/redis?key=alice
        > http://localhost:8080/redis?key=bob
