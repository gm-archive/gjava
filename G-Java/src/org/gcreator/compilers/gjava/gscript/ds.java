/*
 * ds.java
 * 
 * Created on 11-Sep-2007, 01:48:40
 * 
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.gcreator.compilers.gjava.gscript;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Ali1
 */
public class ds {
/**
         * Creates a new stack. The function returns a Stack object that must be used in all other functions to access the particular stack. You can create multiple stacks.
         * @return a new Stack object
         */
        public static Stack stack_create() {
            return new Stack();
        }

        /**
         * Destroys the stack with the given id, freeing the memory used. Don't forget to call this function when you are ready with the structure.
         * @param id
         */
        public static void stack_destroy(Stack id) {
            id = null;
        }

        /**
         * Clears the stack with the given id, removing all data from it but not destroying it.
         * @param id
         */
        public static void stack_clear(Stack id) {
            id = new Stack();
        }

        /**
         * Returns the number of values stored in the stack.
         * @param id
         * @return
         */
        public static int stack_size(Stack id) {
            return id.size();
        }

        /**
         * Returns whether the stack is empty. This is the same as testing whether the size is 0.
         * @param id
         */
        public static boolean stack_empty(Stack id) {
            return id.empty();
        }

        /**
         * Pushes the value on the stack.
         * @param id
         * @param val
         */
        public static void stack_push(Stack id, String val) {
            id.push(val);
        }

        /**
         * Returns the value on the top of the stack and removes it from the stack.
         * @param id
         */
        public static String stack_pop(Stack id) {
            return (String) id.pop();
        }

        /**
         * Returns the value on the top of the stack but does not remove it from the stack.
         * @param id
         */
        public static String stack_top(Stack id) {
            String str = stack_pop(id);
            stack_push(id, str);
            return str;
        }
        
       

        /**
         * Creates a new queue. The function returns an integer as an id that must be used in all other functions to access the particular queue. You can create multiple queues.
         * @return
         */
        public static LinkedList queue_create() {
            return new LinkedList();
        }


        /**
         * Destroys the queue with the given id, freeing the memory used. Don't forget to call this function when you are ready with the structure.
         * @param id
         */
        public static void queue_destroy(LinkedList id) {
            id = null;
        }

        /**
         * Clears the queue, removing all data from it but not destroying it.
         * @param id
         * @return
         */
        public static void queue_clear(LinkedList id) {
            id = new LinkedList();
        }

        /**
         * Returns the number of values stored in the queue.
         * @param id
         * @return
         */
        public static int queue_size(LinkedList id) {
            return id.size();
        }

        /**
         * Returns whether the queue is empty. This is the same as testing whether the size is 0.
         * @param id
         * @return
         */
        public static boolean queue_empty(LinkedList id) {
            return id.isEmpty();
        }

        /**
         * Enters the value in the queue.
         * @param id
         * @param val
         */
        public static void queue_enqueue(LinkedList id, String val) {
            id.add(val);
        }

        /**
         * Returns the value that is longest in the queue and removes it from the queue.
         * @param id
         * @return
         */
        public static String queue_dequeue(LinkedList id) {
            return (String) id.poll();
        }

        /**
         * Returns the value at the head of the queue, that is, the value that has been the longest in the queue. (It does not remove it from the queue.)
         * @param id
         * @return
         */
        public static String queue_head(LinkedList id) {
            return (String) id.getLast();
        }

        /**
         * Returns the value at the tail of the queue, that is, the value that has most recently been added to the queue. (It does not remove it from the queue.)
         * @param id
         * @return
         */
        public static String queue_tail(LinkedList id) {
            return (String) id.getFirst();
        }
    

}
