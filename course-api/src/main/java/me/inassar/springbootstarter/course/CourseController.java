package me.inassar.springbootstarter.course;

import me.inassar.springbootstarter.topic.TopicModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    // Injecting courses service object
    @Autowired
    private CourseService courseService;

    // Getting all courses
    @RequestMapping("/topics/{topicId}/courses")
    public List<CourseModel> getAllCourses(@PathVariable String topicId) {
        return courseService.getCourses(topicId);
    }

    // Getting a specific course using it's id
    @RequestMapping("/topics/{topicId}/courses/{courseId}")
    public CourseModel getCourse(@PathVariable String courseId) {
        return courseService.getCourse(courseId);
    }

    // Adding new course to old records
    @RequestMapping(method = RequestMethod.POST, value = "/topics/{topicsId}/courses")
    public void addCourse(@RequestBody CourseModel course, @PathVariable String topicsId) {
        course.setTopic(new TopicModel(topicsId, "", ""));
        courseService.addCourse(course);
    }

    // Updating a course using it's id
    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{topicId}/courses/{courseId}")
    public void updateCourse(@RequestBody CourseModel course, @PathVariable String topicId, @PathVariable String courseId) {
        course.setTopic(new TopicModel(topicId, "", ""));
        courseService.updateCourse(course);
    }

    // Deleting a course using it's id
    @RequestMapping(method = RequestMethod.DELETE, path = "/topics/{topicId}/courses/{courseId}")
    public void deleteCourse(@PathVariable String courseId) {
        courseService.deleteCourse(courseId);
    }


}
