# Getting Started

### Reference Documentation

This project was created to reproduce the bug in spring-data-jdbc when we try to load only one column from a table inside 
an Optional, and its value is null in DB, it is throwing `Couldn't find PersistentEntity for type class java.lang.String!`
exception (because in this example I am returning an String inside the Optional).

This behavior has started after upgrading spring-boot from `2.5.10` to `2.6.0`

### How to reproduce

To reproduce the error, run all tests with the command
```bash
./gradlew cleanTest test -i
```