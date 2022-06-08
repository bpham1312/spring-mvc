package com.demo.spring.dao;

import com.demo.spring.entity.Admin;

public interface AdminDAO extends InterfaceDAO<Admin>{
	Admin checkLog(Admin vo);
	Admin selectByName(Admin vo);
}
