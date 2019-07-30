package com.fyle.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.Immutable;

/**
 * CREATE VIEW bank_branches AS
 SELECT branches.ifsc,
    branches.bank_id,
    branches.branch,
    branches.address,
    branches.city,
    branches.district,
    branches.state,
    banks.name AS bank_name
   FROM (branches
     JOIN banks ON ((branches.bank_id = banks.id)));

 *
 */
@Entity
@Immutable
public class Bank_Branches {
	@Id
	private String ifsc;
	private long bank_id;
    private String branch;
    private String address;
    private String city;
    private String district;
    private String state;
    private String bank_name;
    
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public long getBank_id() {
		return bank_id;
	}
	public void setBank_id(long bank_id) {
		this.bank_id = bank_id;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getBank_name() {
		return bank_name;
	}
	public void setBank_name(String bank_name) {
		this.bank_name = bank_name;
	}
	@Override
	public String toString() {
		return "Bank_Branches [ifsc=" + ifsc + ", bank_id=" + bank_id + ", branch=" + branch + ", address=" + address
				+ ", city=" + city + ", district=" + district + ", state=" + state + ", bank_name=" + bank_name + "]";
	}
}
