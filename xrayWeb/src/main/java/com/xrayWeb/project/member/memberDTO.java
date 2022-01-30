package com.xrayWeb.project.member;

public class memberDTO {
	private int member_no;
	private String member_name;
	private String member_Id;
	private String member_Pwd;
	private int age;
	private String email;
	
	public memberDTO(int member_no, String member_name, String member_Id, String member_Pwd, int age, String email) {
		super();
		this.member_no = member_no;
		this.member_name = member_name;
		this.member_Id = member_Id;
		this.member_Pwd = member_Pwd;
		this.age = age;
		this.email = email;
	}

	public int getMember_no() {
		return member_no;
	}

	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}

	public String getMember_name() {
		return member_name;
	}

	public void setMember_name(String member_name) {
		this.member_name = member_name;
	}

	public String getMember_Id() {
		return member_Id;
	}

	public void setMember_Id(String member_Id) {
		this.member_Id = member_Id;
	}

	public String getMember_Pwd() {
		return member_Pwd;
	}

	public void setMember_Pwd(String member_Pwd) {
		this.member_Pwd = member_Pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getemail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "memberDTO [member_no=" + member_no + ", member_name=" + member_name + ", member_Id=" + member_Id
				+ ", member_Pwd=" + member_Pwd + ", age=" + age + ", email=" + email + "]";
	}
	
	
	
}
