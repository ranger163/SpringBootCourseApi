package me.inassar.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<TopicModel> topics = new ArrayList<>(Arrays.asList(
            new TopicModel("Spring Boot", "Spring Boot FrameWork", "Spring Framework Description"),
            new TopicModel("Java", "Core Java", "Core Java Description"),
            new TopicModel("Javascript", "Javascript", "Javascript description")
    ));

    List<TopicModel> getTopics() {
        return topics;
    }

    TopicModel getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equalsIgnoreCase(id)).findFirst().get();
    }

    void addTopic(TopicModel topic) {
        topics.add(topic);
    }
}
