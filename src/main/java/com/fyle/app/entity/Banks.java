package com.fyle.app.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * CREATE TABLE banks (
    name character varying(49),
    id bigint NOT NULL
);
ALTER TABLE ONLY banks
    ADD CONSTRAINT banks_id_pkey PRIMARY KEY (id);
 *
 */
@Entity
public class Banks {
	@Id
	private Long id;
    private String name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Banks [id=" + id + ", name=" + name + "]";
	}
}
