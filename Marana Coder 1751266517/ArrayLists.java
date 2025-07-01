import java.util.*;
public class Main {
  public static void main(String[] args) {
    ArrayList<String> person = new ArrayList<String>();
     Scanner sc = new Scanner(System.in);
    int op;
    
    while(true)
    {
        System.out.print("1.Add\n2.del\n3.sort\n4.Diplay\n5.exit\n");
        op = sc.nextInt();
        String name;
        if(op==1)
        {
            name = sc.next();
            person.add(name);
        }
        else if(op==2)
        {
            name = sc.next();
            person.remove(name);
        }
         else if(op==3)
        {
            Collections.sort(person);
        }
         else if(op==4)
        {
            System.out.println(person);
        }
         else if(op==5)
        {
           System.out.println("thank you");
           return ;
        }
        
        
        
        System.out.print("\n--------------------\n");
        
        
    }
   
    
  }
  
   
}

https://www.w3schools.com/JAVA/java_list.asp
Array list 
add()	Adds an element to the end of the list
get()	Returns the element at the specified position
set()	Replaces the element at the specified position
remove()	Removes the element at the specified position
size()	Returns the number of elements in the list


Linked list 
addFirst()	Adds an element to the beginning of the list	
addLast()	Add an element to the end of the list	
removeFirst()	Remove an element from the beginning of the list	
removeLast()	Remove an element from the end of the list	
getFirst()	Get the element at the beginning of the list	
getLast()	Get the element at the end of the list	













