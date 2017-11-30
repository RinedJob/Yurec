package com.icl.yurec.datamodel;

public class DataPojo {

    private int id;

    private String code;

    private String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String numberKey() {
        return code.concat(type);
    }

}
