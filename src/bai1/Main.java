package bai1;

public class Main {
    public static void main(String[] args) {
        bai1 test = new bai1();
        MyThread1 t1= new MyThread1(test);
        MyThread2 t2 = new MyThread2(test);
        t1.start();
        t2.start();
    }
}
