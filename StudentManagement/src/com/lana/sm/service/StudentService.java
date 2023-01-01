package com.lana.sm.service;

import com.lana.sm.model.Student;
import java.util.List;

/**
 *
 * @author lana
 */
public interface StudentService {

    public List<Student> getList();

    public int createOrUpdate(Student student);

}
