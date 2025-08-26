package org.surja.rest_template_demo;


import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
@RequestMapping("/blog")
public class BlogController {

    /*
--------------------------------------------------------
               RESTTEMPLATE - SPRING BOOT
--------------------------------------------------------

What is RestTemplate?
- A synchronous HTTP client provided by Spring.
- Used to call REST APIs from a Spring Boot application.
- Part of spring-boot-starter-web.
- Converts JSON/XML to Java objects using MessageConverters.

Synchronous?
- Means blocking → the code waits until the API responds.
- Example: Thread pauses until response is received.

How to configure (Best Practice)?
@Configuration
public class AppConfig {
    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}

Common Methods:
1. getForObject(url, responseType)
   - Fetches response body and maps to Java class.
   - Example:
     Post post = restTemplate.getForObject(url, Post.class);

2. getForEntity(url, responseType)
   - Returns ResponseEntity (body + status + headers).
   - Example:
     ResponseEntity<Post> response = restTemplate.getForEntity(url, Post.class);

3. postForObject(url, request, responseType)
   - Sends POST and maps response to Java object.
   - Example:
     Post post = restTemplate.postForObject(url, newPost, Post.class);

4. put(url, request)
   - Sends PUT request (no response body).
   - Example:
     restTemplate.put(url, updatedPost);

5. delete(url)
   - Sends DELETE request.
   - Example:
     restTemplate.delete(url);

6. exchange(url, method, HttpEntity, responseType)
   - Flexible: allows headers, body, method selection.
   - Example:
     HttpHeaders headers = new HttpHeaders();
     headers.set("Authorization", "Bearer token");
     HttpEntity<String> entity = new HttpEntity<>(headers);
     ResponseEntity<Post> response =
         restTemplate.exchange(url, HttpMethod.GET, entity, Post.class);

When to use?
- Good for simple, synchronous REST calls.
- If high concurrency or async required → use WebClient instead.

Notes:
- getForObject → when you have a matching Java class for response.
- getForEntity → when you need body + headers + status.
- RestTemplate is in maintenance mode (Spring recommends WebClient for new projects).

--------------------------------------------------------
*/


    @Autowired
    private RestTemplate restTemplate;


//    @GetMapping("/{id}")
//    public ResponseEntity<JsonNode> getForObjectDemo(@PathVariable Long id){
//        String url ="https://jsonplaceholder.typicode.com/posts/"+id;
//        JsonNode jsonNode = restTemplate.getForObject(url, JsonNode.class);
//
//        return ResponseEntity.ok(jsonNode);
//    }

    @GetMapping("/{id}")
    public ResponseEntity<BlogDTO> customizedGetForObjectDemo(@PathVariable Long id){
        String url = "https://jsonplaceholder.typicode.com/posts/"+id;
        BlogDTO blogDTO = restTemplate.getForObject(url,BlogDTO.class);
        blogDTO.setServerDateTime(new Date());


        return ResponseEntity.ok(blogDTO);

    }



}
