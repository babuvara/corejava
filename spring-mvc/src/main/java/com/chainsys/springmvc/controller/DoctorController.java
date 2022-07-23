package com.chainsys.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.chainsys.springmvc.dao.DoctorDao;
import com.chainsys.springmvc.dao.DoctorRepository;
import com.chainsys.springmvc.dao.EmployeeDao;
import com.chainsys.springmvc.pojo.Appointment;
import com.chainsys.springmvc.pojo.Doctor;
import com.chainsys.springmvc.pojo.DoctorAppointmentsDTO;
import com.chainsys.springmvc.pojo.Employee;
import com.chainsys.springmvc.service.DoctorService;

@Controller
@RequestMapping("/doctor")
public class DoctorController {
	@Autowired
	private DoctorService drService;

	@GetMapping("/getdoctor")
	public String getAllDoctors(Model model) {
		List<Doctor> doclist = drService.getdoctor();
		model.addAttribute("alldoctor", doclist);
		return "list-doctor";
	}

//	@Bean
//	public void setRepo(DoctorRepository repo) {
//		this.repo = repo;
//	}
//	@DeleteMapping("/deletedoctor")
//	public String deleteDoctor(int id) {
//		repo.deleteById(id);
//		return "redirect:/getalldoctors";
//	}
//
//	@PostMapping(value = "/newdoctor", consumes = "application/json")
//	// we need give from where to read data from the HTTP request and also the
//	// content type ("application/json")
//	public String addDoctor(@RequestBody Doctor dr) {
//		repo.save(dr);
//		return "redirect:/getalldoctors";
//
//	}
//
//	@PostMapping(value = "/modifydoctor", consumes = "application/json")
//	public String modifyDoctor(@RequestBody Doctor dr) {
//		repo.save(dr);
//		return "redirect:/getalldoctors";
//
//	}
//
//	@GetMapping("/getalldoctors")
//	public List<Doctor> getDoctors() {
//		return repo.findAll();
//	}
	@GetMapping("/adddoctor")
	public String showAddForm(Model model) {
		Doctor theDoc = new Doctor();
		model.addAttribute("adddoctor", theDoc);
		return "add-doctor-form";
	}

	@PostMapping("/add")
	public String addNewDoctor(@ModelAttribute("adddoctor") Doctor theDoc) {
		drService.save(theDoc);
		return "redirect:/doctor/getdoctor";
	}

	@GetMapping("/updatedoctor")
	public String showUpdateForm(@RequestParam("doctor_id") int id, Model model) {
		Doctor theDoc = drService.findById(id);
		model.addAttribute("updatedoctor", theDoc);
		return "update-doctor-form";
	}

	@PostMapping("/update")
	public String updateDoctors(@ModelAttribute("updatedoctor") Doctor theDoc) {
		drService.save(theDoc);
		return "redirect:/doctor/getdoctor";
	}

	@GetMapping("/deletedoctor")
	public String deleteDoctor(@RequestParam("doctor_id") int id) {
		drService.deleteById(id);
		return "redirect:/doctor/getdoctor";
	}

	@GetMapping("/finddoctorbyid")
	public String finddoctorById(@RequestParam("doctor_id") int id, Model model) {
		Doctor theDoc = drService.findById(id);
		model.addAttribute("finddoctorbyid", theDoc);
		return "find-doctor-id-form";
	}

	@GetMapping("/getdocapp")
	public String getAppointmnets(@RequestParam("id") int id, Model model) {
		DoctorAppointmentsDTO dto = drService.getdoctorAndAppointments(id);
		model.addAttribute("getdoc", dto.getDoctor());
		model.addAttribute("applist", dto.getAppointment());
		return "list-doctor-appointment";
	}

	// localhost:8080/doctor/trans?id=22
	@GetMapping("/trans")
	public void testTransaction(@RequestParam("id") int id) {
		DoctorAppointmentsDTO dto = new DoctorAppointmentsDTO();
		Doctor dr = new Doctor();
		dr.setDoctor_id(id);
		dr.setDoctor_name("Babu");
		Date drdob = new Date(98, 05, 14);
		dr.setDob(drdob);
		dr.setSpeciality("Ear");
		dr.setCity("salem");
		dr.setPhone_no(757458349l);
		dr.setStandard_fees(2000);
		dto.setDoctor(dr);
		List<Appointment> applist = new ArrayList<Appointment>();
		//int nextAppId=drService.getNextAppoinmentId();
		for (int i = 5; i <= 7; i++) {
			Appointment app = new Appointment();
			app.setApp_id(i);
			Date dt = new Date(22, 07, 25);
			app.setApp_date(dt);
			app.setDoc_id(id);
			app.setPatient_name("Praveena");
			app.setFees_collected(i * 500);
			dto.addAppointment(app);

		}
		drService.addDoctorAndAppointments(dto);
		System.out.println("Sucessfully Completed");
	}
}
