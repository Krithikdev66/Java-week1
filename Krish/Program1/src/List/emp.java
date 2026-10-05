package List;

import java.util.*;

public class emp {
    public static void main(String[] args) {
        Employee e1=new Employee(1,18,"Krithik");
        Employee e2=new Employee(2,19,"Aston");
        ArrayList<Employee> list1=new ArrayList<>();
        list1.add(e1);
        list1.add(e2);
        list1.add(new Employee(3,20,"Pritham"));
        for (Employee e:list1){
            System.out.println(e.getEmployeeId()+" "+e.getEmployeeName()+" "+e.getEmployeeAge());
        }
        Product p1=new Product(1,3000,"P1");
        Product p2=new Product(2,4000,"P2");
        ArrayList<Product> list2=new ArrayList<>();
        list2.add(p1);
        list2.add(p2);
        for (Product e:list2){
            System.out.println(e.getProductId()+" "+e.getProductPrice()+" "+e.getProductName());
        }
        ArrayList<Object> list3=new ArrayList<>();
        list3.add(e1);
        list3.add(p2);
        for(Object o:list3) {
            System.out.println(o);
        }
        ArrayList<String> list4=new ArrayList<>();
        list4.add("Apple");
        list4.add("Mango");
        list4.add("Apple");
        list4.add("Orange");
        System.out.println(list4);
        for (int i=0;i<list4.size();i++){
            System.out.println(list4.get(i));
        }
        System.out.println("For Each Loop");
        for(String e:list4){
            System.out.println(e);
        }
        System.out.println("Iterative Interface");
        Iterator<String> x=list4.iterator();
        while (x.hasNext()){
            System.out.println(x.next());
        }
        System.out.println("List Iterative Interface");
        ListIterator<String> y=list4.listIterator();
        while (y.hasNext()){
            System.out.println(y.next());
        }
        System.out.println("Reverse Order");
        while (y.hasPrevious()){
            System.out.println(y.previous());
        }
        }
    }

