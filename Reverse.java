package linkedlist;

import java.util.LinkedList;
/*class ListNode {
	int val;
	ListNode next;
 
	ListNode(int x) {
		val = x;
		next = null;
	}
}
class ll{
	
	ListNode head;
	ll(){
		head=null;
	}
	
	public void append(int x){
		ListNode temp=new ListNode(x);
		ListNode temp1 = head;
		if(head==null){
			head=temp;
		}
		else{
			//System.out.println("if head != null");
			while(temp1.next!=null){
				//System.out.println(temp1.val);
				temp1=temp1.next;	
			}
			temp1.next=temp;
			/*System.out.println(temp1.val);
			System.out.println(temp1.next.val);*/
/*		}
	}
	
	public void delete1(int x){
		ListNode temp=head;
		ListNode prev=temp;
		//System.out.println(temp.val);
		if(head==null){
			System.out.println("nope");
		}
		else{
			if(head.val==x){
				head=head.next;
			}
			else{
		while(temp.val!=x && temp!=null){
			prev=temp;
			temp=temp.next;
		}
		//System.out.println(prev.val);
		prev.next=temp.next;
		}
		}
	}
	
	public void printlist(){
		ListNode temp=head;
		System.out.println("List here: ");
		while(temp!=null){
			System.out.println(temp.val);
			temp=temp.next;
		}
	}
}
*/
public class Reverse {
public static void main(String args[]){
	ll l1 = new ll();
	l1.append(2);
	l1.append(4);
	l1.append(6);
	l1.append(8);
	l1.append(9);
	l1.printlist();
	ListNode l3=l1.head;
	
	ListNode l2=l1.reverse();
	ListNode temp=l2;
	System.out.println("List now: ");
	while(temp!=null){
		System.out.println(temp.val);
		temp=temp.next;
	}
	
}
}
