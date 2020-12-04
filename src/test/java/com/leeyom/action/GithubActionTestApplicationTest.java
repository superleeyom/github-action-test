package com.leeyom.action;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileReader;

@SpringBootTest
class GithubActionTestApplicationTest {

    @Test
    void contextLoads() {
        System.out.println("hello world!");
        System.out.println("hello github action!");
        System.out.println("开始读取 README.md =======================================");
        try {

            File file = new File("README.md");
            FileReader reader = new FileReader(file);
            char[] bb = new char[1024];
            StringBuilder str = new StringBuilder();
            int n;
            while ((n = reader.read(bb)) != -1) {
                str.append(new String(bb, 0, n));
            }
            reader.close();
            System.out.println("README内容：" + str.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
