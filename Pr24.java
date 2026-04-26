class NumberThread extends Thread {
    int start, end;

    NumberThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            System.out.println(i);
        }
    }
}

public class Pr24 {
    public static void main(String[] args) {
        try {
            NumberThread t1 = new NumberThread(1, 100);
            NumberThread t2 = new NumberThread(101, 200);
            NumberThread t3 = new NumberThread(201, 300);

            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

//output:1
//2
//3
//...
//100
//101
//102
//...
//200
//201
//202
//...
//300
