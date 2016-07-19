package model;

import utils.lists.ArrayIndexedList;
import utils.lists.LinkedListOrderedList;
import utils.stack.LinkedListStack;
import utils.lists.ArrayOrderedList;

import java.util.ArrayList;

/**
 * Created by kristab21 on 6/30/16.
 */

public class UserDB {

   private static ArrayIndexedList<User> users = new ArrayIndexedList<>();

    public static ArrayIndexedList<User> getUsers() {return users; }

    public static void setUsers(ArrayIndexedList<User> users) { UserDB.users = users; }

}


/*
I used an array indexed list for this project because:
- lists are unbounded
- arrays are easy to process with for loops
- the enlarge method allows the array to increase in size if necessary
- the compareTo and contains methods are helpful for determining if there are duplicate user names
- because the list is indexed, it is easy to iterate through
- can access all elements, not just the one at the end
 */