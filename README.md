# Makersharks Supplier Search API

## Overview

This API provides the capability to search for manufacturers based on location, nature of business, and manufacturing processes. It supports pagination and input validation.

## API Endpoints

### 1. **Retrieve Manufacturers**

- **Endpoint:** `/api/supplier/query`
- **Method:** POST
- **Description:** Retrieves a list of manufacturers based on the given criteria.

#### Query Parameters

The query parameters should be included in the URL of the POST request.

- `companyName` (optional): The name of the company.
- `location` (required): The city where the manufacturer is located.
- `natureOfBusiness` (required): The scale of the business (`small_scale`, `medium_scale`, `large_scale`).
- `manufacturingProcess` (required): The manufacturing process capability (`moulding`, `3d_printing`, `casting`, `coating`).
- `page` (optional): The page number for pagination. Must be a non-negative integer.
- `size` (optional): The number of results per page. Must be a non-negative integer.

#### Example Request

```
POST http://localhost:8080/api/supplier/query?companyName=TechPrints Ltd&location=India&natureOfBusiness=small_scale&manufacturingProcess=3d_printing&page=1&size=10
```

#### Response

A successful response will return a JSON array of manufacturers matching the criteria:

```json
[
  {
    "supplier_id": "string",
    "company_name": "string",
    "website": "string",
    "location": "string",
    "nature_of_business": "string",
    "manufacturing_processes": ["string"]
  }
]
```

## Running the Application

1. **Clone the Repository:**

  
   git clone https://github.com/yourusername/your-repository.git
   cd your-repository


2. **Build the Project:**

   Ensure you have Gradle installed. Run:

   
   ./gradlew build
 

3. **Run the Application:**

   You can run the application using:

  
   ./gradlew bootRun
 

   Alternatively, you can run the JAR file:

  
   java -jar build/libs/your-application.jar
 

4. **Access the API:**

   The application will be available at `http://localhost:8080`.

## Example CURL Commands

### Fetch Manufacturers


curl -X POST "http://localhost:8080/api/supplier/query?companyName=TechPrints Ltd&location=India&natureOfBusiness=small_scale&manufacturingProcess=3d_printing&page=1&size=10"
=

## Validation Rules

- **page** and **size** must be non-negative integers. 

## Testing

To run unit tests, use:


./gradlew test



## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

Feel free to modify any details based on your specific setup and project requirements!
