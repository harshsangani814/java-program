import java.util.*;
//package stackimplementtion;

public class StackArrayimplemention
{
    int top;
    int capacity;
    int[] stack;

StackArrayimplemention()
{
     top=-1;
    capacity=10;
    stack=new int[capacity];
}
public boolean isEmpty()
{
    
    return top==-1;
}
public boolean isFull()
{
    return top==capacity-1;
}

public int push(int data)
{
    if(isFull())
    {
     System.out.println("stack is full");
    }
    return stack[++top]=data;
}
public int pop()
{
    if(isEmpty())
    {
        System.out.println("stack is empty");
    }
    return stack[top--];
}
public int peek()
{
    return Stack[top];
}


//public class prac_20 {
    public static void main(String[] args)
    {
        StackArrayimplemention input=new StackArrayimplemention()
        input.push(12);
        input.push(13);
        input.push(14);
        input.push(15);
        System.out.println(input.isEmpty());
        System.out.println(input.isFull());
        System.out.println(input.peek());
        System.out.println(input.pop());
    }
    
}
