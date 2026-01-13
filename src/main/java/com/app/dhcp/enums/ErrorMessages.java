package com.app.dhcp.enums;

import lombok.Getter;

@Getter
public enum ErrorMessages {

    WRONG_USER_OR_PASSWORD,
    WRONG_JSON_FORMAT,
    INVALID_TOKEN,
    ERROR_GENERATING_RESPONSE,

    // Device validations
    WRONG_IP_FORMAT("Formato de IP incorrecto"),
    DEVICE_NOT_FOUND("El dispositivo no fue encontrado con el id: "),

    // Config validations
    CONFIG_NOT_FOUND("Configuración no encontrada id: ");

    String message;
    ErrorMessages(String message) {
        this.message = message;
    }

    /** PENDIENTE VALIDAR CON MENSAJE TODOS LOS ERRORES */
    ErrorMessages(){
    }

}



