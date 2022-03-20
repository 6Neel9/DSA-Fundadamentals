package ass13;

public class leetcode21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        else if(list2==null){
            return list1;
        }
		//for making implementation easy and ensuring "prev" always have some value
       if(list1.val > list2.val){
           return mergeTwoLists(list2,list1);
       }
        ListNode head1=list1;
        ListNode prev=null, tempList2=null;
        while(list1!=null && list2!=null ){
            if(list1.val>list2.val){
			//inserting list2 item before list1 item
               prev.next=list2;
                tempList2=list2.next;
                list2.next=list1; 
				//setting list1 position to recently added item
                list1=list2;
                list2=tempList2;         
            }else{
                prev=list1;
                list1=list1.next;
            }
        }
		//if list 2 has items bigger than or equal to last node of list1
        if(list1 ==null){
            prev.next=list2;
        }
        
        return head1;
        
        
    }
}
