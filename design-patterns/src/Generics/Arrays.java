package Generics;

import java.util.ArrayList;

public class Arrays {


    public static <T> void displayArray(T [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (T i  : arr){
            System.out.print(i + " ");
        }

    }

    public static <T> void getFirstElement(T [] arr){
        System.out.println(arr[0]);
    }

    public static void main(String[] args) {
        Integer[] Intarr = {1, 2, 3, 4, 5};
        displayArray(Intarr);

        String[] Strarr = {"Hello", "world", "!"};
        displayArray(Strarr);

        Character[] Chararr = {'H', 'e', 'l', 'l', 'o'};
        displayArray(Chararr);

        Double[] Doubarr = {1.1, 2.2, 3.3, 4.4, 5.5};
        displayArray(Doubarr);


        getFirstElement(Intarr);
        getFirstElement(Strarr);
        getFirstElement(Chararr);
        getFirstElement(Doubarr);

        //wrong
        GenericClass intgr = new GenericClass(1); //Type safety: The constructor GenericClass(Object) belongs to the raw type GenericClass.
        System.out.println(intgr.getX());           //References to generic type GenericClass<Thing> should be parameterized

        //Correct
        GenericClass<Integer> intgr2 = new GenericClass<>(1);
        System.out.println(intgr2.getX());

        //wrong
        GenericClass strval = new GenericClass("hey");
        System.out.println(strval.getX());
        //correct
        GenericClass<String> strval2 = new GenericClass<String>("hey");
        System.out.println(strval2.getX());


        //not type safe because RH side "String" not declared
        ArrayList<String> friends = new ArrayList();
        //Type safe: Preferred
        ArrayList<String> moreFriends = new ArrayList<>();
        //Type safe: works same as second line, but is redundant
        ArrayList<String> evenMoreFriends = new ArrayList<String>();
        
        

        
    }
}
