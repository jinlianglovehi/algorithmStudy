package day02;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestExecutors {
    public static void main(String[] args) {

        ExecutorService executor =  Executors.newFixedThreadPool(3);

//        　　总结，从上面的源码以及讲解可以总结execute()和submit()方法的区别：
//
//　　1. 接收的参数不一样;
//
//　　2. submit()有返回值，而execute()没有;
//
//　　　　例如，有个validation的task，希望该task执行完后告诉我它的执行结果，是成功还是失败，然后继续下面的操作。
//
//　　3. submit()可以进行Exception处理;

//        submit 和 execute 方法的区别

        executor.submit(new Runnable() {
            @Override
            public void run() {
                System.out.println("huhu");
            }
        });

        executor.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("feifei");
            }
        });

        executor.shutdown();


    }
}
