package com.app.dhcp.dto;

import com.app.dhcp.enums.ErrorMessages;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public record DeviceDto (Long id, String name, String mac_address, String ip_address) {
    public DeviceDto{
        Pattern pattern = Pattern.compile("^[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}$");
        Matcher matcher = pattern.matcher(ip_address);
        if (!matcher.find()) {
            throw new IllegalArgumentException(ErrorMessages.WRONG_IP_FORMAT.getMessage() + ip_address);
        }
    }
}
