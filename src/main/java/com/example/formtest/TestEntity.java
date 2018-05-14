package com.example.formtest;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

/**
 * Description:
 *
 * @author tangzhongwei tangzw@zjbdos.com
 * @date 2018/05/14
 */
public class TestEntity implements Serializable {
    private String string;
    private List<String> list;
    private String[] array;

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "TestEntity{" +
                "string='" + string + '\'' +
                ", list=" + list +
                ", array=" + Arrays.toString(array) +
                '}';
    }
}
