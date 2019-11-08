package com.krasikov.mapper;

import com.krasikov.domain.Option;
import com.krasikov.dto.OptionDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OptionMapper {
    OptionMapper INSTANCE = Mappers.getMapper(OptionMapper.class);

    OptionDto optionToOptionDto(Option option);
}
