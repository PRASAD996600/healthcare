package com.project.staragile;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestMedicureService {
	
	@Autowired
	MedicureService doctorService;
	
	@Test
	public void testRegisterDoctor() {
		Doctor doctor = new Doctor("MP00001","Dr.PRASAD","Neurologist","25 Years");
		assertEquals(doctor.getDoctorRegistrationId(), doctorService.registerDummyDoctor().getDoctorRegistrationId());
	}

}
