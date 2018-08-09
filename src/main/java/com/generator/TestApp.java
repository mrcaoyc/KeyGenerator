package com.generator;

/**
 * @author CaoYongCheng
 */
public class TestApp {
    public static void main(String[] args) {
        KeyGenerator keyGenerator = new IPSectionKeyGenerator();
        for (int i = 0; i < 100; i++) {
            System.out.println(keyGenerator.generateKey());
        }

    }
}
