package me.inassar.springbootstarter.topic;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    // Mocking records
    private List<TopicModel> topics = new ArrayList<>(Arrays.asList(
            new TopicModel("Spring Boot", "Spring Boot FrameWork", "Spring Framework Description"),
            new TopicModel("Java", "Core Java", "Core Java Description"),
            new TopicModel("Javascript", "Javascript", "Javascript description")
    ));

    // Getting all topics from DB
    List<TopicModel> getTopics() {
        return topics;
    }

    // Getting a specific topic using it's id
    TopicModel getTopic(String id) {
        return topics.stream().filter(topic -> topic.getId().equalsIgnoreCase(id)).findFirst().get();
    }

    // Adding new topic to old records
    void addTopic(TopicModel topic) {
        topics.add(topic);
    }

    // Updating a topic using it's id
    void updateTopic(String id, TopicModel topic) {
        for (int i = 0; i < topics.size(); i++) {
            TopicModel topicModel = topics.get(i);
            if (topicModel.getId().equalsIgnoreCase(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }

    // Delete topic using it's id
    void deleteTopic(String id) {
        topics.removeIf(topic -> topic.getId().equalsIgnoreCase(id));
    }
}
