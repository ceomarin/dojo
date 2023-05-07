package com.ceomarin.listassigment;

public class SinglyLinkedList {
	public Node head;
	public int total;
    public SinglyLinkedList() {
        this.head = null;
        this.total = 0;
    }
    //Los metodos de la SLL van aqui. Al principio, les mostraremos cómo agregar nodos a la lista.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
        this.total++;
    }
    public void printValues() {
    	Node node = this.head;
    	if(node == null) {
    		System.out.println("Lista esta vacia");
    	}else{
    		try {
    			System.out.println("La lista contiene "+this.total+" nodos que son: ");
            	while(node != null) {
            		System.out.println("node value: "+node.value);
            		node = node.next;
            	}
            	
    		}catch (Exception e) {
    			System.out.println(e);
    		}
    	}
    }
    
}
