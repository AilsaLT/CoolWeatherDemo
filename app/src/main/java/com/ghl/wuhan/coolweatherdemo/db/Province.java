package com.ghl.wuhan.coolweatherdemo.db;

import org.litepal.crud.DataSupport;

/**
 * 项目名称：com.ghl.wuhan.coolweatherdemo.db
 * 类描述：
 * 创建人：Liting
 * 创建时间：2019/8/23 20:04
 * 修改人：Liting
 * 修改时间：2019/8/23 20:04
 * 修改备注：
 * 版本：
 */

public class Province extends DataSupport {
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
