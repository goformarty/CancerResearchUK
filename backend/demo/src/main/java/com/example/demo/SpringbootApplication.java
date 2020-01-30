package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApplication {

    private String events = "{\"Events\": [\n" +
            "{\n" +
            "  \"id\": 1,\n" +
            "  \"name\": \"Event 1\",\n" +
            "  \"description\": \"An event to raise CRUK awareness\",\n" +
            "  \"date\": \"2020-01-05T00:00:00.000Z\",\n" +
            "  \"location\": \"Hyde Park\",\n" +
            "  \"photo\": \"https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.pexels.com%2Fphotos%2F556416%2Fpexels-photo-556416.jpeg%3Fcs%3Dsrgb%26dl%3Dbrown-train-railway-near-mountain-556416.jpg%26fm%3Djpg&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fphoto%2Fbrown-train-railway-near-mountain-556416%2F&docid=VU9ZJmOETI0iYM&tbnid=WDcwRZIw-wUARM%3A&vet=10ahUKEwiW2dyuhannAhVs6uAKHSk5BQ4QMwh-KAIwAg..i&w=4920&h=3251&bih=721&biw=1280&q=photo&ved=0ahUKEwiW2dyuhannAhVs6uAKHSk5BQ4QMwh-KAIwAg&iact=mrc&uact=8\"\n" +
            "},\n" +
            "{\n" +
            "  \"id\": 2,\n" +
            "  \"name\": \"Event 2\",\n" +
            "  \"description\": \"A fundraiser to raise money for CRUK\",\n" +
            "  \"date\": \"2020-01-04T00:00:00.000Z\",\n" +
            "  \"location\": \"Greenwich Park\",\n" +
            "  \"photo\": \"https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.pexels.com%2Fphotos%2F556416%2Fpexels-photo-556416.jpeg%3Fcs%3Dsrgb%26dl%3Dbrown-train-railway-near-mountain-556416.jpg%26fm%3Djpg&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fphoto%2Fbrown-train-railway-near-mountain-556416%2F&docid=VU9ZJmOETI0iYM&tbnid=WDcwRZIw-wUARM%3A&vet=10ahUKEwiW2dyuhannAhVs6uAKHSk5BQ4QMwh-KAIwAg..i&w=4920&h=3251&bih=721&biw=1280&q=photo&ved=0ahUKEwiW2dyuhannAhVs6uAKHSk5BQ4QMwh-KAIwAg&iact=mrc&uact=8\"\n" +
            "},\n" +
            "{\n" +
            "  \"id\": 3,\n" +
            "  \"name\": \"Event 3\",\n" +
            "  \"description\": \"An event to raise CRUK awareness in Manchester\",\n" +
            "  \"date\": \"2009-01-05T00:00:00.000Z\",\n" +
            "  \"location\": \"Manchester Park\",\n" +
            "  \"photo\": \"https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.pexels.com%2Fphotos%2F556416%2Fpexels-photo-556416.jpeg%3Fcs%3Dsrgb%26dl%3Dbrown-train-railway-near-mountain-556416.jpg%26fm%3Djpg&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fphoto%2Fbrown-train-railway-near-mountain-556416%2F&docid=VU9ZJmOETI0iYM&tbnid=WDcwRZIw-wUARM%3A&vet=10ahUKEwiW2dyuhannAhVs6uAKHSk5BQ4QMwh-KAIwAg..i&w=4920&h=3251&bih=721&biw=1280&q=photo&ved=0ahUKEwiW2dyuhannAhVs6uAKHSk5BQ4QMwh-KAIwAg&iact=mrc&uact=8\"\n" +
            "},\n" +
            "{\n" +
            "  \"id\": 4,\n" +
            "  \"name\": \"Event 4\",\n" +
            "  \"description\": \"An event to discuss the progress made in the last year\",\n" +
            "  \"date\": \"2019-01-04T00:00:00.000Z\",\n" +
            "  \"location\": \"Wembley Park\",\n" +
            "  \"photo\": \"https://www.google.com/imgres?imgurl=https%3A%2F%2Fimages.pexels.com%2Fphotos%2F556416%2Fpexels-photo-556416.jpeg%3Fcs%3Dsrgb%26dl%3Dbrown-train-railway-near-mountain-556416.jpg%26fm%3Djpg&imgrefurl=https%3A%2F%2Fwww.pexels.com%2Fphoto%2Fbrown-train-railway-near-mountain-556416%2F&docid=VU9ZJmOETI0iYM&tbnid=WDcwRZIw-wUARM%3A&vet=10ahUKEwiW2dyuhannAhVs6uAKHSk5BQ4QMwh-KAIwAg..i&w=4920&h=3251&bih=721&biw=1280&q=photo&ved=0ahUKEwiW2dyuhannAhVs6uAKHSk5BQ4QMwh-KAIwAg&iact=mrc&uact=8\"\n" +
            "}\n" +
            "]}";

    private String users = "" +
            "{\"Users\": [\n" +
            "  {\n" +
            "    \"id\": 1,\n" +
            "    \"firstname\": \"Ben\",\n" +
            "    \"lastname\": \"Johnson\",\n" +
            "    \"emailaddress\": \"ben.johnson@onemail.com\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 2,\n" +
            "    \"firstname\": \"John\",\n" +
            "    \"lastname\": \"Doe\",\n" +
            "    \"emailaddress\": \"john.doe@onemail.com\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 3,\n" +
            "    \"firstname\": \"Gemma\",\n" +
            "    \"lastname\": \"Johnson\",\n" +
            "    \"emailaddress\": \"gemma.johnson@onemail.com\"\n" +
            "  },\n" +
            "  {\n" +
            "    \"id\": 4,\n" +
            "    \"firstname\": \"Amy\",\n" +
            "    \"lastname\": \"Doe\",\n" +
            "    \"emailaddress\": \"amy.doe@onemail.com\"\n" +
            "  }\n" +
            "]\n" +
            "}\n";

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Hello!";
    }

    @GetMapping("/events")
    public String events() {
        return events;
    }

    @GetMapping("/users")
    public String users() {
        return users;
    }

}
