package com.pro.test;

import com.pro.entity.Person;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class ClazzTest {

    @Test
    public void clazz() throws Exception{
        Class<Person> clazz = Person.class;
        Person person = clazz.newInstance();
        System.out.println(person);
    }

    //获取属性结构
    @Test
    public void test1(){
        Class<Person> clazz = Person.class;

        //getFields():获取当前运行时类及其父类中声明为public访问权限的属性
        Field[] fields = clazz.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }

        //getDeclaredFields():获取当前运行时类中声明的所属性。（不包含父类中声明的属性
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    //获取属性结构
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;

        //getMethods():获取当前运行时类及其所父类中声明为public权限的方法
        Method[] methods = clazz.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }

        //getDeclaredMethods():获取当前运行时类中声明的所方法。（不包含父类中声明的方法
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    //获取构造器结构
    @Test
    public void test3(){
        Class<Person> clazz = Person.class;

        //getConstructors():获取当前运行时类中声明为public的构造器
        Constructor<?>[] constructors = clazz.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor);
        }

        //getDeclaredConstructors():获取当前运行时类中声明的所的构造器
        Constructor<?>[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor);
        }
    }

    //获取运行时类的父类
    @Test
    public void test4(){
        Class<Person> clazz = Person.class;

        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);
    }

    //获取运行时类的带泛型的父类
    @Test
    public void test5(){
        Class<Person> clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);
    }

    //获取运行时类的带泛型的父类的泛型
    @Test
    public void test6(){
        Class<Person> clazz = Person.class;

        Type genericSuperclass = clazz.getGenericSuperclass();
        ParameterizedType paraType = (ParameterizedType) genericSuperclass;
        //获取泛型类型
        Type[] actualTypeArguments = paraType.getActualTypeArguments();
        //System.out.println(actualTypeArguments[0].getTypeName());
        System.out.println(((Class)actualTypeArguments[0]).getName());
    }

    //获取运行时类实现的接口
    @Test
    public void test7(){
        Class<Person> clazz = Person.class;

        Class[] interfaces = clazz.getInterfaces();
        for (Class anInterface : interfaces) {
            System.out.println(anInterface);
        }

        //获取运行时类的父类实现的接口
        Class[] interfaces1 = clazz.getSuperclass().getInterfaces();
        for (Class aClass : interfaces1) {
            System.out.println(aClass);
        }
    }

    //获取运行时类所在的包
    @Test
    public void test8(){
        Class<Person> clazz = Person.class;

        Package aPackage = clazz.getPackage();
        System.out.println(aPackage);
    }

    //获取运行时类声明的注解
    @Test
    public void test9(){
        Class<Person> clazz = Person.class;

        Annotation[] annotations = clazz.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }
    }
}
