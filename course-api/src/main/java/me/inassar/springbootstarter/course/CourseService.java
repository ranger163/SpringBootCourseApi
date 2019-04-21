package me.inassar.springbootstarter.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    // Getting all Courses from DB
    List<CourseModel> getCourses(String topicId) {
        List<CourseModel> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add);
        return courses;
    }

    // Getting a specific Course using it's id
    CourseModel getCourse(String id) {
        return courseRepository.findOne(id);
    }

    // Adding new Course to old records
    void addCourse(CourseModel course) {
        courseRepository.save(course);
    }

    // Updating a Course using it's id
    void updateCourse(CourseModel course) {
        courseRepository.save(course);
    }

    // Delete Course using it's id
    void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
