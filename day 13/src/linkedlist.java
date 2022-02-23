import java.util.*;
import java.util.LinkedList;
public class linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> a= new LinkedList<>();
		//adding the element
		a.add("A");
        a.add("B");
        //adding the element at last
        a.addLast("C");
        //adding the element at first
        a.addFirst("D");
        //adding the element at the particular position
        a.add(2, "E");
 
        System.out.println(a);
        //removing particular element
        a.remove("B");
        //removing by position
        a.remove(3);
        //removing first element
        a.removeFirst();
        //removing last element 
        a.removeLast();
 
        System.out.println(a);
	}

}
