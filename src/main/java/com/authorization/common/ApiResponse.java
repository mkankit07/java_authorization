package com.authorization.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@Getter
@NoArgsConstructor
public class ApiResponse {
    @JsonProperty("message")
    private String message;
    @JsonProperty("status")
    private int status;
    @JsonProperty("data")
    private Object  data=new HashMap<>();
    @JsonProperty("metaData")
    private Object metaData=new HashMap<>();


    private ApiResponse(String message,int status, Object data,Object metaData){
        this.message=message;
        this.status=status;
        this.data=data;
        this.metaData=metaData;
    }

    public  ApiResponse setMassage(String message){
        this.message=message;
        return this;
    }
    public ApiResponse setStatus (int status){
        this.status=status;
        return  this;
    }
    public ApiResponse setData(Object data){
        this.data=data;
        return this;
    }
    public ApiResponse setMetaData(Object metaData){
        this.metaData=metaData;
        return this;
    }
    public ApiResponse build(){
        return new ApiResponse(message,status,data,metaData);
    }

}
