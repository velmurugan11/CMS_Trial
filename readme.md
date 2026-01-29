# ContentHub

ContentHub is a lightweight Content Management System (CMS) backend built with **Spring Boot**. It provides a simple REST API to manage and retrieve digital content.

## 🚀 Features

- **Content Management**: Create and store content with metadata.
- **Content Filtering**: Retrieve only published content.
- **In-Memory Database**: Uses H2 database for quick setup and testing.
- **RESTful API**: Clean and intuitive API endpoints.

## 🛠️ Tech Stack

- **Java 21**
- **Spring Boot 4.0.2**
  - Spring Web MVC
  - Spring Data JPA
- **Database**: H2 (In-memory)
- **Utilities**: Lombok

## 📂 Data Model

 The `Content` entity acts as the core resource, containing:
- **id**: Unique identifier (Auto-generated)
- **title**: Title of the content
- **body**: Main content text (up to 5000 characters)
- **author**: Creator of the content
- **status**: Publishing status (e.g., "PUBLISHED", "DRAFT")

## 🔌 API Endpoints

Base URL: `/cms/contents`

| Method | Endpoint | Description |
| :--- | :--- | :--- |
| `POST` | `/cms/contents` | Create a new content entry. |
| `GET` | `/cms/contents/published` | Retrieve a list of all *published* content. |
| `GET` | `/cms/contents/{id}` | Get a specific content item by its ID. |

### Example JSON Payload (Create Content)

```json
{
  "title": "Getting Started with Spring Boot",
  "body": "Spring Boot makes it easy to create stand-alone, production-grade Spring based Applications...",
  "author": "Jane Doe",
  "status": "PUBLISHED"
}
```

## 🏃 How to Run

1. **Clone the repository.**
2. **Navigate to the project directory:**
   ```sh
   cd contenthub
   ```
3. **Run the application using Maven Wrapper:**
   - **Windows**:
     ```powershell
     .\mvnw spring-boot:run
     ```
   - **Linux/Mac**:
     ```sh
     ./mvnw spring-boot:run
     ```

The application will start on `http://localhost:8080`.

## 🗄️ H2 Console

You can access the in-memory database console at:
- **URL**: `http://localhost:8080/h2-console`
- **JDBC URL**: `jdbc:h2:mem:testdb` (Default, verify in logs if different)
- **User Name**: `sa`
- **Password**: (Empty / Blank)
