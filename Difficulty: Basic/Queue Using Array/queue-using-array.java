class myQueue {

    // Constructor
    int size;
    int capacity;
    int []arr;
    
    public myQueue(int n) {
        // Define Data Structures
         size=0;
        this.capacity=n;
         arr=new int[n];
    }

    public boolean isEmpty() {
        // Check if queue is empty
        return size==0;
    }

    public boolean isFull() {
        // Check if queue is full
        return size==capacity;
    }

    public void enqueue(int x) {
        // Enqueue
        
        arr[size]=x;
        size++;
    }
    

    public void dequeue() {
        // Dequeue
        
        for(int i=1;i<size;i++){
            arr[i-1]=arr[i];
            
        }
        size--;
    }

    public int getFront() {
        // Get front element
        if(size==0){
            return -1;
        }
        return arr[0];
    }

    public int getRear() {
        // Get last element
        if(size==0){
            return -1;
        }
        return arr[size-1];
    }
}
