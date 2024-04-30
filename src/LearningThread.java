public class LearningThread {
    public static void main(String[] args) {
        A a=new A();
        a.setPriority(1);
        a.start();
        B b=new B();
        b.setPriority(10);
        b.start();
    }
}

class A extends Thread{

   public void run(){
        for(int i=0;i<100;i++) {
            System.out.println("Hi from class A");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<100;i++) {
            System.out.println("Hi from class B");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
