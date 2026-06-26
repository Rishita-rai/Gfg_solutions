class twoStacks {
    twoStacks() {
    
    }

int top2 =100;
   int top1=-1;


int[]arr=new int[100];
 



    // Function to push an integer into the stack1.
    void push1(int x) {
        // code here
        top1++;
        arr[top1]=x;
        
        
    }

    // Function to push an integer into the stack2.
    void push2(int x) {
        top2--;
        arr[top2]=x;
        // code here
    }

    // Function to remove an element from top of the stack1.
        
    int pop1() {
        // code here
        if(top1>-1){
        int val=arr[top1];
        top1--;
        return val;
        }else{
            return -1;
        }
    }

        
    // Function to remove an element from top of the stack2.
    int pop2() {
        // code here
        if(top2<100){
        int val=arr[top2];
        top2++;
        return val;
        }
        else{
            return -1;
        }
    }
}