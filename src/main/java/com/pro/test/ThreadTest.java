package com.pro.test;

import java.util.Date;

/**
 * @Author: liweicheng
 * @Date: 2021/7/13 14:15
 */
public class ThreadTest {

    /**
     * 测试不建立线程是否能够停止10s
     */
    public static void main(String[] args) throws InterruptedException {
        Date date = new Date();
        System.out.println(date);                                         //Fri Jul 09 10:09:42 CST 2021
        Thread.sleep(10000);
        Thread.currentThread().setName("神的通道");
        //判断当前线程是否存活
        System.out.println(Thread.currentThread().isAlive());             //true
        //获取当前线程的优先级，默认优先级5   最大10  最小1
        //高优先级的线程不意味着先执行完才执行低优先级   只是高概率被执行
        System.out.println(Thread.currentThread().getPriority());         //5
        System.out.println(Thread.currentThread().getThreadGroup());      //java.lang.ThreadGroup[name=main,maxpri=10]
        System.out.println(Thread.currentThread().getStackTrace());       //[Ljava.lang.StackTraceElement;@b97c004
        //线程死亡
//        Thread.currentThread().stop();
        //线程暂停
        //Thread.currentThread().suspend();
        //阻塞状态是临时状态  ，死亡是最终状态
        System.out.println(Thread.currentThread().isAlive());              //true
        System.out.println(Thread.currentThread().getName());;             //神的通道
        date = new Date();
        System.out.println(date);                                          //Fri Jul 09 10:10:57 CST 2021

        /**
         * join() : 在线程a中调用线程b的join()，此时线程a会进入阻塞状态，直到线程b完全执行完毕之后，线程a才结束阻塞状态。
         */

         /**
         * 线程通信
         * 1、wait()         一旦执行此方法，当前线程就进入阻塞状态，并释放同步监视器。
         * -----和sleep在机制上的区别在于
         * sleep不会释放锁
         * wait是释放锁  等待时间过了之后  再次加入抢锁的行列
         * -----和sleep在本质上的区别在于
         * sleep()是Thread类的静态方法
         * wait()是Object超类的成员方法
         * -----和sleep在异常上的区别在于
         * sleep()方法需要抛出异常
         * wait()不需要
         * -----和sleep在使用位置上的区别在于
         * sleep()可以在任何地方使用
         * wait()必须在同步方法和同步代码块中使用
         *---------------------------------
         * 2、notify()       一旦执行此方法，就会唤醒被wait的一个线程。如果有多个线程被wait，就唤醒优先级高的那个。
         * 3、notifyAll()    一旦执行此方法，就会唤醒所有被wait的线程。
         */

        /**
         * Fri Jul 02 15:10:04 CST 2021
         * Fri Jul 02 15:10:14 CST 2021
         * Thread.currentThread().sleep(10000); 和  Thread.sleep(10000);  都可以停止线程10s
         */

        /**
         * currentThread()的主要作用是返回执行当前代码的线程，此为静态方法因测试时是单线程  所以没有区别（表象）
         */

        /**
         * 线程的几种状态
         * 1、新建状态--new ： 新创建的一个线程对象
         * 2、就绪状态（预备备）--Runnable : 当线程被创建后，执行start()方法，该线程被放入到可执行线程池中，变得可执行，只等待获取CPU的使用权，也就是此时该线程除CPU之外的运行所需资源已全部获得。
         * 3、运行状态--Running ： 就绪状态的线程获取了CPU,执行程序代码
         * 4、阻塞状态--Blocking ： 阻塞状态的线程是因为某些原因放弃了CPU的使用权，暂时停止运行。知道进入就绪装填，才有机会转到运行状态。
         * 5、死亡状态--Dead : 线程执行完了或者因异常退出了run()方法，该线程结束生命周期。
         */

        /**
         * 阻塞状态的三种情况
         * 1、等待阻塞 ： 运行的线程执行wait()方法，该线程会释放占用的所有资源，JVM会把该线程放入“等待池”中，进入这个状态的线程不能被自动唤醒，必须依靠其他线程调用motify()和notifyAll()方法才能被唤醒。
         * 2、同步阻塞 ： 运行的线程在获取对象的同步锁时，若该同步锁被别的线程占用，则JVM会把线程放入“锁池”中。
         * 其他阻塞 ： 运行的线程执行sleep()或join()方法，或者发出I/O请求时，JVM会把该线程设置为阻塞状态，当sleep()状态超时，join()等待线程终止或者超时，或者I/O处理完时，线程会重新转入就绪状态。
         */
    }
}
