package com.krasikov.mapper;

import com.krasikov.domain.MobileNumber;
import com.krasikov.dto.MobileNumberDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface MobileNumberMapper {
    MobileNumberMapper INSTANCE = Mappers.getMapper(MobileNumberMapper.class);

    MobileNumberDto mobileNumberToMobileNumberDto(MobileNumber mobileNumber);
}
