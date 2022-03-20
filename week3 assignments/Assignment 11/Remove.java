import java.util.*;
public class Remove{
 
// Function to reverse the words
// of the given String without
// using strtok().
static void reverse(String s)
{
  // Create an empty String stack
  Stack<String> stc = new Stack<>();
 
  // Create an empty temporary String
  String temp = "";
 
  // Traversing the entire String
  for(int i = 0; i < s.length(); i++)
  {
    if(s.charAt(i) == ' ')
    {
       
      // Push the temporary
      // variable into the stack
      stc.add(temp);
       
      // Assigning temporary
      // variable as empty
      temp = "";         
    }
    else
    {
      temp = temp + s.charAt(i);
    }
 
  }
 
  // For the last word
  // of the String
  stc.add(temp);
 
  while(!stc.isEmpty())
  {
    // Get the words in
    // reverse order
    temp = stc.peek();
    System.out.print(temp + " ");
    stc.pop();
  }
   
  System.out.println();
}
 
//Driver code
public static void main(String[] args)
{
  String s = "I Love To Code";
  reverse(s);
}
}