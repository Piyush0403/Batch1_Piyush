package com.cg.UniversityAdmission.service;

import java.util.List;
import java.util.stream.Collectors;

import com.cg.UniversityAdmission.dao.ApplicantDAOImpl;
import com.cg.UniversityAdmission.model.Applicant;
import com.cg.UniversityAdmission.model.Applicant.Status;

public class ApplicantServiceImpl implements ApplicantService {
	private ApplicantDAOImpl dao;

	public ApplicantServiceImpl() {
		dao = new ApplicantDAOImpl();

	}

	private final int generateRollNo() {
		return (int) (Math.random() * 3000);

	}

//	@Override
//	public int addApplicant(Applicant app) {
//		// TODO Auto-generated method stub
//		int applicationId = generateRollNo();
//		app.setAppid(applicationId);
//		dao.persist(applicationId, app);
//
//		return applicationId;
//
//	}

	@Override
	public Applicant search(int appId) {
		// TODO Auto-generated method stub
		return dao.search(appId);
	}

	@Override
	public void delete(int appId) {
		// TODO Auto-generated method stub
		dao.delete(appId);

	}

	@Override
	public void addStatus(int appId, Status status) {
		// TODO Auto-generated method stub
		dao.addStatus(appId, status);

	}

	@Override
	public List<Applicant> getStudent(Status status) {
		// TODO Auto-generated method stub
		if (status == null)
			return dao.getApplicant().stream().collect(Collectors.toList());
		else
			return dao.getApplicant().stream().filter(a -> a.getStatus().equals(status)).collect(Collectors.toList());
	}

	@Override
	public Status getStatus(int appId) {
		return dao.search(appId).getStatus();
	}

	@Override
	public int persist(Applicant app) {
		int appid = generateRollNo();
		app.setAppid(appid);
		dao.persist(appid, app);
		return appid;

	}

	@Override
	public int addApplicant(Applicant app) {
		// TODO Auto-generated method stub
		return 0;
	}

}
