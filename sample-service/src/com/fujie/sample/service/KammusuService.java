package com.fujie.sample.service;

import java.util.List;

import com.fujie.sample.common.entity.Kammusu;
import com.fujie.sample.common.entity.KammusuDefinition;

public interface KammusuService {

	public List<KammusuDefinition> getKammusDefinitions();

	public KammusuDefinition getKammusuDefinition(int id);

	public List<Kammusu> getKammuses();

	public Kammusu getKammusu(int id);

}
