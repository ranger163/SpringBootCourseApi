package me.inassar.springbootstarter.course;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<CourseModel, String> {

}
