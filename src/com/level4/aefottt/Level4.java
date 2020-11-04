package com.level4.aefottt;

import javax.xml.crypto.Data;
import java.lang.reflect.Field;
import java.util.Arrays;

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
        Class<?> c = object.getClass();
        Field[] f = c.getDeclaredFields();
        f[0].setAccessible(true);
        String type = f[0].getType().getName();
//        System.out.println(type);
        switch (type) {
            case "java.lang.String" -> f[0].set(object, data);
            case "int" -> f[0].set(object, Integer.parseInt(data));
            case "double" -> f[0].set(object, Double.parseDouble(data));
            case "float" -> f[0].set(object, Float.parseFloat(data));
        }
        System.out.println(f[0].get(object).toString());
    }
}
