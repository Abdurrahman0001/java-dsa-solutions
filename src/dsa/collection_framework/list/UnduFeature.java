package dsa.collection_framework.list;

import java.util.Stack;

public class UnduFeature {
    public static void main(String[] args) {
        /**
         * Undu feature (stack):
         *  Use Stack<String> to implement an undo operation
         *      Push each action into the stack
         *      when undo is pressed, pop the last action.
         *      Use case : Text editor undo
         *
         * */


        Stack<String> tabs = new Stack<>();

        tabs.push("Type, 'Hello'");
        tabs.push("Bold Text");
        tabs.push("Under line Text");
        tabs.push("added image");

        System.out.println("Current action: "+tabs.peek());
        System.out.println("Last action undone: "+tabs.pop());
        System.out.println("Remaining action; "+tabs);

    }
}
