package HashTable;

public class MyHashCode {
    Node[] a=new Node[5];
    public boolean contains(int data)
    {
        int index=data%a.length;
        Node temp=a[index];
        while (temp!=null)
        {
            if (temp.data==data)
                return true;
            temp=temp.next;
        }
        return false;
    }
    public void print()
    {
        for (int i=0;i<a.length;i++)
        {
            Node temp=a[i];
            while (temp!=null)
            {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }

    public void add(int data)
    {
        Node node=new Node();
        node.data=data;
        int index=data%a.length;
        if (a[index]==null)
            a[index]=node;
        else
        {
            Node temp=a[index];
            while (temp.next!=null)
                temp=temp.next;
            temp.next=node;

        }

    }
}
