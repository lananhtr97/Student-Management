package com.lana.sm.service;

import com.lana.sm.dao.CourseDAO;
import com.lana.sm.dao.CourseDAOImpl;
import com.lana.sm.model.Course;
import java.util.List;

/**
 *
 * @author lana
 */
public class CourseServiceImpl implements CourseService {

    private CourseDAO courseDAO = null;

    public CourseServiceImpl() {
        courseDAO = new CourseDAOImpl();
    }

    @Override
    public List<Course> getList() {
        return courseDAO.getList();
    }

    @Override
    public int createOrUpdate(Course course) {
        return courseDAO.createOrUpdate(course);
    }

}
