package com.ghl.wuhan.coolweatherdemo.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.db
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/23 20:06
 * 修改人：Liting
 * 修改时间：2019/8/23 20:06
 * 修改备注：
 * 版本：
 */

public class City extends DataSupport {
    private int id;
    private String cityName;
    private int cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
