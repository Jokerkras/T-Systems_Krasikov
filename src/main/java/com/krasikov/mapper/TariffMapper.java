package com.krasikov.mapper;

import com.krasikov.domain.Client;
import com.krasikov.domain.Tariff;
import com.krasikov.dto.ClientDto;
import com.krasikov.dto.TariffDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface TariffMapper {
    TariffMapper INSTANCE = Mappers.getMapper(TariffMapper.class);

    TariffDto tariffToTariffDto(Tariff tariff);
}
