package P1;

import java.util.Queue;

public class P3 {
    int front;
    int queue[];
    int rear;
    int capacity;
    public P3(int capacity){
        this.capacity=capacity;
        queue=new int [capacity];
        front=0;
        rear=-1;
    }
    void add(int data){
        if(rear==capacity-1)
        {
            System.out.println("Queue is full");
            return ;
        }
        rear++;
        queue[rear]=data;
    }
    int poll(){
        if(front>rear){
            System.out.println("Queue is Empty");
            return-1;
        }
        int value=queue[front];
        front++;
        return value;
    }
    int peek(){
        if(front>rear){
            System.out.println("Queue is Empty");
        }
        int value=queue[front];
        return value;
    }
    void display(){
        for (int i=front;i<=rear;i++){
            System.out.println(queue[i]+"");
        }
    }

    public static void main(String[] args) {
        P3 q=new P3(5);
        q.add(10);
        q.add(20);
        q.display();
        q.add(30);
        q.add(40);
        q.add(50);
        q.display();
        q.add(60);
        System.out.println("removed"+q.poll());
        System.out.println("peak"+q.peek());

    }

}
