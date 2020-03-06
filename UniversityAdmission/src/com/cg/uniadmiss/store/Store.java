package com.cg.uniadmiss.store;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

import com.cg.UniversityAdmission.model.Applicant;
import com.cg.UniversityAdmission.model.Courses;

public class Store
{
	private Map<Integer, Applicant> applicants;
	private Map<Integer, Courses> courses;
	
	private static Store store;
	
	public static final String STORE_PATH="admission.dat";
	
	private Store()
	{
		this.applicants=new HashMap<Integer, Applicant>();
		this.courses= new HashMap<Integer, Courses>();
		
	}
	public static synchronized Store getInstance() throws IOException, ClassNotFoundException
	{
		if(null==store)
		{
			File file= new File(STORE_PATH);
			if(file.exists())
			{
				ObjectInputStream is= new ObjectInputStream(new FileInputStream(STORE_PATH));
				//store=(Store)is.readObject();
				Object ob= is.readObject();
				if(ob instanceof Store)
				{
					store=(Store) ob;
				}
				is.close();
			}
			else {
				store= new Store();
			}
		
		}
		return store;
		
	}
	public synchronized void save() throws IOException
	{
		//FileOutputStream fos= new FileOutputStream(STORE_PATH);
		ObjectOutputStream os= new ObjectOutputStream(new FileOutputStream(STORE_PATH));
		os.writeObject(store);
		os.flush();
		os.close();
		
		//write store object into a object output stream points the file name given
	}
	public Map<Integer, Applicant> getApplicant() {
		return applicants;
	}
	public void setApplicant(Map<Integer, Applicant> applicant) {
		this.applicants = applicant;
	}
	public Map<Integer, Courses> getCourses() {
		return courses;
	}
	public void setCourses(Map<Integer, Courses> courses) {
		this.courses = courses;
	}
	
	
	
	

}
