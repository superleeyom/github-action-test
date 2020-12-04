package com.leeyom.action;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.FileWriter;

@SpringBootTest
class GithubActionTestApplicationTest {

    @Test
    void contextLoads() {
        System.out.println("hello world!");
        System.out.println("hello github action!");
        System.out.println("开始写入 README.md =======================================");
        try {
            String writerContent = "## hello world,你好世界";
            File file = new File("README.md");
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter writer = new FileWriter(file);
            writer.write(writerContent);
            writer.flush();
            System.out.println("写入完毕 =======================================");
        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
