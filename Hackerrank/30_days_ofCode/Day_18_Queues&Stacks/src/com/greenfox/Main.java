package com.greenfox;

import java.util.*;

public class Main {
  // Write your code here.
  Stack<Character> stack;
  Queue<Character> queue;
  void Solution(){
    stack = new Stack<>();
    queue =  new ArrayDeque<>();
  }
  public void pushCharacter(Character c){
    stack.push(c);
  }
  public Character popCharacter(){
    return stack.pop();
  }
  public Character dequeueCharacter(){
    return queue.poll();
  }
  public void enqueueCharacter(Character c){
    queue.add(c);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    // Create a Solution object:
    Main p = new Main();

    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
      p.pushCharacter(c);
      p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length/2; i++) {
      if (p.popCharacter() != p.dequeueCharacter()) {
        isPalindrome = false;
        break;
      }
    }

    //Finally, print whether string s is palindrome or not.
    System.out.println( "The word, " + input + ", is "
      + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
  }
}