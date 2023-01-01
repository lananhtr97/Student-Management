package com.lana.sm.dao;

import com.lana.sm.model.Course;
import java.util.List;

/**
 *
 * @author lana
 */
public interface CourseDAO {

    public List<Course> getList();

    public int createOrUpdate(Course course);
}
