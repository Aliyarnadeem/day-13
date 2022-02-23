import java.util.Stack;
import java.util.*;
public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> a= new Stack<>();
		a.push("banglore");
		a.push("chennai");
		a.push("kerela");
		a.push("hyderabad");
		
		System.out.println(a);
		a.pop();
		a.pop();
		System.out.println(a);
		//peek element
		System.out.println("The element at the top of the" + " stack is: " + a.peek());
		System.out.println(a);
		//searching an element
		System.out.println("element present in posiotion = " +a.search("banglore"));
		
	}

}
