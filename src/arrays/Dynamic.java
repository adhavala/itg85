/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author miracle
 */
public class Dynamic {
    public static void main(String args[]){
         Scanner scan=new Scanner(System.in);

        int i=scan.nextInt();
        int id[]=new int[i];
        String dname[]=new String[i];
        String speciality[]=new String[i];
         for( i=0;i<id.length;i++)
         {
        id[i]=scan.nextInt();
        dname[i]=scan.next();
        speciality[i]=scan.next();
            System.out.println(id[i]+"      "+dname[i]+"      "+speciality[i]);
        }

    }
}