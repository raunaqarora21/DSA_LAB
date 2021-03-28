
import java.util.Scanner;

class NODEEEE {

    int rollNo;
    NODEEEE next;
}

public class SinglyLinkedList {

    NODEEEE Start;

    SinglyLinkedList() {
        Start = null;
    }

    void addnode() {
        System.out.println("Enter rollNo");
        Scanner sc = new Scanner(System.in);
        int rn = sc.nextInt();
        NODEEEE newnode = new NODEEEE();
        newnode.rollNo = rn;
        newnode.next = null;
        if (Start == null) {
            Start = newnode;
        } else {
            NODEEEE current = Start;
            while (current.next != null) {
                current = current.next;
            }

            current.next = newnode;

        }
        System.out.println("Data inserted...");
    }

    void searchnode() {
        if (Start == null) {
            System.out.println("List is empty");
        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter rollNo");
            int rn = sc.nextInt();
            NODEEEE current = Start;
            boolean find = false;
            while (current.next != null) {
                if (current.rollNo == rn) {
                    System.out.println("Element exsists\n");
                    find = true;
                    break;

                }
                current = current.next;
            }
            if (find == false) {
                System.out.println("Element doesn't exsist\n");
            }
        }
    }

    void transversenode() {
        if (Start == null) {
            System.out.println("List is empty");
        } else {

            for (NODEEEE current = Start; current != null; current = current.next) {
                System.out.print(current.rollNo + " ");
            }
            System.out.println();
        }
    }

    void deletenode() {
        if (Start == null) {
            System.out.println("List is empty");
        } else {
            NODEEEE current = Start;
            if (current.next == null) {
                Start = null;
            } else {

                /*if(current.next == null){
               Start = null;
           }
                 */
                while (current.next.next != null) {
                    current = current.next;
                }
                current.next = null;
            }

        }

    }

    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        while (true) {
            System.out.println("Press 1 for insert");
            System.out.println("Press 2 for delete");
            System.out.println("Press 3 for transverse");
            System.out.println("Press 4 for search");
            System.out.println("Press 5 for exit");

            System.out.println("\nEnter your choice");
            Scanner sc = new Scanner(System.in);
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.addnode();
                    break;
                case 2:
                    obj.deletenode();
                    break;
                case 3:
                    obj.transversenode();
                    break;
                case 4:
                    obj.searchnode();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Wrong Choice");

            }

        }
    }
}
