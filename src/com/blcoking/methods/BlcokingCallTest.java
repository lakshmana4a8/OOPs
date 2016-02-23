package com.blcoking.methods;

import java.io.FileNotFoundException;
import java.io.IOException;

public class BlcokingCallTest {

    public static void main(String args[]) throws FileNotFoundException, IOException  {
      System.out.println("Calling blocking method in Java");
      while (true) {
    	  int input = System.in.read();
    	  System.out.println("Blocking method is finished : "+input);
      }
    }  
}
