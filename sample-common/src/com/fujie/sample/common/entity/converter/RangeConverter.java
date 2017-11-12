package com.fujie.sample.common.entity.converter;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import com.fujie.sample.common.enumeration.Range;

@Converter(autoApply = true)
public class RangeConverter implements AttributeConverter<Range, Integer> {

	@Override
	public Integer convertToDatabaseColumn(Range attribute) {
		return attribute.getRange();
	}

	@Override
	public Range convertToEntityAttribute(Integer dbData) {
		return Range.valueOf(dbData);
	}

}
