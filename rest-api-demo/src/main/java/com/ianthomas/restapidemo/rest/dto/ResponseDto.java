package com.ianthomas.restapidemo.rest.dto;

import java.io.Serializable;

public class ResponseDto implements Serializable {

    private static final long serialVersionUID = 6936074936467382843L;
    private String status;
    private String message;
    private Object object;

    public ResponseDto(String status, String message) {
        this.status = status;
        this.message = message;
    }

    public ResponseDto(String status, String message, Object object) {
        this.status = status;
        this.message = message;
        this.object = object;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }
}
