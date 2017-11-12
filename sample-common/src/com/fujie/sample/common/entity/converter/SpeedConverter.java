package com.fujie.sample.common.entity.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.fujie.sample.common.enumeration.Speed;

@Converter(autoApply = true)
public class SpeedConverter implements AttributeConverter<Speed, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Speed attribute) {
		return attribute.getSpeed();
	}

	@Override
	public Speed convertToEntityAttribute(Integer dbData) {
		return Speed.valueOf(dbData);
	}

}
