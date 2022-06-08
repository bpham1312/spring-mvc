package com.demo.spring.service;

import com.demo.spring.entity.Admin;

public interface AdminService extends InterfaceService<Admin>{
	Admin checkLogin(Admin vo);
	Admin selectByName(Admin vo);
}
