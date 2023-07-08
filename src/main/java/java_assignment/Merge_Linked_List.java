package java_assignment;


class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Merge_Linked_List {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        int interval = 1;
        while (interval < lists.length) {
            for (int i = 0; i < lists.length - interval; i += interval * 2) {
                lists[i] = mergeTwoLists(lists[i], lists[i + interval]);
            }
            interval *= 2;
        }

        return lists[0];
    }

    private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                current.next = l1;
                l1 = l1.next;
            } else {
                current.next = l2;
                l2 = l2.next;
            }
            current = current.next;
        }

        if (l1 != null) {
            current.next = l1;
        } else {
            current.next = l2;
        }

        return dummy.next;
    }

    public static void main(String[] args) {
    	Merge_Linked_List solution = new Merge_Linked_List();

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = { l1, l2, l3 };

        ListNode result = solution.mergeKLists(lists);
        
		/*
		 * ListNode currentNode = result; 
		 * while (currentNode != null) {
		 * System.out.print(currentNode.val); 
		 * if (currentNode.next != null) 
		 * {
		 * System.out.print("->"); } 
		 * currentNode = currentNode.next; }
		 * System.out.println("null");
		 */

        // Print the merged list
        while (result != null) {
            System.out.print(result.val + "->");
            result = result.next;
        }
        System.out.println("null");

        // Output: 1->1->2->3->4->4->5->6->null
    }
}
