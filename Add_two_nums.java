package linkedlist;
class ListNode {
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
		}
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
	//inplace
	public ListNode reverse(){
		ListNode cur=head;
		ListNode next=null;
		ListNode prev=null;
		while(cur!=null){
			next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
	}
	//my idea of reverse function space O(n) // needs modification
	public ListNode rev(){
		ListNode temp=head;
		ListNode temp2=null;
		ListNode temp3=null;
		while(temp!=null){
			if(temp2==null){
				temp2=new ListNode(temp.val);
			}
			else{
				temp3=new ListNode(temp.val);
				temp3.next=temp2;
				temp2=temp3;
			}
			temp=temp.next;
		}
		return temp2;
	}
}
public class Add_two_nums {

public static void main(String args[]){
	ll l1 = new ll();
	l1.append(2);
	l1.append(4);
	l1.append(6);
	l1.append(8);
	l1.printlist();
	ll l2 = new ll();
	l2.append(5);
	l2.append(6);
	l2.append(4);
	l2.printlist();
	ll l3 = new ll();
	ll temp=l1;
	int carry=0;
	ListNode l1node=l1.head;
	ListNode l2node=l2.head;
	while(l1node!=null){
		if(l2node!=null){
		int res=l1node.val+l2node.val+carry;
		
		if(res/10!=0){
			carry=res/10;
			res=res%10;
		}
		else{
			carry=0;
		}
		l3.append(res);
		l1node=l1node.next;
		l2node=l2node.next;
		
		}
		else{
			break;
		}
	}
	//last number
	
	if(l2node!=null){
		if(carry!=0){
			while(l2node!=null){
				int res=l2node.val+carry;
				l3.append(res);
				carry=0;
				l2node=l2node.next;
			}
		}
		else{
			while(l2node!=null){
				int res=l2node.val;
				l3.append(res);
				l2node=l2node.next;
			}
		}
	}
	if(l1node!=null){
		if(carry!=0){
			while(l1node!=null){
				int res=l1node.val+carry;
				l3.append(res);
				carry=0;
				l1node=l1node.next;
			}
		}
		else{
			while(l1node!=null){
				int res=l1node.val;
				l3.append(res);
				l1node=l1node.next;
			}
		}
	}
	l3.printlist();
}
}
