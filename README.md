## VACCINATION DRIVE CRUD API

This API has developed by Chinthaka Dinadasa for Restful API development with Springboot workshop done by Dotitude @99x.

Technology Stack:

- SpringBoot 2.6.4
- Spring Data JPA
- Lombok
- H2 Database

How to start this API ? 

```shell
$ ./gradlew bootRun
```

API Base URL : [http://localhost:8080](http://localhost:8080)

Available Endpoints : 

1. GET - /api/vaccination - Read all vaccinations records from database.
2. GET - /api/vaccination/:id - Read vaccination record by id.
3. POST - /api/vaccination - Create vaccination record in the database.
4. DELETE - /api/vaccination/:id - Delete vaccination record data from database.
5. PATCH - /api/vaccination/:id - Update vaccination record data in the database.

Postman Collection : [https://www.getpostman.com/collections/16be0aa3f03486dac7f2](https://www.getpostman.com/collections/16be0aa3f03486dac7f2)

