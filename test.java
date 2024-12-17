import java.util.Scanner;

public class test {


        public static void main(String[] args) {
            SinglyLinkedList<String>l= new SinglyLinkedList<>();
            SinglyLinkedList<String>x= new SinglyLinkedList<>();
            Scanner in= new Scanner(System.in);
            int choice;
            while(true)
            {
                System.out.println("1 add first 2 add last 3 remove first 4 size 5 is the list empty -1 exit");
                System.out.println("input your choice");
                choice=in.nextInt();
                switch (choice){
                    case 1:
                        System.out.println("input an element for 2 ");
                        l.addFirst(in.next());
                        x.addFirst(in.next());
                        System.out.println(l.first()+" was added successfully");
                        System.out.println(x.first()+" was added successfully");
                        break;
                    case 2:
                        System.out.println("input an element");
                        l.addLast(in.next());
                        System.out.println(l.last()+" was added successfully");
                        System.out.println(x.last()+" was added successfully");
                        break;
                    case 3:

                        System.out.println(l.removeFirst()+" was removed successfully");
                        System.out.println(x.removeFirst()+" was removed successfully");
                        break;
                    case 4:

                        System.out.println(l.size()+" is the size of our list");
                        System.out.println(x.size()+" is the size of our list");
                        break;
                    case 5:

                        System.out.println("Is the list empty? "+ l.isEmpty());
                        System.out.println("Is the list empty? "+ x.isEmpty());
                        break;
                    case -1:

                        System.out.println("Good bye");
                        System.exit(0);
                        break;
                }
                System.out.println("list elements are : "+l.getAll());
                System.out.println("list elements are : "+x.getAll());

            }


        }
    }


