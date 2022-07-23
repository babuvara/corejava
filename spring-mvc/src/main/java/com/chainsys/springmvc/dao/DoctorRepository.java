package com.chainsys.springmvc.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.chainsys.springmvc.pojo.Doctor;

@Repository
public interface DoctorRepository extends CrudRepository<Doctor, Long> {
	Doctor findById(long id);

	Doctor save(Doctor thedoc);

	// use for adding a new Doctor
	void deleteById(long dr_id);

	List<Doctor> findAll();
}
