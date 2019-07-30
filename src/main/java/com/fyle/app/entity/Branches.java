package com.fyle.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * CREATE TABLE branches (
    ifsc character varying(11) NOT NULL,
    bank_id bigint,
    branch character varying(74),
    address character varying(195),
    city character varying(50),
    district character varying(50),
    state character varying(26)
);

ALTER TABLE ONLY branches
    ADD CONSTRAINT branches_ifsc_pkey PRIMARY KEY (ifsc);

ALTER TABLE ONLY branches
    ADD CONSTRAINT branches_banks_fkey FOREIGN KEY (bank_id) REFERENCES banks(id);
 *
 */
@Entity
public class Branches {
	@Id
	private String ifsc;
	private long bank_id;
    private String branch;
    private String address;
    private String city;
    private String district;
    private String state;
    
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
	@Override
	public String toString() {
		return "Branches [ifsc=" + ifsc + ", bank_id=" + bank_id + ", branch=" + branch + ", address=" + address
				+ ", city=" + city + ", district=" + district + ", state=" + state + "]";
	}
}
