package com.fujie.sample.service.common;

import java.io.Serializable;

import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Named
public class EntityManagerProducer implements Serializable {

	@PersistenceContext(unitName = "sample")
	@Produces
	private EntityManager em;

}
