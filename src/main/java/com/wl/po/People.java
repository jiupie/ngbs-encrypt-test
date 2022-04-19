package com.wl.po;

/**
 * @author 南顾北衫
 */
public class People {
    private String name;
    private Integer sex;
    private String sa;

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "People{" + "name='" + name + '\'' + ", sex=" + sex + '}';
    }
}
