package com.springrest.courseapplication.service;

import com.springrest.courseapplication.dao.CourseDao;
import com.springrest.courseapplication.model.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService{

    @Autowired
    private CourseDao courseDao;

//    List<Course> list;

    //constructor
    public CourseServiceImpl(){
//        list = new ArrayList<>();
//        list.add(new Course(145, "Java Core Course","this course contains basics of java"));
//        list.add(new Course(234,"Spring boot course", "creating rest api using spring boot"));

    }
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {

//        Course c = null;
//        for(Course course:list){
//            if(course.getId() == courseId){
//                c = course;
//                break;
//            }
//        }

        return courseDao.getReferenceById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
//        list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {

        //for each method is used to traverse
//        list.forEach(e -> {
//            if(e.getId() == course.getId()){
//                e.setTitle(course.getTitle());
//                e.setDescription(course.getDescription());
//            }
//        });

        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
//        this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());

        Course entity = courseDao.getReferenceById(parseLong);
        courseDao.delete(entity);
    }


}
