package com.product.myproductsmgmtwebapp.service.impl;

import java.util.List;

import com.product.myproductsmgmtwebapp.model.Student;
import com.product.myproductsmgmtwebapp.repository.StudentRepository;
import com.product.myproductsmgmtwebapp.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service("studentService")
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	@Override
	public List<Student> findAll() {
		return studentRepository.findAll();
	}

	@Override
	public Student save(Student student) {
		return studentRepository.save(student);
	}

	@Override
	public Student findOne(Long id) {
		return studentRepository.findById(id).get();
//				.findOne(id);
	}

	@Override
	public void delete(Long id) {

		studentRepository.deleteById(id);
	}

}
