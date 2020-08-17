package coding.singleton;

/**
 * 饿汉式，双重校验锁，线程安全
 */
public class Singleton2 {
    private volatile static Singleton2 singleton2 = null;
    private Singleton2(){}
    public static Singleton2 getInstance(){
        if(singleton2 == null){
            synchronized (Singleton2.class){
                if (singleton2 == null){
                    singleton2 = new Singleton2();
                }
            }
        }
        return singleton2;
    }
}
