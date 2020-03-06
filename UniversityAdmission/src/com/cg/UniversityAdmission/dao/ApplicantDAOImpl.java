package com.cg.UniversityAdmission.dao;

import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

import com.cg.UniversityAdmission.model.Applicant;
import com.cg.UniversityAdmission.model.Applicant.Status;
import com.cg.uniadmiss.store.Store;

public class ApplicantDAOImpl implements ApplicantDAO
{
	
	private HashMap<Integer, Applicant> applicants;
	public ApplicantDAOImpl() 
	{
	
		try {
			this.applicants=(HashMap<Integer, Applicant>) Store.getInstance().getApplicant();
		} catch (ClassNotFoundException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Override
	public Applicant search(int appid) {
		// TODO Auto-generated method stub
		return applicants.get(appid);	
		}

	@Override
	public void delete(int appid) {
		// TODO Auto-generated method stub
		
		 applicants.remove(appid);
	}

	@Override
	public void persist(int appid, Applicant app)
	{
		applicants.put(appid, app);
		
		
	}

	@Override
	public Collection<Applicant> getApplicant() {
		// TODO Auto-generated method stub
		return applicants.values();
	}


	@Override
	public void addStatus(int appid, Status status) {
		// TODO Auto-generated method stub
		applicants.get(status);
		
	}

}
