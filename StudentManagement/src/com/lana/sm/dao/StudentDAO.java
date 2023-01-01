package com.lana.sm.dao;

import com.lana.sm.model.Student;
import java.util.List;

/**
 *
 * @author lana
 */
public interface StudentDAO {

    public List<Student> getList();

    public int createOrUpdate(Student student);

}
