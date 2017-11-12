package com.fujie.sample.common.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import com.fujie.sample.common.enumeration.Range;
import com.fujie.sample.common.enumeration.Speed;

@Entity
@Table(name = "kammusu", uniqueConstraints = @UniqueConstraint(columnNames = "id"))
public class Kammusu implements Serializable {

	@Id
	private Integer id;

	@ManyToOne
	private KammusuDefinition definition;

	private Integer level;

	private Integer currentEndurance;

	private Integer maxEndurance;

	private Integer power;

	private Integer armor;

	private Integer torpedo;

	private Integer avoidance;

	private Integer antiaircraft;

	private Integer mount;

	private Integer antisubmarine;

	private Speed speed;

	private Integer search;

	private Range range;

	private Integer luck;

	@OneToMany(mappedBy = "equip")
	private List<Arm> arms;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public KammusuDefinition getDefinition() {
		return definition;
	}

	public void setDefinition(KammusuDefinition definition) {
		this.definition = definition;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public Integer getCurrentEndurance() {
		return currentEndurance;
	}

	public void setCurrentEndurance(Integer currentEndurance) {
		this.currentEndurance = currentEndurance;
	}

	public Integer getMaxEndurance() {
		return maxEndurance;
	}

	public void setMaxEndurance(Integer maxEndurance) {
		this.maxEndurance = maxEndurance;
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

	public Integer getMount() {
		return mount;
	}

	public void setMount(Integer mount) {
		this.mount = mount;
	}

	public Integer getAntisubmarine() {
		return antisubmarine;
	}

	public void setAntisubmarine(Integer antisubmarine) {
		this.antisubmarine = antisubmarine;
	}

	public Speed getSpeed() {
		return speed;
	}

	public void setSpeed(Speed speed) {
		this.speed = speed;
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

	public Integer getLuck() {
		return luck;
	}

	public void setLuck(Integer luck) {
		this.luck = luck;
	}

	public List<Arm> getArms() {
		return arms;
	}

	public void setArms(List<Arm> arms) {
		this.arms = arms;
	}

}
