package me.inassar.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<TopicModel> getAllTopics() {
		return Arrays.asList(
				new TopicModel("Spring Boot", "Spring Boot FrameWork", "Spring Framework Description"),
				new TopicModel("Java", "Core Java", "Core Java Description"),
				new TopicModel("Javascript", "Javascript", "Javascript description")
				);
	}

}
