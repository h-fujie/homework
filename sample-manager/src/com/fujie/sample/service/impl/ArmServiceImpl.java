package com.fujie.sample.service.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fujie.sample.common.entity.Arm;
import com.fujie.sample.common.entity.ArmDefinition;
import com.fujie.sample.service.ArmService;

@Remote(ArmService.class)
@Stateless
public class ArmServiceImpl implements ArmService {

	@Inject
	private EntityManager em;

	@Override
	public List<ArmDefinition> getArmDefinitions() {
		return em.createQuery("select ad from arm_definition ad", ArmDefinition.class).getResultList();
	}

	@Override
	public ArmDefinition getArmDefinition(int id) {
		return em.createQuery("select ad from arm_definition ad where id = :id", ArmDefinition.class)
				.setParameter("id", id).getSingleResult();
	}

	@Override
	public List<Arm> getArms() {
		return em.createQuery("select a from arm a", Arm.class).getResultList();
	}

	@Override
	public Arm getArm(int id) {
		return em.createQuery("select a from arm a where id = :id", Arm.class).setParameter("id", id).getSingleResult();
	}

}
