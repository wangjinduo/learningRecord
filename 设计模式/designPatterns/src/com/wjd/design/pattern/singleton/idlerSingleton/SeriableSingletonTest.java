package com.wjd.design.pattern.singleton.idlerSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * @ClassName Seriabl
 * @Description 测试反序列化破坏单例（客户端调用）
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Version 1.0
 **/
public class SeriableSingletonTest {

    public static void main(String[] args) {
        SeriableSingleton s1 = null;
        SeriableSingleton s2 = SeriableSingleton.getInstance();
        FileOutputStream fos = null;

        try {
            fos = new FileOutputStream("SeriableSingleton.obj");

            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(s2);
            oos.flush();
            oos.close();

            FileInputStream fis = new FileInputStream("SeriableSingleton.obj");
            ObjectInputStream ois = new ObjectInputStream(fis);
            s1 = (SeriableSingleton) ois.readObject();
            ois.close();

            System.out.println(s1 + "\n" + s2);
            System.out.println(s1 == s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
