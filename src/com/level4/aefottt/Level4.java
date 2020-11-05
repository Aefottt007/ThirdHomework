package com.level4.aefottt;

import java.lang.reflect.Field;

public class Level4 {
    public static void main(String[] args) {
        try{
            new Level4().setValue(new Object(){
                public String data;
//                public int data;
//                public double data;
//                public float data;
            });
        }catch (IllegalAccessException e){
            e.printStackTrace();
        }
    }
    public void setValue(Object object) throws IllegalAccessException {
        String data = "123";
        //获取类名
        Class<?> c = object.getClass();
        //获取类中的属性
        Field[] f = c.getDeclaredFields();
        //设置属性为可访问
        f[0].setAccessible(true);
        //获取属性的类型
        String type = f[0].getType().getName();
//        System.out.println(type);
        //根据属性不同的类型强制转换data变量的类型，并赋值给属性
        switch (type) {
            case "java.lang.String" -> f[0].set(object, data);
            case "int" -> f[0].set(object, Integer.parseInt(data));
            case "double" -> f[0].set(object, Double.parseDouble(data));
            case "float" -> f[0].set(object, Float.parseFloat(data));
        }
        //输出赋值后的属性变量
        System.out.println(f[0].get(object).toString());
    }
}
