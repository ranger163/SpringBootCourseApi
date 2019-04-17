package me.inassar.springbootstarter.topic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    // Injecting topics service object
    @Autowired
    private TopicService topicService;

    // Getting all topics
    @RequestMapping("/topics")
    public List<TopicModel> getAllTopics() {
        return topicService.getTopics();
    }

    // Getting a specific topic using it's id
    @RequestMapping("/topics/{id}")
    public TopicModel getTopic(@PathVariable String id) {
        return topicService.getTopic(id);
    }

    // Adding new topic to old records
    @RequestMapping(method = RequestMethod.POST, value = "/topics")
    public void addTopic(@RequestBody TopicModel topic) {
        topicService.addTopic(topic);
    }

    // Updating a topic using it's id
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody TopicModel topic, @PathVariable String id) {
        topicService.updateTopic(id, topic);
    }

    // Deleting a topic using it's id
    @RequestMapping(method = RequestMethod.DELETE, path = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        topicService.deleteTopic(id);
    }


}
