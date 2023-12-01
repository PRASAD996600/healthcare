package com.project.staragile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicureService {
	
	@Autowired
	MedicureRepository doctorRepository;
	
	public Doctor registerDoctor(Doctor doctor) {
		return doctorRepository.save(doctor);
		}

	public Doctor createDoctor() {
		Doctor doctor = new Doctor("MP00001","Dr.PRASAD","Neurologist","25 Years");
		return doctorRepository.save(doctor);
	}

	public Doctor getDoctorDetails(String doctorRegistrationId) {
		// TODO Auto-generated method stub
		return doctorRepository.findById(doctorRegistrationId).get();
	}
	
	public Doctor registerDummyDoctor() {
		Doctor doctor = new Doctor("MP00001","Dr.PRASAD","Neurologist","25 Years");
		return doctor;
	}
	
	public String sayHello() {
		return "Hello iam Prasad how may i help you";
	}

}
