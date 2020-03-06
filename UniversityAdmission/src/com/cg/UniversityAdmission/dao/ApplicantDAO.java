package com.cg.UniversityAdmission.dao;

import java.util.Collection;

import com.cg.UniversityAdmission.model.Applicant;

public interface ApplicantDAO {
	public void persist(int appid, Applicant app);

	public Applicant search(int appid);

	public void delete(int appid);

	Collection<Applicant> getApplicant();

	void addStatus(int appid, Applicant.Status status);

}
	