/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class admin extends student{
     public void adminPanel() throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME:");
        String name=sc.nextLine();
        
        System.out.println("ENTER YOUR ADMIN LOGIN ID:");
        int id=sc.nextInt();
       
        System.out.println("ENTER YOUR ADMIN DOMAIN:\n 1-ACCOUNTENT\n 2-STAFF\n 3-HOD");
        int domain=sc.nextInt();
        
        switch(domain){
            case 1:{
               // int n=6;
               // for(int i=1;i<=n;i++)
               if(domain==1){
                System.out.println("ENTER WHICH OPERATION U WANT TO DO:\n 1- VIEW\n 2-MODIFY\n 3-ADD\n ");
                int accountOption=sc.nextInt();
                if(accountOption==1){
                    System.out.println("ENTER A DEPARTMENT NAME TO VIEW A DETAILS OF STUDENT RECORD");
                    System.out.println("1-CSC\n 2-IT\n 3-ECE\n 4-EEE\n 5-MECH\n 6-CIVIL");
                    department=sc.nextInt();
                    //int n=6;
                    //for(int i=1;i<=n;i++)
                    if(department==1){
                        System.out.println("IN WHICH YEAR DETAILS U WANT TO VIEW");
                        System.out.println("1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        if(year==1){
                            System.out.println("TOTAL NUMBER OF STUDENT IN FIRST YEAR 20");
                            
                        }
                        else if(year==2){
                            System.out.println("TOTAL NUMBER OF STUDENT IN SECOND YEAR 20");
                            
                        }
                        else if(year==3){
                            System.out.println("TOTAL NUMBER OF STUDENT IN THIRD YEAR 20");
                        }
                        else{
                            System.out.println("TOTAL NUMBER OF STUDENT IN FOURTH YEAR 20");
                        }
                    }
                    else if(department==2){
                        System.out.println("IN WHICH YEAR DETAILS U WANT TO VIEW");
                        System.out.println("1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        if(year==1){
                            System.out.println("TOTAL NUMBER OF STUDENT IN FIRST YEAR 20");
                            
                        }
                        else if(year==2){
                            System.out.println("TOTAL NUMBER OF STUDENT IN SECOND YEAR 20");
                            
                        }
                        else if(year==3){
                            System.out.println("TOTAL NUMBER OF STUDENT IN THIRD YEAR 20");
                        }
                        else{
                            System.out.println("TOTAL NUMBER OF STUDENT IN FOURTH YEAR 20");
                        }
                        
                    }
                     else if(department==3){
                        System.out.println("IN WHICH YEAR DETAILS U WANT TO VIEW");
                        System.out.println("1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        if(year==1){
                            System.out.println("TOTAL NUMBER OF STUDENT IN FIRST YEAR :20");
                            
                        }
                        else if(year==2){
                            System.out.println("TOTAL NUMBER OF STUDENT IN SECOND YEAR :20");
                            
                        }
                        else if(year==3){
                            System.out.println("TOTAL NUMBER OF STUDENT IN THIRD YEAR:20");
                        }
                        else{
                            System.out.println("TOTAL NUMBER OF STUDENT IN FOURTH YEAR: 20");
                        }
                        
                    }
                     else if(department==4){
                        System.out.println("IN WHICH YEAR DETAILS U WANT TO VIEW");
                        System.out.println("1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        if(year==1){
                            System.out.println("TOTAL NUMBER OF STUDENT IS 20");
                            
                        }
                        else if(year==2){
                            System.out.println("TOTAL NUMBER OF STUDENT IS 20");
                            
                        }
                        else if(year==3){
                            System.out.println("TOTAL NUMBER OF STUDENT IS 20");
                        }
                        else{
                            System.out.println("TOTAL NUMBER OF STUDENT IS 20");
                        }
                        
                    }
                    else if(department==5){
                        System.out.println("IN WHICH YEAR DETAILS U WANT TO VIEW");
                        System.out.println("1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        if(year==1){
                            System.out.println("TOTAL NUMBER OF STUDENT IN FIRST YEAR 20");
                            
                        }
                        else if(year==2){
                            System.out.println("TOTAL NUMBER OF STUDENT IN SECOND YEAR 20");
                            
                        }
                        else if(year==3){
                            System.out.println("TOTAL NUMBER OF STUDENT IN THIRD YEAR 20");
                        }
                        else{
                            System.out.println("TOTAL NUMBER OF STUDENT IN FOURTH YEAR 20");
                        }
                        
                    }
                     else if(department==6){
                        System.out.println("IN WHICH YEAR DETAILS U WANT TO VIEW");
                        System.out.println("1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        if(year==1){
                            System.out.println("TOTAL NUMBER OF STUDENT IN FIRST YEAR 20");
                            
                        }
                        else if(year==2){
                            System.out.println("TOTAL NUMBER OF STUDENT IN SECOND YEAR 20");
                            
                        }
                        else if(year==3){
                            System.out.println("TOTAL NUMBER OF STUDENT IN THIRD YEAR 20");
                        }
                        else{
                            System.out.println("TOTAL NUMBER OF STUDENT IN FOURTH YEAR 20");
                        }
                        
                    }
                    
                }
             else if(accountOption ==2){
                    System.out.println("ENTER A DEPARTMENT NAME TO VIEW A DETAILS OF STUDENT RECORD");
                    System.out.println("1-CSC\n 2-IT\n 3-ECE\n 4-EEE\n 5-MECH\n 6-CIVIL");
                    department=sc.nextInt();
                    if(department==1){
                        System.out.println("AMOUNT OF FEES FOR THIS DEPARTMENT IS 65000");
                        System.out.println("CHOOSE A YEAR TO MODIFY A STUDENT FEES DETAILS\n 1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        for(int i=year;i<=year;i++){
                            if(year==1){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                   if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.println("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                   // }
                                }
                            else if(year==2){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8|| studentIdNo==2||studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            if(year==3){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                    //}
                                }
                            if(year==4){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                                //for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            }
                        }
                    if(department==2){
                        System.out.println("AMOUNT OF FEES FOR THIS DEPARTMENT IS 65000");
                        System.out.println("CHOOSE A YEAR TO MODIFY A STUDENT FEES DETAILS\n 1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        for(int i=year;i<=year;i++){
                            if(year==1){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                   if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.println("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                   // }
                                }
                            else if(year==2){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8|| studentIdNo==2||studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            if(year==3){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                    //}
                                }
                            if(year==4){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                                //for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            }
                        }
                    if(department==3){
                        System.out.println("AMOUNT OF FEES FOR THIS DEPARTMENT IS 65000");
                        System.out.println("CHOOSE A YEAR TO MODIFY A STUDENT FEES DETAILS\n 1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        for(int i=year;i<=year;i++){
                            if(year==1){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                   if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.println("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                   // }
                                }
                            else if(year==2){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8|| studentIdNo==2||studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            if(year==3){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                    //}
                                }
                            if(year==4){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                                //for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            }
                        }
                    if(department==4){
                        System.out.println("AMOUNT OF FEES FOR THIS DEPARTMENT IS 65000");
                        System.out.println("CHOOSE A YEAR TO MODIFY A STUDENT FEES DETAILS\n 1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        for(int i=year;i<=year;i++){
                            if(year==1){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                   if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.println("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                   // }
                                }
                            else if(year==2){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8|| studentIdNo==2||studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            if(year==3){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                    //}
                                }
                            if(year==4){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                                //for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            }
                        }
                    if(department==5){
                        System.out.println("AMOUNT OF FEES FOR THIS DEPARTMENT IS 65000");
                        System.out.println("CHOOSE A YEAR TO MODIFY A STUDENT FEES DETAILS\n 1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        for(int i=year;i<=year;i++){
                            if(year==1){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                   if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.println("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                   // }
                                }
                            else if(year==2){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8|| studentIdNo==2||studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            if(year==3){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                    //}
                                }
                            if(year==4){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                                //for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            }
                        }
                    if(department==6){
                        System.out.println("AMOUNT OF FEES FOR THIS DEPARTMENT IS 65000");
                        System.out.println("CHOOSE A YEAR TO MODIFY A STUDENT FEES DETAILS\n 1-FIRST YEAR\n 2-SECOND YEAR\n 3-THIRD YEAR\n 4-FOURTH YEAR");
                        int year=sc.nextInt();
                        for(int i=year;i<=year;i++){
                            if(year==1){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                   if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.println("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                   // }
                                }
                            else if(year==2){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8|| studentIdNo==2||studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            if(year==3){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                               // for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 ||studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 || studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                    //}
                                }
                            if(year==4){
                                System.out.println("30 MEMBERS OF STUDENT PAID A FESS COMPLETELY 20 MEMBERS OF STUDENT YET TO PAY A FEES");
                                ArrayList paidDetails=new ArrayList();
                                System.out.println("ENTER A STUDENT ID TO MODIFY A CONTENT");
                                 studentIdNo=sc.nextInt();
                                //for(int studentIdNo=1;studentIdNo<=20;i++){
                                  
                                    if(studentIdNo==1 || studentIdNo==10 ||studentIdNo==8 || studentIdNo==16 ||studentIdNo==18 || studentIdNo==2 ||studentIdNo==7 || studentIdNo==8 || studentIdNo==2 || studentIdNo==12)
                                    {
                                        System.out.print("THIS STUDENT PAID A FULL FEES SUCCESSFULLY");
                                    }
                                    else {
                                          System.out.println("THIS STUDENT WANT TO PAY A BALANCE AMOUNT:15000");
                                          System.out.println("ADD A FINE AMOUNT TO PAY A FEES");
                                          int fine =sc.nextInt();
                                          int amount=15000;
                                          int newAmount=amount+fine;
                                          System.out.println("STUDENT WANT TO PAY A FESS WITH THEIR FINE AMOUNT :"+newAmount);
                                         }    
                                  //  }
                                }
                            }
                        }
                    }
                else if(accountOption ==3){
                    System.out.println("MODIFIED CONTENT IS ADD IN DATASET SUCCESSFULLY");
                }
            }
            }
      
        case 2:
           {
           if(domain==2){
                System.out.println("ARE U BELONGING FROM WHICH DEPARTMENT STAFF:\n 1-CSC\n 2-IT\n 3-ECE\n 4-EEE\n 5-MECH\n 6-civil");
               int code=sc.nextInt();
               System.out.println("IF YOU HAD A ANY QUERY FROM YOUR DEPARTMENT SIDE ACKNOWLEDGE HERE");
              sc.nextLine();
                String query=sc.nextLine();
               System.out.println("QUICKLY WE RESLOVE THIS PROBLEM IN OUR MANAGEMENT SIDE THANK YOU FOR ADDRESSING THIS QUERY");
           }
           }
        case 3:
           {
           if(domain==3){
              System.out.println("ARE YOU BELONGING FROM WHICH DEPARTMENT HOD:\n 1-CSC\n 2-IT\n 3-ECE\n 4-EEE\n 5-MECH\n 6-civil");
               int hod=sc.nextInt();
              sc.nextLine();
                System.out.println("IF YOU HAD A ANY QUERY FROM YOUR DEPARTMENT SIDE OR WANT ANY FACILITIES TO YOUR DEPARTMENT ACKNOWLEDGE HERE");
              sc.nextLine();
              String hquery=sc.nextLine();
           }
          }
       }
               
                
        }
        //System.out.println("ENTIRE ADMIN THING IS SAVED AND MANINTAIN SUCCESSFULLY");
        
     }


//}
