# 🍽️ Restaurant and Food Items REST API

## 📌 Project Overview

The **Restaurant and Food Items REST API** is a Spring Boot application that manages restaurant details and their associated food items.

This project demonstrates CRUD operations, RESTful web services, Spring Data JPA, MySQL database integration, and the `@ManyToOne` relationship between Food Items and Restaurants.

**Swagger UI** is used to explore, test, and execute API endpoints directly from the browser without using Postman.

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Hibernate
- MySQL
- Maven
- Swagger UI / Springdoc OpenAPI
- Eclipse IDE

## ✨ Features

- Create a new restaurant.
- Retrieve all restaurants.
- Retrieve a restaurant by ID.
- Update restaurant details.
- Delete a restaurant.
- Add food items to a restaurant.
- Retrieve all food items.
- Retrieve a food item by ID.
- Update food item details.
- Delete a food item.
- Establish a `@ManyToOne` relationship between Food Items and Restaurants.
- Test API endpoints using Swagger UI.
- Automatically generate interactive API documentation.

## 🏗️ Project Architecture

The application follows a layered architecture:

```text
RestaurantFoodApp
        |
        v
    Controller
        |
        v
     Service
        |
        v
    Repository
        |
        v
   MySQL Database
```

### Layers

- **Controller:** Handles HTTP requests and returns responses.
- **Service:** Contains business logic.
- **Repository:** Performs database operations using Spring Data JPA.
- **Entity:** Represents database tables.
- **MySQL:** Stores restaurant and food item information.
- **Swagger UI:** Provides an interactive interface for testing API endpoints.

## 🔗 Entity Relationship

The project uses a `@ManyToOne` relationship.

**Relationship:** Many Food Items can belong to one Restaurant.

Example:

```text
Restaurant
-----------
id
name
location

       1
       |
       | @OneToMany
       |
       | @ManyToOne
       |
       N

FoodItem
--------
id
name
price
restaurant_id
```

For example, one restaurant can offer Chicken Biryani, Veg Biryani, Paneer Tikka, and other food items.

Each food item belongs to one restaurant.

The `restaurant_id` foreign key in the Food Items table identifies its associated restaurant.

## 🗄️ Database Configuration

Create the MySQL database:

```sql
CREATE DATABASE restaurantdb;
```

Configure the database connection in `src/main/resources/application.properties`:

```properties
spring.application.name=restaurant-food-app

spring.datasource.url=jdbc:mysql://localhost:3306/restaurantdb
spring.datasource.username=root
spring.datasource.password=YOUR_MYSQL_PASSWORD

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

server.port=8080
```

Replace `YOUR_MYSQL_PASSWORD` with your actual MySQL password.

**Note:** Use the database name and port configured in your application.

## 📡 REST API Endpoints

The following endpoints describe the intended API design. They will be available in Swagger only if the corresponding controller mappings are implemented in the application.

### 🏢 Restaurant APIs

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/api/restaurants` | Create a restaurant |
| GET | `/api/restaurants` | Retrieve all restaurants |
| GET | `/api/restaurants/{id}` | Retrieve a restaurant by ID |
| PUT | `/api/restaurants/{id}` | Update a restaurant |
| DELETE | `/api/restaurants/{id}` | Delete a restaurant |

### 🍕 Food Item APIs

| HTTP Method | Endpoint | Description |
|---|---|---|
| POST | `/api/food-items` | Create a food item |
| GET | `/api/food-items` | Retrieve all food items |
| GET | `/api/food-items/{id}` | Retrieve a food item by ID |
| PUT | `/api/food-items/{id}` | Update a food item |
| DELETE | `/api/food-items/{id}` | Delete a food item |

## 📝 Sample JSON Requests

### 1. Create a Restaurant

**POST** `/api/restaurants`

Request body:

```json
{
  "name": "Spice Garden",
  "location": "Hyderabad"
}
```

### 2. Create a Food Item

First, create a restaurant and note its generated ID.

**POST** `/api/food-items`

Request body:

```json
{
  "name": "Chicken Biryani",
  "price": 250.0,
  "restaurant": {
    "id": 1
  }
}
```

Here, `restaurant.id` refers to the existing restaurant to which the food item belongs. The exact JSON structure depends on how the application's controller and entity classes are implemented.

## 🧪 API Testing Using Swagger UI

This project uses Swagger UI instead of Postman to test the REST APIs.

### Steps to Run and Test

**Step 1:** Start the Spring Boot application from Eclipse.

**Step 2:** Wait until the application starts successfully.

**Step 3:** Open the following URL in your browser:

`http://localhost:8080/swagger-ui/index.html`

**Step 4:** Find the Restaurant and Food Item API sections.

**Step 5:** Expand the endpoint you want to test.

**Step 6:** Click **Try it out**.

**Step 7:** Enter the required parameters or JSON request body.

**Step 8:** Click **Execute**.

**Step 9:** Check the HTTP status code and server response displayed by Swagger UI.

### Swagger URLs

| Purpose | URL |
|---|---|
| Swagger UI | `http://localhost:8080/swagger-ui/index.html` |
| OpenAPI JSON documentation | `http://localhost:8080/v3/api-docs` |

If your application runs on a different port, replace `8080` with your configured port.

## 📦 Swagger Dependency

Add the following dependency to your `pom.xml` if it is not already present:

```xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.8.13</version>
</dependency>
```

After adding the dependency:

1. Save `pom.xml`.
2. Right-click the project in Eclipse.
3. Select **Maven → Update Project**.
4. Restart the Spring Boot application.
5. Open the Swagger UI URL in your browser.

Official documentation: https://springdoc.org/

## 📂 Project Structure

A typical project structure is:

```text
src/main/java
└── com.example.restaurantfoodapp
    ├── RestaurantFoodAppApplication.java
    ├── controller
    │   ├── RestaurantController.java
    │   └── FoodItemController.java
    ├── service
    │   ├── RestaurantService.java
    │   └── FoodItemService.java
    ├── repository
    │   ├── RestaurantRepository.java
    │   └── FoodItemRepository.java
    ├── entity
    │   ├── Restaurant.java
    │   └── FoodItem.java
    └── config
        └── OpenApiConfig.java

src/main/resources
└── application.properties

pom.xml
README.md
```

The package names and file structure above are examples. Adjust them to match your actual project.

## ▶️ How to Run the Project

1. Install Java and Eclipse IDE.
2. Install and start MySQL Server.
3. Create the `restaurantdb` database.
4. Configure the MySQL credentials in `application.properties`.
5. Open the project in Eclipse.
6. Update the Maven dependencies.
7. Run the Spring Boot main application class.
8. Open Swagger UI in your browser.
9. Execute the available API endpoints.

## 🎯 Learning Outcomes

By developing this project, you can learn:

- Building REST APIs with Spring Boot.
- Performing CRUD operations.
- Connecting Spring Boot with MySQL.
- Using Spring Data JPA repositories.
- Mapping entities using `@ManyToOne`.
- Managing relationships between database tables.
- Generating API documentation using OpenAPI.
- Testing REST endpoints using Swagger UI.

## 👨‍💻 Conclusion

The Restaurant and Food Items REST API demonstrates how to build a RESTful backend using Spring Boot, Spring Data JPA, and MySQL.

Swagger UI provides an interactive way to explore and test the implemented endpoints directly from a browser, making API development and verification easier without requiring Postman.
