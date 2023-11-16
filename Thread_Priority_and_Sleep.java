

//Using Thread Priority and sleep
class ABCD extends Thread{
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

class BCDE extends Thread{
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

public class Thread_Priority_and_Sleep {
    public static void main(String[] args) {
        ABCD obj1 = new ABCD();
        BCDE obj2 = new BCDE();
        // System.out.println(obj1.getPriority());
        obj1.start();

        try {
            Thread.sleep(2);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        obj2.start();

    }

    private void start() {
        // TODO
    }
}



