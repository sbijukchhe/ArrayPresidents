/*
Storing the history of values in a program is a common task. Maintaining an object's history requires the programmer
to either write specific code or use a library which supports history logging. Today you're going to write specific
code to store the history of a list.

Type in the names of the last ten presidents in the order they were elected. When you are done, enter the word history.
 Your program should display their names starting with the most recent.

For your convenience, the names of the last 10 presidents are:

Kennedy, Johnson, Nixon, Ford, Carter, Reagan, Bush, Clinton, Bush, Obama
 */

public class ArrayPresidents {
    public static void main(String[] args){

        String[] history = new String[]{"Kennedy", "Johnson", "Nixon", "Ford", "Carter", "Reagan", "Bush", "Clinton", "Bush", "Obama"};
        for(int i=9;i>=0; i--){
            System.out.println(history[i]);
        }
    }
}
