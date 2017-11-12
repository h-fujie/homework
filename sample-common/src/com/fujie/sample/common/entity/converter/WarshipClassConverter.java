package com.fujie.sample.common.entity.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.fujie.sample.common.enumeration.WarshipClass;

@Converter(autoApply = true)
public class WarshipClassConverter implements AttributeConverter<WarshipClass, Integer> {

	@Override
	public Integer convertToDatabaseColumn(WarshipClass attribute) {
		return attribute.getWarshipClass();
	}

	@Override
	public WarshipClass convertToEntityAttribute(Integer dbData) {
		return WarshipClass.valueOf(dbData);
	}

}
