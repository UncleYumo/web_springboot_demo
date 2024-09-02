package com.itheima.pojo;

/**
 * @author uncle_yumo
 * @CreateDate 2024/8/31
 * @School 无锡学院
 * @StudentID 22344131
 * @Description
 */

public class Address {
    private String province;
    private String city;

    public Address(String province, String city) {
        this.province = province;
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
