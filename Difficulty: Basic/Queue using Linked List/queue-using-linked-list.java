// Node class
class Node {
    int data;
    Node next;
   

    Node(int new_data) {
        data = new_data;
        next = null;
        
    }
}

// Queue class
class myQueue {

Node front;
Node rear;
 int curr_size;
    public myQueue() {
        // Initialize your data members
        front =null;
        rear=null;
        curr_size=0;
        
    }

    public boolean isEmpty() {
        // check if the queue is empty
        return front==null;
    }

    public void enqueue(int x) {
        // Adds an element x at the rear of the queue.
         Node n=new Node(x);
        if(front==null){
            front=rear=n;
           
        }
       
        else{rear.next=n;
        rear=n;}
        curr_size++;
    }

    public void dequeue() {
        // Removes the front element of the queue
        Node temp=front;
        front=front.next;
        if(front==null){
            rear=null;
            
        }
        temp=null;
        curr_size--;
        
    }

    public int getFront() {
        // Returns the front element of the queue.
        // If queue is empty, return -1.
        if(isEmpty()){
            return -1;
        }
        return front.data;
    }

    public int size() {
        // Returns the current size of the queue.
        if(front==null){
            return 0;
        }
        return curr_size;
    }
}
