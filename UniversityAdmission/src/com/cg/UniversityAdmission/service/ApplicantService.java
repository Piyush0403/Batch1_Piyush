package com.cg.UniversityAdmission.service;

import java.util.List;
import java.util.Stack;

import com.cg.UniversityAdmission.model.Applicant;
import com.cg.UniversityAdmission.model.Applicant.Status;

public interface ApplicantService {

	String namePattern = "[A-Za-z]{3,}";
	String mobilePattern = "[7-9][0-9]{9}";
	String emailPattern = "^(.+)@(.+)$";

	int addApplicant(Applicant app);

	int persist(Applicant app);

	Applicant search(int appId);

	void delete(int appId);

	void addStatus(int appId, Status status);

	public List<Applicant> getStudent(Status status);

	Status getStatus(int appId);

	static boolean validateName(String name) {
		return name.matches(namePattern);

	}

	static boolean validateMobile(String mobile) {
		return mobile.matches(mobilePattern);

	}

	static boolean validateEmail(String email) {
		return email.matches(emailPattern);

	}

}
