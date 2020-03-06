package com.cg.UniversityAdmission.service;

public class AuthenticServiceImpl implements AuthenticateService {

	public boolean validateCredential(String uname, String pass, Role role) {

		if (role == Role.admin) {
			if (uname.equals("admin") && pass.equals("123")) {
				return true;
			} else {
				return false;
			}
		} else if (role == Role.mac) {
			if (uname.equals("mac") && pass.equals("root")) {
				return true;
			} else {
				return false;
			}

		}

		return false;

	}

}
