package com.Raj;

public class customer {
	private Integer cid;
	private String cname;
	private String  cemail;
	public customer() {
		System.out.println("default constructor");
	}
	public customer(Integer cid,String cname,String cemail) {
		this.cid=cid;
		this.cname=cname;
		this.cemail=cemail;
		
	}
	@Override
	public String toString() {
		return "customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}
	public Integer getCid() {
		return cid;
	}
	public void setCid(Integer cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

}
