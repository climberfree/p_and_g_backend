# Animal Spring Boot Application

This is a simple Spring Boot application to manage animals in an H2 in-memory database.

## Running the Application

1. Make sure you have Java 21 installed.
2. Clone the repository.
3. Navigate to the project directory.
4. Run the application using your preferred IDE or using the command line:
   ```mvn spring-boot:run```

## Endpoints
### Get all animals

URL: /animals
Method: GET
Response:

``
[
{
"id": 1,
"name": "P",
"species": "Penguin",
"age": 5
},
{
"id": 2,
"name": "G",
"species": "Girrafe",
"age": 3
}
]
``

### Get animal by ID
URL: /animals/{id}
Method: GET
Response:

``
{
"id": 1,
"name": "Leo",
"species": "Lion",
"age": 5
}
``

### Create a new animal

URL: /animals
Method: POST
Request Body:

``{
"name": "Bella",
"species": "Cat",
"age": 2
}
``

Response:
``{
"id": 3,
"name": "Bella",
"species": "Cat",
"age": 2
}
``

Curl:
``curl -X POST http://localhost:8080/animals -H "Content-Type: application/json" -d '{"name":"Bella","species":"Cat","age": 2}'``

### Delete an animal
URL: /animals/{id}
Method: DELETE
Response: 204 No Content