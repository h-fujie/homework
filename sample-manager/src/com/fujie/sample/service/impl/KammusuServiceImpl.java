package com.fujie.sample.service.impl;

import java.util.List;

import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

import com.fujie.sample.common.entity.Kammusu;
import com.fujie.sample.common.entity.KammusuDefinition;
import com.fujie.sample.service.KammusuService;

@Remote(KammusuService.class)
@Stateless
public class KammusuServiceImpl implements KammusuService {

	@Inject
	private EntityManager em;

	@Override
	public List<KammusuDefinition> getKammusDefinitions() {
		return em.createQuery("select kd from kammusu_definition kd", KammusuDefinition.class).getResultList();
	}

	@Override
	public KammusuDefinition getKammusuDefinition(int id) {
		return em.createQuery("select kd from kammusu_definition kd where id = :id", KammusuDefinition.class)
				.setParameter("id", id).getSingleResult();
	}

	@Override
	public List<Kammusu> getKammuses() {
		return em.createQuery("select k from kammusu k", Kammusu.class).getResultList();
	}

	@Override
	public Kammusu getKammusu(int id) {
		return em.createQuery("select k from kammusu k where id = :id", Kammusu.class).setParameter("id", id)
				.getSingleResult();
	}

}
