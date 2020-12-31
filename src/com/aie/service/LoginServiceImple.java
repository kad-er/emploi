package com.aie.service;

import java.util.List;

import com.aie.dao.LoginDao;
import com.aie.dao.LoginDaoImple;

public class LoginServiceImple implements LoginService {

	@Override
	public List<String> checkUser(String mail, String pass) {
		
		LoginDao ld=new LoginDaoImple();
		List<String> li=ld.login(mail, pass);
		return li;
	}

}
