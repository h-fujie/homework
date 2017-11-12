package com.fujie.sample.common.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fujie.sample.common.enumeration.Range;

@Entity
@Table(name = "arm_definition", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class ArmDefinition implements Serializable {

	@Id
	private Integer id;

	private String type;

	private Integer power;

	private Integer armor;

	private Integer torpedo;

	private Integer avoidance;

	private Integer antiaircraft;

	private Integer antisubmarine;

	private Integer search;

	private Range range;

	private Boolean equipDestroyer;

	private Boolean equipLightCruiser;

	private Boolean equipHeavyCruiser;

	private Boolean equipBattleship;

	private Boolean equipLightAircraftCarrier;

	private Boolean equipAircraftCarrier;

	private Boolean equipSeaplaneCarrier;

	private Boolean equipAvitationBattleship;

	private Boolean equipSubmarine;

	@OneToMany(mappedBy = "definition")
	private List<Arm> arms;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getPower() {
		return power;
	}

	public void setPower(Integer power) {
		this.power = power;
	}

	public Integer getArmor() {
		return armor;
	}

	public void setArmor(Integer armor) {
		this.armor = armor;
	}

	public Integer getTorpedo() {
		return torpedo;
	}

	public void setTorpedo(Integer torpedo) {
		this.torpedo = torpedo;
	}

	public Integer getAvoidance() {
		return avoidance;
	}

	public void setAvoidance(Integer avoidance) {
		this.avoidance = avoidance;
	}

	public Integer getAntiaircraft() {
		return antiaircraft;
	}

	public void setAntiaircraft(Integer antiaircraft) {
		this.antiaircraft = antiaircraft;
	}

	public Integer getAntisubmarine() {
		return antisubmarine;
	}

	public void setAntisubmarine(Integer antisubmarine) {
		this.antisubmarine = antisubmarine;
	}

	public Integer getSearch() {
		return search;
	}

	public void setSearch(Integer search) {
		this.search = search;
	}

	public Range getRange() {
		return range;
	}

	public void setRange(Range range) {
		this.range = range;
	}

	public Boolean getEquipDestroyer() {
		return equipDestroyer;
	}

	public void setEquipDestroyer(Boolean equipDestroyer) {
		this.equipDestroyer = equipDestroyer;
	}

	public Boolean getEquipLightCruiser() {
		return equipLightCruiser;
	}

	public void setEquipLightCruiser(Boolean equipLightCruiser) {
		this.equipLightCruiser = equipLightCruiser;
	}

	public Boolean getEquipHeavyCruiser() {
		return equipHeavyCruiser;
	}

	public void setEquipHeavyCruiser(Boolean equipHeavyCruiser) {
		this.equipHeavyCruiser = equipHeavyCruiser;
	}

	public Boolean getEquipBattleship() {
		return equipBattleship;
	}

	public void setEquipBattleship(Boolean equipBattleship) {
		this.equipBattleship = equipBattleship;
	}

	public Boolean getEquipLightAircraftCarrier() {
		return equipLightAircraftCarrier;
	}

	public void setEquipLightAircraftCarrier(Boolean equipLightAircraftCarrier) {
		this.equipLightAircraftCarrier = equipLightAircraftCarrier;
	}

	public Boolean getEquipAircraftCarrier() {
		return equipAircraftCarrier;
	}

	public void setEquipAircraftCarrier(Boolean equipAircraftCarrier) {
		this.equipAircraftCarrier = equipAircraftCarrier;
	}

	public Boolean getEquipSeaplaneCarrier() {
		return equipSeaplaneCarrier;
	}

	public void setEquipSeaplaneCarrier(Boolean equipSeaplaneCarrier) {
		this.equipSeaplaneCarrier = equipSeaplaneCarrier;
	}

	public Boolean getEquipAvitationBattleship() {
		return equipAvitationBattleship;
	}

	public void setEquipAvitationBattleship(Boolean equipAvitationBattleship) {
		this.equipAvitationBattleship = equipAvitationBattleship;
	}

	public Boolean getEquipSubmarine() {
		return equipSubmarine;
	}

	public void setEquipSubmarine(Boolean equipSubmarine) {
		this.equipSubmarine = equipSubmarine;
	}

	public List<Arm> getArms() {
		return arms;
	}

	public void setArms(List<Arm> arms) {
		this.arms = arms;
	}

}
