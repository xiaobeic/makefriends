package com.friends.model;
/**
 * 
 * @ClassName: Admin 
 * @Description: TODO(管理员实体类) 
 * @author lilei 
 */
public class Admin {

	private Integer id;
	private String adminName;
	private String password;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
