package com.xinlianshiye.shoestp.user.api.controller;

public interface UserController {
	
	void login(String loginName, String pwd, String thirdName, String thirdId, String jumpUrl);
}
