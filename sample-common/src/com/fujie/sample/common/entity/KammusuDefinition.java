package com.fujie.sample.common.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fujie.sample.common.enumeration.WarshipClass;

@Entity
@Table(name = "kammusu_definition", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class KammusuDefinition implements Serializable {

	@Id
	private Integer id;

	private String name;

	@Column(name = "warship_class")
	private WarshipClass warshipClass;

	private String type;

	private Integer position;

	private String description;

	private Integer slot;

	@OneToMany(mappedBy = "definition")
	private List<Kammusu> kammuses;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WarshipClass getWarshipClass() {
		return warshipClass;
	}

	public void setWarshipClass(WarshipClass warshipClass) {
		this.warshipClass = warshipClass;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPosition() {
		return position;
	}

	public void setPosition(Integer position) {
		this.position = position;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getSlot() {
		return slot;
	}

	public void setSlot(Integer slot) {
		this.slot = slot;
	}

	public List<Kammusu> getKammuses() {
		return kammuses;
	}

	public void setKammuses(List<Kammusu> kammuses) {
		this.kammuses = kammuses;
	}

}
