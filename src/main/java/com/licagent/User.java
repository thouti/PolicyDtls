package com.licagent;

import java.io.Serializable;

public class User implements Serializable{
	// private String name;
	  private String empName;
	    public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
		private String name;
	    //private String content;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
	
	/*	public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		} */

}
