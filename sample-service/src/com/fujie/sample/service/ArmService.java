package com.fujie.sample.service;

import java.util.List;

import com.fujie.sample.common.entity.Arm;
import com.fujie.sample.common.entity.ArmDefinition;

public interface ArmService {

	public List<ArmDefinition> getArmDefinitions();

	public ArmDefinition getArmDefinition(int id);

	public List<Arm> getArms();

	public Arm getArm(int id);

}
