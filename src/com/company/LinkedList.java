package com.company;

public class LinkedList {
    public int data;
    public LinkedList next;

    public LinkedList(int data) {
        this.data = data;
    }
    private LinkedList head;
    public LinkedList() {
        head = null;
    }
    public void add(int data) {
        LinkedList temp = new LinkedList(data);
        temp.next = head;
        head = temp;
    }
    public void minValue () {
        LinkedList temp = head;
        LinkedList min = head;
        while (temp!=null) {
            if (min.data>temp.data) {
                min = temp;
            }
            temp = temp.next;
            if (min.data==temp.data) {
                min = temp;
            }
        }
        min.data = min.data*(-1);
    }
    public void process () {

    }
    public void find (int value) {
        LinkedList temp = head;
        int c = 0;
        while (temp!=null) {
            if(temp.data == value)
                return c;

            temp = temp.next;
            с++;
        }
    }
    public void print () {
        LinkedList temp = head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
