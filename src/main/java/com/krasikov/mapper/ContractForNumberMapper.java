package com.krasikov.mapper;

import com.krasikov.domain.ContractForNumber;
import com.krasikov.dto.ContractForNumberDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContractForNumberMapper {
    ContractForNumberMapper INSTANCE = Mappers.getMapper(ContractForNumberMapper.class);

    ContractForNumberDto contractForNumberToContractForNumberDto(ContractForNumber contractForNumber);
}
