package Quiz;

public class stackArray{ 
	
    static final int MAX = 4; 
    int top; 
    int array[] = new int[MAX]; // Maximum size of Stack 
  
   public boolean isEmpty() 
    { 
        return (top < 0); 
    } 
    
   stackArray() 
    { 
        top = -1; 
    } 
  
    public void pushStack(int x) 
    { 
        if (top >= (MAX - 1)) { 
            System.out.println("Stack Overflow"); 
        } 
        else { 
            array[++top] = x; 
        } 
    } 
  
   public int popStack() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow");  
        } 
        else { 
        	return array[--top];
        	 
        	
        } 
    } 
  
    public void readStack() 
    { 
        if (top < 0) { 
            System.out.println("Stack Underflow");  
        } 
        else { 
        	System.out.println(array[top]);  
        } 
    } 

    public void printStack(){
    	{
    		for(int i = top; i>=0; i--)
    			System.out.print(array[i] + " " );
    		System.out.print("\n");
    	}
    }
    
    public boolean searchStack(int key) { //Not Working
    	
    	for (int element : array) {
    		if (element == key) {
    			return true;
    		}
    		
    	}
    	return false;	
    }
  
// Driver code 
    public static void main(String args[]) 
    { 
        stackArray sArray = new stackArray(); 
        sArray.pushStack(10); 
        sArray.pushStack(20); 
        sArray.pushStack(30); 
        System.out.println("The elements of the stack are: ");
        sArray.printStack();
        if(sArray.searchStack(30))
        	System.out.println("Yes");
        else
            System.out.println("No");
        sArray.popStack(); 
        sArray.printStack();
        if(sArray.searchStack(30))
        	System.out.println("Yes");
        else
            System.out.println("No");
        
    } 
} 

