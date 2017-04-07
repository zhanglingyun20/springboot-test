package com.sawyer.springboot;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 
 * @ClassName: UserProperties
 * @Description:
 * @author zhanglingyun
 * @date 2017年3月31日
 */
@Configuration
@ConfigurationProperties(prefix = "user")
public class UserProperties {

	private String name;
	private String sex;
	
	private Profile profile;
	private Address address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "UserProperties [name=" + name + ", sex=" + sex + ", profile="
				+ profile + ", address=" + address + "]";
	}
	
	

}