package com.example.coolweather.db;


import java.util.ArrayList;
import java.util.List;


import org.litepal.crud.DataSupport;


public class Province extends DataSupport       /* LitePal 中每个实体类都要继承DataSupport */
{
    private int id;                     /* 每个实体类都应该有的字段 */
    private String provinceName;        /* 记录省的名字 */
    private int provinceCode;           /* 记录省的代号 */

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getProviceName()
    {
        return provinceName;
    }

    public void setProvinceName(String provinceName)
    {
        this.provinceName = provinceName;
    }

    public int getProvinceCode()
    {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode)
    {
        this.provinceCode = provinceCode;
    }

}
