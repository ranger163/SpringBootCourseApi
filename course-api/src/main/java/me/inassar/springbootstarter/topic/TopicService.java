package me.inassar.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TopicService {

    @Autowired
    private TopicRepository topicRepository;

    // Getting all topics from DB
    List<TopicModel> getTopics() {
        List<TopicModel> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    // Getting a specific topic using it's id
    TopicModel getTopic(String id) {
        return topicRepository.findOne(id);
    }

    // Adding new topic to old records
    void addTopic(TopicModel topic) {
        topicRepository.save(topic);
    }

    // Updating a topic using it's id
    void updateTopic(String id, TopicModel topic) {
        topicRepository.save(topic);
    }

    // Delete topic using it's id
    void deleteTopic(String id) {
        topicRepository.delete(id);
    }
}
