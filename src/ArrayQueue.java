import java.util.Scanner;

public class ArrayQueue {
    public static void main(String[] args) {
        queue queue = new queue(3);
        Scanner scanner = new Scanner(System.in);
        char key = ' ';
        boolean loop = true;
        while(loop){
            System.out.println("show");
            System.out.println("exit");
            System.out.println("add");
            System.out.println("get");
            key = scanner.next().charAt(0);
            switch (key){
                case 's':
                    queue.showQueue();
                    break;
                case 'a':
                    System.out.println("print a number");
                    int num = scanner.nextInt();
                    queue.addQueue(num);
                    break;
                case 'g':
                    queue.getQueue();
                    break;
            }
        }



    }
}
class queue {
    private int maxSize;
    private int front;
    private int rear;
    private int arr[];

    public queue(int arrMaxSize) {
        maxSize = arrMaxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
    }
        public boolean isFull(){
            return rear == maxSize - 1;
        }
        public boolean isEmpty(){
            return rear == front;
        }
        public void addQueue(int n){
            if(isFull()){
                System.out.println("队列满了");
                return ;
            }else{
                rear++;
                arr[rear] =  n;
            }
        }
        public int getQueue(){
            if(isEmpty()){
                throw  new RuntimeException("队列为空，不能取");
            }  front++;
          return   arr[front];
        }
        public void showQueue(){
            if(isEmpty()){
                System.out.println("队列为空，不能取");
                return;
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.printf("a[%d] = %d",i,arr[i]);

            }
        }
    }

