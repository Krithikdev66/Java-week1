package P1;

public class P4 {
    int front;
    int queue[];
    int rear;
    int capacity;
    int size;
    public P4(int capacity){
        this.capacity=capacity;
        queue=new int [capacity];
        front=0;
        rear=-1;
        size=0;
    }
    void add(int data){
        if(size==capacity)
        {
            System.out.println("Queue is full");
            return ;
        }
        rear=(rear+1)%capacity;
        queue[rear]=data;
        size++;
    }
    int poll(){
        if(size==0){
            System.out.println("Queue is Empty");
            return-1;
        }
        int value=queue[front];
        front=(front+1)%capacity;
        size--;
        return value;
    }

    void display(){
        for (int i=0;i<=capacity-1;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        P4 q=new P4(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.add(50);
        System.out.println("removed"+q.poll());
        q.display();
        q.add(60);
        q.display();
        System.out.println("removed"+q.poll());
        q.add(70);
        q.display();

    }
}
