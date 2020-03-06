package com.cg.UniversityAdmission.service;

 enum Role
{
	admin,mac;
	
}
public interface AuthenticateService {

	boolean validateCredential(String uname,String pass, Role role );

}
