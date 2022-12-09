import java.util.ArrayList;
import java.util.Collections;

public class ArrayListProgram {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<Integer>();

        // adding elements in array
        list.add(10);
        list.add(20);
        list.add(30);

        System.out.println(list);

        // get element
        int get_elemnt = list.get(2);

        System.out.println(get_elemnt);

        // add in between
        list.add(2 , 50);
        System.out.println(list);

        // replace a integer at index

        list.set(1, 80);
        System.out.println(list);

        // delete a integer 
        list.remove(2);
        System.out.println(list);

        // size of array

        System.out.println(list.size());

        // looping thorugh arraylist

        for(int i=0 ; i<list.size() ; i++){
            System.out.println(list.get(i));
        }

        // sorting an array

        Collections.sort(list);
        System.out.println(list);
    }
}

