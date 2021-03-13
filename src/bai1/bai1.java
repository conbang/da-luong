package bai1;

class bai1 {
    synchronized void printTable(int n){
        for (int i = 0; i < 5; i++) {
            System.out.println(n*i);
            try{
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

}
class MyThread1 extends Thread{
    bai1 test;
    MyThread1(bai1 obj){
        this.test = obj;
    }
    public void run(){
        test.printTable(5);
    }
}
class MyThread2 extends Thread{
    bai1 test1;
    MyThread2(bai1 obj){
        this.test1 = obj;
    }
    public void run(){
        test1.printTable(100);
    }
}

