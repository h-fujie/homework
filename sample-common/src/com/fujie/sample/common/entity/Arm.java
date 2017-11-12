package com.fujie.sample.common.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "arm", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Arm implements Serializable {

	@ManyToOne
	@Id
	private Integer id;

	@ManyToOne
	private ArmDefinition definition;

	private Integer improvement;

	@ManyToOne
	private Kammusu equip;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ArmDefinition getDefinition() {
		return definition;
	}

	public void setDefinition(ArmDefinition definition) {
		this.definition = definition;
	}

	public Integer getImprovement() {
		return improvement;
	}

	public void setImprovement(Integer improvement) {
		this.improvement = improvement;
	}

	public Kammusu getEquip() {
		return equip;
	}

	public void setEquip(Kammusu equip) {
		this.equip = equip;
	}

}
