package com.lana.sm.service;

import com.lana.sm.dao.StudentDAOImpl;
import com.lana.sm.model.Student;
import java.util.List;
import com.lana.sm.dao.StudentDAO;

/**
 *
 * @author lana
 */
public class StudentServiceImpl implements StudentService {

    private StudentDAO studentDAO = null;

    public StudentServiceImpl() {
        studentDAO = new StudentDAOImpl();
    }

    @Override
    public List<Student> getList() {
        return studentDAO.getList();
    }

    @Override
    public int createOrUpdate(Student student) {
        return studentDAO.createOrUpdate(student);
    }
}
