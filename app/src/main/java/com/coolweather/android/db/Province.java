package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

public class Province extends DataSupport {

    //id是每个实体类中应有的字段，provinceName记录省会的名字，provinceCode记录省的代号。LitePal中每一个实体类必须继承DataSupport类
    private int id;
    private String provinceName;
    private int provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

}
