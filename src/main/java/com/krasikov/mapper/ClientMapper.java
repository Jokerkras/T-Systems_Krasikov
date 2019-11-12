package com.krasikov.mapper;

import com.krasikov.domain.Client;
import com.krasikov.dto.ClientDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ClientMapper {
    ClientMapper INSTANCE = Mappers.getMapper(ClientMapper.class);

    @Mapping(target = "mobileNumbers", ignore = true)
    ClientDto clientToClientDto(Client client);
}
