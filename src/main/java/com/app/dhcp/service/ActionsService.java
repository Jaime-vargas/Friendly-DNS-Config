package com.app.dhcp.service;

import com.app.dhcp.dto.DeviceDto;
import com.app.dhcp.model.Device;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActionsService {

    private DeviceService deviceService;

    public ActionsService(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    //Create dhpd.conf file
    public void createConfigFile(){

        String hosts;
        List<DeviceDto> deviceDtoList = deviceService.getDevices();

        deviceDtoList.forEach(device -> {
            String host = """
                host %s {
                    hardware ethernet %s;
                    fixed-address %s;
                }
                """.formatted(
                            device.name(),
                            device.mac_address(),
                            device.ip_address()
                    );
            System.out.println(host);
        });
    }

}
