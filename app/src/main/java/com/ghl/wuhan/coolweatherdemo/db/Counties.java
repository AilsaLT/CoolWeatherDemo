package com.ghl.wuhan.coolweatherdemo.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.db
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/23 20:09
 * 修改人：Liting
 * 修改时间：2019/8/23 20:09
 * 修改备注：
 * 版本：
 */

public class Counties extends DataSupport {
    private int id;
    private String countyName;
    private String weatherId;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }


    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }


    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
