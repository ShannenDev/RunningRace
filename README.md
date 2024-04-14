# Running Race
Running Race is a web-based application dedicated to managing running races. It provides interfaces for users to browse existing races and add new ones.
## Technology Stack
Running Race is built with the following technologies:
* Spring MVC: The application is structured around the MVC design pattern, separating the application logic and user interface.
* Spring Data JPA: Used for managing database interactions in an easy and straightforward way.
* Lombok: This library is used to reduce boilerplate code for model objects.
* Thymeleaf: Provides the frontend to render views to the user, accept inputs, and transition to different views based on the user actions.
* H2: Used as the primary database, employing the Hibernate dialect for H2 to persist data.
* Java SDK version 17: For leveraging the latest features and improvements of the Java language.
* SwaggerUI/OpenAPI: Used for API documentation.
## Application Structure
The application is structured into layers following standard Java web application conventions:
1. Controller Layer: This layer handles the client requests and responses, providing endpoints for UI integration.
2. Service Layer: A service component that interfaces with the data repository for managing the data related to races.
3. Repository Layer: An interface for the database operations extends CrudRepository, facilitating the basic CRUD operations.
4. Model: Represents the data structure of the application.
5. Converter: Helps in converting between DTOs and Database entities.
## Thymeleaf frontend
Serves as the primary mode of interaction for users, enabling them to navigate different pages, fetch data, and take actions like adding races, runners, and results.
The frontend has the following responsibilities:
1. Homepage (`home` endpoint): Serves the main view or homepage to the user. It fetches the lists of all races and runners using the RaceService and RunnerService. These entities are converted into string-formatted lists and distributed alongside the original lists of races and runners to the frontend via the model. Fresh instances of Race, Runner, and ResultRequest are also included to the model to handle any new data input from the user.
2. Adding a New Race (`/addRace` endpoint): Handles the POST requests for adding a new race to the application. It leverages the RaceService to add the new details of the race. After adding the race, it redirects to the homepage.
3. Adding a New Runner (`/addRunner` endpoint): Handles the POST requests for adding a new runner to the application. It uses the RunnerService to add the new details of the runner. After adding the runner, it redirects to the homepage.
4. Adding a New Result (`/addResult` endpoint): Handles POST requests for adding a new race result. It uses the ResultService to add the result and after adding, it redirects to the homepage.
5. Race Details (`/getRaceRunners` endpoint): Fetches and displays the details of a specific race, including the average time to complete the race and the runners and their respective results. It fetches race details using ResultService for a specific race given by the UUID parameter. The result is displayed in the `results` view.
## User Guide
To run the project locally, execute in the project root:
```shell
./gradlew bootRun
```
Once the project is running, you can access the following pages:
* Thymeleaf frontend: http://localhost:8080/
* SwaggerUI: http://localhost:8080/swagger-ui/index.html

