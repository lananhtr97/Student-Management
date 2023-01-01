package com.lana.sm.service;

import com.lana.sm.model.Course;
import java.util.List;

/**
 *
 * @author lana
 */
public interface CourseService {

    public List<Course> getList();

    public int createOrUpdate(Course course);

}
