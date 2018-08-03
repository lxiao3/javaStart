package com.lxiao.compute;

/**
 * @Author: luoxiao
 * @Description:
 * @Date: Created in 下午3:48 2018/8/3
 */
public class Person implements Comparable<Person>{

    private Integer age;

    private Integer height;

    public Person(Integer age, Integer height) {
        this.age = age;
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public int compareTo(Person o) {
        if (this.age < o.age) {
            return -1;
        }

        if (this.age.equals(o.age)) {
            return 0;
        }

        return 1;
    }

}
