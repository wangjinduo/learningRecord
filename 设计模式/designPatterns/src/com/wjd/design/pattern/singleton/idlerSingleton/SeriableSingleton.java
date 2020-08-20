package com.wjd.design.pattern.singleton.idlerSingleton;

        import java.io.Serializable;

/**
 * @ClassName Seriabl
 * @Description 测试反序列化破坏单例
 * @Author JinDuoWang
 * @Email wangjinduoliuxi@163.com
 * @Version 1.0
 **/
public class SeriableSingleton implements Serializable {

    // 序列化
    // 就是说把内存中的状态通过转换成字节码的形式,写入到其他地方(可以是磁盘、网络IO)

    // 反序列化
    // 讲已经持久化的字节码内容，转换为IO流
    // 通过IO流的读取，进而将读取的内容转换为Java对象
    // 在转换的过程中会重新创建对象
    public final static SeriableSingleton seriableSingleton = new SeriableSingleton();

    private SeriableSingleton(){}

    public static SeriableSingleton getInstance(){
        return seriableSingleton;
    }

    private Object readResolve() {
        return seriableSingleton;
    }

}
