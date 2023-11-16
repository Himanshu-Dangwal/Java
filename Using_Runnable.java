

class ABC implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class BCD implements Runnable{
    public void run(){
        for(int i=0;i<100;i++){
            System.out.println("Hello");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

//Thread Priority ranges from 1 to 10
// Max priority = 10, Normal = 5, Minimum = 1


public class Using_Runnable {
    public static void main(String[] args) {
        Runnable obj1 = new ABC();
        Runnable obj2 = new BCD();
        // System.out.println(obj1.getPriority());
        obj1.run();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        obj2.run();

    }
}



