package com.lxiao.compute;

/**
 * @Author: luoxiao
 * @Description:
 * @Date: Created in 下午3:36 2018/8/3
 */
public class MainSort {
    public static void main(String[] args) {
        // comparable 的使用（这里所谓的自己是指同一个类生成的不同对象）
        // 1. 自己和自己比较
        Person xiao = new Person(15, 172);
        Person yu = new Person(13, 167);
        System.out.println(xiao.compareTo(yu));

        // 2. 自己和别人比较
        // Person 实现的Comparable接口泛型 设置为其他类即可
        

    }
}



