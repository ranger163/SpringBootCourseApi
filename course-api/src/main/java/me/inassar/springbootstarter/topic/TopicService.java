package me.inassar.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<TopicModel> topics = Arrays.asList(
            new TopicModel("Spring Boot", "Spring Boot FrameWork", "Spring Framework Description"),
            new TopicModel("Java", "Core Java", "Core Java Description"),
            new TopicModel("Javascript", "Javascript", "Javascript description")
    );

    public List<TopicModel> getTopics() {
        return topics;
    }
}
