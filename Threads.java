

//Extending Threads Class
//By default we need Thread should have definition of a function run which is implicitly called by the start function 

//These 2 classes A and B are not ordinary classes now, they are now threads


class A extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{
    public void run(){
        for(int i=0;i<10;i++){
            System.out.println("Hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

    }
}



