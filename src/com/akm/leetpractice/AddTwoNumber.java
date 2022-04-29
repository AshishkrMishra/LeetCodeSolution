package com.akm.leetpractice;

import java.util.Objects;

/**
 * 
 * @author Ashish Kr Mishra  
 * @email (er.ashish.kr.mishra@gmail.com)
 * https://leetcode.com/problems/add-two-numbers/
 */


/**
 * Definition for singly-linked list.
 */

 class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

 /**
  * AddTwoNumber - For I/O and O/P please refer below link 
  * https://leetcode.com/problems/add-two-numbers/
  * @author Ashish Kr Mishra  
  * @email (er.ashish.kr.mishra@gmail.com)
  */
public class AddTwoNumber {
	
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode currentFirstNode=l1;
        ListNode currentSecondNode=l2;
        ListNode firstSumNode=null;
        ListNode prevSumNode=null;
        int carry=0;
        while(Objects.nonNull(currentFirstNode) | Objects.nonNull(currentSecondNode))
        {
            int firstVal=Objects.nonNull(currentFirstNode)?currentFirstNode.val:0;
            int secondVal=Objects.nonNull(currentSecondNode)?currentSecondNode.val:0;
            int sum=firstVal+secondVal+carry;
            if (sum > 9)
            {
                sum=sum%10;
                carry=1;
                
            }else
            {
                carry=0;
            }
            ListNode currentSumNode=new ListNode(sum);
            //Storing first node 
            if(Objects.isNull(firstSumNode))
            {
                firstSumNode=currentSumNode;
            }
            if(Objects.nonNull(prevSumNode))
            {
                prevSumNode.next=currentSumNode;
            }
            //Moving to next node if exists 
            if(Objects.nonNull(currentFirstNode))
            {
               currentFirstNode=currentFirstNode.next; 
            }
            //Moving to next node if exists 
            if(Objects.nonNull(currentSecondNode))
            {
              currentSecondNode=currentSecondNode.next ;  
            }
            //Keeping track of previous node 
            prevSumNode=currentSumNode;
            
        }
        //Handling last node is carrying some data 
        if(carry > 0)
        {
           ListNode currentSumNode=new ListNode(carry);
           if(Objects.nonNull(prevSumNode))
           {
               prevSumNode.next=currentSumNode;
           }
            
        }
        return firstSumNode;
        
    }
	

	
}
