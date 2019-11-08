package com.krasikov.mapper;

import com.krasikov.domain.Worker;
import com.krasikov.dto.WorkerDto;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WorkerMapper {
    WorkerMapper INSTANCE = Mappers.getMapper(WorkerMapper.class);

    WorkerDto workerToWorkerDto(Worker worker);
}
