package com.app.dhcp.mapper;

import com.app.dhcp.dto.DeviceDto;
import com.app.dhcp.dto.GlobalConfigDto;
import com.app.dhcp.model.Device;
import com.app.dhcp.model.GlobalConfig;
import org.springframework.stereotype.Component;

@Component
public class Mapper {

    // --- DEVICE ---
    public static DeviceDto entityToDto(Device device){
        return new DeviceDto(
               device.getId(),
               device.getName(),
               device.getMac_address(),
               device.getIp_address()
       );
    }
    public static Device dtoToEntity(DeviceDto deviceDto){
        Device device = new Device();
        device.setName(deviceDto.name());
        device.setMac_address(deviceDto.mac_address());
        device.setIp_address(deviceDto.ip_address());
        return device;
    }

    // --- GLOBAL CONFIG ---
    public static GlobalConfigDto entityToDto(GlobalConfig globalConfig){
        return new GlobalConfigDto(
                globalConfig.getId(),
                globalConfig.getSubnet(),
                globalConfig.getNetmask(),
                globalConfig.getStart_range(),
                globalConfig.getEnd_Range(),
                globalConfig.getDefault_lease_time(),
                globalConfig.getMax_lease_time(),
                globalConfig.getRouter(),
                globalConfig.getPrimary_dns(),
                globalConfig.getSecondary_dns(),
                globalConfig.getBroadcast()
        );
    }

    public static GlobalConfig dtoToEntity(GlobalConfigDto globalConfigDto){
        GlobalConfig globalConfig = new GlobalConfig();
        globalConfig.setSubnet(globalConfigDto.subnet());
        globalConfig.setNetmask(globalConfigDto.netmask());
        globalConfig.setStart_range(globalConfigDto.start_range());
        globalConfig.setEnd_Range(globalConfigDto.end_range());
        globalConfig.setDefault_lease_time(globalConfigDto.default_lease_time());
        globalConfig.setMax_lease_time(globalConfigDto.max_lease_time());
        globalConfig.setRouter(globalConfigDto.router());
        globalConfig.setPrimary_dns(globalConfigDto.primary_dns());
        globalConfig.setSecondary_dns(globalConfigDto.secondary_dns());
        globalConfig.setBroadcast(globalConfigDto.broadcast());
        return globalConfig;
    }

}
