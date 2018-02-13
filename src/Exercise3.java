import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

public class Exercise3
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();  //initializes new LinkedList containing integers

        //adds number to list

        list.add(1);
        list.add(1);
        list.add(2);
        list.add(0);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        list.add(8);
        list.add(3);
        list.add(11);
        list.add(9);
        list.add(12);
        list.add(0);
        list.add(14);
        list.add(0);
        list.add(16);

        Exercise3 exercise3 = new Exercise3();  //initializes class in order to use method
        System.out.println(exercise3.removeEvenInRange(list, 5, 13));  //method in use
    }
    public Collection removeEvenInRange(LinkedList<Integer> link, int start, int end)  //method for removing even ints
    {
        Iterator<Integer> iterator = link.iterator();  //initializes iterator

        int size = 0;  //size to be used to keep track of where in list we are
        while(iterator.hasNext())  //loop as long as link has more elements
        {

            int current = iterator.next();  //int used for storing the current elements value in

                //runs if size is in the right range and current is an even number
                if(size >= start && size < end && current % 2 == 0)
                {
                        iterator.remove();  //removes current
                }
                size++;  //increment size so we know where in the list we are
        }
        return link;  //returns new list with even numbers in range removed
    }
}
