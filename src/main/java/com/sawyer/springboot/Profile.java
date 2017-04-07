package com.sawyer.springboot;

public class Profile {

	private String mobile;

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Profile [mobile=" + mobile + "]";
	}

}
