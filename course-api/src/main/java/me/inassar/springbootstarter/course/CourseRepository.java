package me.inassar.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CourseRepository extends CrudRepository<CourseModel, String> {

    public List<CourseModel> findAllByTopicId(String topicId);

}
