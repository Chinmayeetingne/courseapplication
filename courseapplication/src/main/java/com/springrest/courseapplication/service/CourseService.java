package com.springrest.courseapplication.service;

import com.springrest.courseapplication.model.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {

    public List<Course> getCourses();

    public Course getCourse(long courseId);

     public Course addCourse(Course course);

   public Course updateCourse(Course course);

   public void deleteCourse(long courseId);
}
