package api_demo;

import tools.jackson.databind.JsonNode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;

@Service
public class UserService {

    private final RestClient restClient;

    public UserService(RestClient.Builder builder) {
        this.restClient = builder
                .baseUrl("https://jsonplaceholder.typicode.com")
                .build();
    }

    public JsonNode getUser(int id) {
        return restClient.get()
                .uri("/users/{id}", id)
                .retrieve()
                .body(JsonNode.class);
    }

    public JsonNode getAllUsers() {
        return restClient.get()
                .uri("/users")
                .retrieve()
                .body(JsonNode.class);
    }

}
