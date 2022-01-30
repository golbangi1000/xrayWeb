package com.xrayWeb.project.Pdata;

public class PdataDTO {
	private int Pdata_no;
	private int member_no;
	private String Image_path;
	
	
	public PdataDTO(int pdata_no, int member_no, String image_path) {
		super();
		Pdata_no = pdata_no;
		this.member_no = member_no;
		Image_path = image_path;
	}


	public int getPdata_no() {
		return Pdata_no;
	}


	public void setPdata_no(int pdata_no) {
		Pdata_no = pdata_no;
	}


	public int getMember_no() {
		return member_no;
	}


	public void setMember_no(int member_no) {
		this.member_no = member_no;
	}


	public String getImage_path() {
		return Image_path;
	}


	public void setImage_path(String image_path) {
		Image_path = image_path;
	}


	@Override
	public String toString() {
		return "PdataDTO [Pdata_no=" + Pdata_no + ", member_no=" + member_no + ", Image_path=" + Image_path + "]";
	}
	
	
	
}
