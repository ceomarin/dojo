import java.util.ArrayList;
import java.io.*;

public class ListOfException{
    public static void main(String[] args){
        ArrayList<Object> myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");
        int castedValue = 0;

        for(int i = 0; i < myList.size(); i++) {
            try{
               castedValue = (int) myList.get(i);
            }catch (Exception e){
                System.out.println("Ocurrio un error de tipo : "+e);
                System.out.println("En el indice : "+i);
                // continue;
            }
        }
        System.out.println("El unico valor que se pudo hacer cast int fue el valor : "+ castedValue);
        System.out.println("De tipo : "+ ((Object)castedValue).getClass().getName());
        
    }
}