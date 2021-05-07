package Projects;

public class Matcher  
	{ 
	    static class stack  
	    { 
	        int top=-1; 
	        char items[] = new char[100]; 
	  
	        void push(char x)  
	        { 
	            if (top == 99)  
	            { 
	                System.out.println("Stack full"); 
	            }  
	            else 
	            { 
	                items[++top] = x; 
	            } 
	        } 
	  
	        char pop()  
	        { 
	            if (top == -1)  
	            { 
	                System.out.println("Underflow error"); 
	                return '\0'; 
	            }  
	            else 
	            { 
	                char element = items[top]; 
	                top--; 
	                return element; 
	            } 
	        } 
	  
	        boolean isEmpty()  
	        { 
	            return (top == -1) ? true : false; 
	        } 
	    } 
	    
	    
	  static boolean isMatchingPair(char character1, char character2) 
	    { 
	       if (character1 == '(' && character2 == ')') 
	         return true;  
	       else
	         return false; 
	    } 
	    
	  
	  static boolean areParenthesisBalanced(char exp[]) 
	    { 
	       
	       stack st=new stack(); 
	       
	    
	       for(int i=0;i<exp.length;i++) 
	       { 
	            
	        
	          if (exp[i] == '(' ) 
	            st.push(exp[i]); 
	       
	          
	          if (exp[i] == ')' ) 
	          { 
	                   
	              
	             if (st.isEmpty()) 
	               { 
	                   return false; 
	               }  
	       
	             
	             else if ( !isMatchingPair(st.pop(), exp[i]) ) 
	               { 
	                   return false; 
	               } 
	          } 
	            
	       } 
	          
	       
	        
	       if (st.isEmpty()) 
	         return true; 
	       else
	         {   
	             return false; 
	         }  
	    }
	  
	  public static void main(String[] args)  
	    { 
	        char exp[] = "(“(45 + 36) - 5”)".toCharArray();
	          if (areParenthesisBalanced(exp)) 
	        	  System.out.println("True"); 
		    	else
	             System.out.println("False"); 
	        char exp1[] = "(“( ( a )”)".toCharArray();
	        	if (areParenthesisBalanced(exp1)) 
	        		System.out.println("True"); 
		    	else
	             System.out.println("False");
		    char exp2[] = "(“map(ke(a(4)))(b((v)))”)".toCharArray();
		    	if (areParenthesisBalanced(exp2)) 
		    		System.out.println("True"); 
		    	else
	             System.out.println("False");
		    char exp3[] = "(“(a)b)”)".toCharArray();
		    	if (areParenthesisBalanced(exp3)) 
		    		System.out.println("True"); 
		    	else
	             System.out.println("False");
			char exp4[] = "(“))((“)".toCharArray();
		    	if (areParenthesisBalanced(exp4)) 
	             System.out.println("True"); 
		    	else
	             System.out.println("False");
	    } 
	  
	} 
