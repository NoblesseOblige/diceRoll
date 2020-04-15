package com.company;

import java.util.Random;

public class dice {

   int face;
   Random rand=new Random();

   public int roll()
   {
       this.face=rand.nextInt(6)+1;
       return this.face;
   }
}
