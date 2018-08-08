package com.generator;

/**
 * @author CaoYongCheng
 */
public class TestApp {
    public static void main(String[] args) {
        KeyGenerator keyGenerator=new IPKeyGenerator();
        System.out.println(keyGenerator.generateKey());
    }
}
