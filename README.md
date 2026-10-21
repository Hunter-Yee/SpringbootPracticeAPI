Practice using Spring Boot and APIs using https://api.jsonplaceholder.dev

Request flow:
- Request /api/users/1 from local Spring Boot application
- Spring Boot's controller receives the request
- The controller calls a service
- The service makes an outbound HTTPS GET request to JSONPlaceholder.
- JSONPlaceholder returns user data as JSON.
- Spring Boot returns the JSON to your browser.