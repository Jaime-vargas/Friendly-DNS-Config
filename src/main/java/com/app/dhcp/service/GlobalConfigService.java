package com.app.dhcp.service;

import com.app.dhcp.dto.GlobalConfigDto;
import com.app.dhcp.enums.ErrorMessages;
import com.app.dhcp.enums.HttpStatusError;
import com.app.dhcp.exeptionsHandler.HandleException;
import com.app.dhcp.mapper.Mapper;
import com.app.dhcp.model.GlobalConfig;
import com.app.dhcp.repository.GlobalConfigRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class GlobalConfigService {

    private GlobalConfigRepository globalConfigRepository;

    public GlobalConfigService(GlobalConfigRepository globalConfigRepository) {
        this.globalConfigRepository = globalConfigRepository;
    }

    // --- CRUD ---
    public GlobalConfigDto getGlobalConfig(Long globalConfigId){
        GlobalConfig globalConfig = globalConfigRepository.findById(globalConfigId).orElseThrow(
                () ->  new HandleException(HttpStatus.BAD_REQUEST, HttpStatusError.BAD_REQUEST, ErrorMessages.CONFIG_NOT_FOUND.toString() + globalConfigId)
        );
        return Mapper.entityToDto(globalConfig);
    }


}
