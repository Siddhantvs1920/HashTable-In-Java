package HashTable;

public class UserHashCode{
    public static void main(String[] args) {


        MyHashCode name = new MyHashCode();
        name.add(10);
        name.add(26);
        name.add(17);
        name.add(33);
        name.add(89);
        name.add(58);
        name.add(96);
        name.add(27);
        name.add(78);
        name.print();
        boolean contain=name.contains(696);
        System.out.println(contain);
    }



}
