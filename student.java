/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Home
 */
public class student {
    int studentIdNo;
    String studentName;
    int department;
    int yearOfStudying;
    int staffDetails;
    private int staffDetail;
    int choiceOfFees;
    private int chioceOfFees;
    
    
    
     public void studentInfo() throws IOException{
         Scanner sc=new Scanner(System.in);
         System.out.println("ENTER YOUR NAME");
         studentName=sc.nextLine();
         System.out.println("ENTER YOUR STUDENT REGISTER N0");
         studentIdNo=sc.nextInt();
         System.out.println("CHOOSE YOUR DEPARTMENT:\n 1-CSC\n2-IT\n3-ECE\n4-EEE\n5-MECH\n6-CIVIL");
         int department=sc.nextInt();
         System.out.println("I AM BELONGIGNG FROM THIS DEPARTMENT:"+department);
         System.out.println("CHOOSE ARE U FROM WHICH YEAR:\n  1st YEAR\n 2nd YEAR\n 3rd YEAR\n 4th YEAR");
         int yearOfStudying=sc.nextInt();
         System.out.println("I AM CURRENTLY FROM:"+yearOfStudying);
          System.out.println("IF YOU WANT TO KNOW ABOUT THE STAFF DETAILS :\n1 YES\n 2 NO");
         int choice=sc.nextInt();
         
         switch(choice){
            case 1 :
                 if(choice==1){
                     System.out.println("IF YOU  WANT TO KNOW ABOUT THE SATFF AND HOD DETAILS:\n 1-STAFF\n 2-HOD");
                     this.staffDetail=sc.nextInt();
                     if(staffDetail == 1 && department == 1){
                        System.out.println("1-anu\n 2-surya \n 3- abi \n4- shruthi");
                     }
                     else if(staffDetail==2 && department ==1){
                        System.out.println("surya");
                     }
                    if(staffDetail == 1 && department == 2){
                       System.out.println("1-devi\n abi \n deepa\n haritha\n thiru\n poopathi");
                    }
                    else if(staffDetail==2 && department ==2){
                       System.out.println("vijay");
                    }
                    if(staffDetail == 1 && department == 3){
                        System.out.println("1-roshini\n 2-priya \n 3-dharani\n4-sandhiya ");
                    }
                    else if(staffDetail==2 && department ==3){
                        System.out.println("siva");
                    } 
                    if(staffDetail == 1 && department == 4){
                        System.out.println("1-devi\n abi \n deepa\n haritha\n thiru\n poopathi");
                    }
                     else if(staffDetail==2 && department ==4){
                        System.out.println("nelson");
                    }
                    if(staffDetail == 1 && department == 5){
                        System.out.println("1-anu\n 2-surya \n 3- ");
                    }
                    else if(staffDetail==2 && department ==5){
                        System.out.println("siva");
                    }
                    if(staffDetail == 1 && department == 6){
                         System.out.println("1-devi\n abi \n deepa\n haritha\n thiru\n poopathi");
                    }
                    else if(staffDetail==2 && department ==6){
                         System.out.println("arjun");
                     }
                    break;
                 }
                 case 2:
                       {
                          break;
                        }
            }
         System.out.println("DO YOU WANT TO KNOW ABOUT YOUR FEES DETAILS:\n 1-YES\n2-NO");
         int feeDetails=sc.nextInt();
         if(feeDetails==1){
             
        System.out.println("CHOSE WHAT YOU WANT:\n 1-courses fees\n 2-tution fees\n 3-books fees");
        this.chioceOfFees=sc.nextInt();
       
        {
           // int chioceOfFees = 0;
        
        
        if(department==1 && chioceOfFees==1){
           System.out.println("courses fess:15000");
        }
        else if(department==1 && chioceOfFees==2){   
               System.out.println("tution fees:10000");
        }
        else if(department==1 && chioceOfFees==3){
           System.out.println("books fess:5000");
        }
        
       
        
        if(department==2 && chioceOfFees==1){
           System.out.println("courses fess:14000");
        }
        else if(department==2 && chioceOfFees==2){   
               System.out.println("tution fees:13000");
        }
        else if(department==2 && chioceOfFees==3){
           System.out.println("books fess:15000");
        }
       
        
        
        if(department==3 && chioceOfFees==1){
           System.out.println("courses fess:8000");
        }
        else if(department==3 && chioceOfFees==2){   
               System.out.println("tution fees:6000");
        }
        else if(department==3 && chioceOfFees==3){
           System.out.println("books fess:3000");
        }
        
       
        
        if(department==4 && chioceOfFees==1){
           System.out.println("courses fess:1500");
        }
        else if(department==4 && chioceOfFees==2){   
               System.out.println("tution fees:8000");
        }
        else if(department==4 && chioceOfFees==3){
           System.out.println("books fess:600");
        }
        
       
        
        if(department==5 && chioceOfFees==1){
           System.out.println("courses fess:150");
        }
        else if(department==5 && chioceOfFees==2){   
               System.out.println("tution fees:100");
        }
        else if(department==5 && chioceOfFees==3){
           System.out.println("books fess:500");
        }
        
        
        
        if(department==6 && chioceOfFees==1){
           System.out.println("courses fess:8960");
        }
        else if(department==6 && chioceOfFees==2){   
               System.out.println("tution fees:45370");
        }
        else if(department==6 && chioceOfFees==3){
           System.out.println("books fess:2684");
        }
        }
        
                 }
         else if(feeDetails==2){
             
         }
        System.out.println("IF YOU WANT TO KNOW YOUR DEPARTMENT TOPPER LIST AND ACHEIVEMENT:\n 1-YES\n 2-NO");
        int n=sc.nextInt();
        if(n==1){
            
              System.out.println("CHOOSE YOUR DEPARTMENT:\n1-CSC\n2-IT\n3-ECE\n4-EEE\n5-MECH\n6-CIVIL");
             int department1=sc.nextInt();
             if(department1==1){
                 System.out.println(" 1st year topper is ANU\n2nd YEAR TOPPER IS REVATHI\n3RD YEAR TOPPER IS ANAMIKA\n4TH YEAR TOPPER IS ANANAIYA");
                 System.out.println("MORE THAN 10 STUDENT  WON IN PAPER PRESENTATION IN IEEE COFEERENCE\nLOTS OF SOCIAL WORK AARE DONE BY THIS DEPARTMENT STUDENT ");
                 
             }
             else if(department1==2){
                 System.out.println(" 1st year topper is ABI\n2nd YEAR TOPPER IS REVANTH\n3RD YEAR TOPPER IS AARATHANA\n4TH YEAR TOPPER IS BRINDHA");
                 System.out.println("MORE THAN 11 STUDENT  WON IN PAPER PRESENTATION IN IEEE COFEERENCE\nLOTS OF SOCIAL WORK AARE DONE BY THIS DEPARTMENT STUDENT ");
                 
             }
             else if(department1==3){
                 System.out.println(" 1st year topper is SURYA\n2nd YEAR TOPPER IS VINITHA\n3RD YEAR TOPPER IS VANI\n4TH YEAR TOPPER IS ANANAIYA");
                 System.out.println("MORE THAN 10 STUDENT  WON IN PAPER PRESENTATION IN IEEE COFEERENCE\nLOTS OF SOCIAL WORK AARE DONE BY THIS DEPARTMENT STUDENT ");
                 
             }
             else if(department1==4){
                 System.out.println(" 1st year topper is ABI\n2nd YEAR TOPPER IS REVATHI\n3RD YEAR TOPPER IS SATHISH\n4TH YEAR TOPPER IS ANANAIYA");
                 System.out.println("MORE THAN 10 STUDENT  WON IN PAPER PRESENTATION IN IEEE COFEERENCE\nLOTS OF SOCIAL WORK AARE DONE BY THIS DEPARTMENT STUDENT ");
                 
             }
             else if(department1==5){
                 System.out.println(" 1st year topper is SREE\n2nd YEAR TOPPER IS ASWATH\n3RD YEAR TOPPER IS KEERTHI\n4TH YEAR TOPPER IS ANANAIYA");
                 System.out.println("MORE THAN 10 STUDENT  WON IN PAPER PRESENTATION IN IEEE COFEERENCE\nLOTS OF SOCIAL WORK AARE DONE BY THIS DEPARTMENT STUDENT ");
                 
             }
             else if(department1==6){
                 System.out.println(" 1st year topper is DHARANI\n2nd YEAR TOPPER IS AJAY\n3RD YEAR TOPPER IS ABBARANA\n4TH YEAR TOPPER IS ANANAIYA");
                 System.out.println("MORE THAN 10 STUDENT  WON IN PAPER PRESENTATION IN IEEE COFEERENCE\nLOTS OF SOCIAL WORK AARE DONE BY THIS DEPARTMENT STUDENT ");
                 
             }
             
             
                }
        else{
            
        }
        System.out.println("IF YOU WNAT TO PAY YOUR FEES:\n1-YES\n2-NO");
        int fees=sc.nextInt();
        if(fees==1){
            System.out.println("CHOOSE YOUR DEPARTMENT:\n1-CSC\n2-IT\n3-ECE\n4-EEE\n5-MECH\n6-CIVIL");
            department=sc.nextInt();
            System.out.println("ENTER YOUR REGISTER NUMBER:");
            int studentIdNo=sc.nextInt();
            System.out.println("CHOOSE YOUR PAYEMNT METHOD:\n1-ONLINE PAYMENT\n2-DEBIT CARD");
            int method=sc.nextInt();
            if(method==1){
                System.out.println("CHOOSE TOUR DEOMAIN TO TRASFER:\n1-GOOGLE PAY\n2-PAYTM\n3-AMAZONPAY");
                int domain=sc.nextInt();
                if(domain==1){
                    System.out.println("ENTER YOUR AMOUNT TO TRANSFER:");
                    int amount=sc.nextInt();
                    System.out.println(amount+"AMOUNT TRANSFER SUCCESSFULLY!!");
                    System.out.println("THANK YOU FOR USING GOOGLE PAY!!!!!!");
                }
                else if(domain==2){
                    System.out.println("ENTER YOUR AMOUNT TO TRANSFER:");
                    int amount=sc.nextInt();
                    System.out.println(amount+"AMOUNT TRANSFER SUCCESSFULLY!!");
                    System.out.println("THANK YOU FOR USING PAYTM!!!!!!");
                }
                else if(domain==3){
                    System.out.println("ENTER YOUR AMOUNT TO TRANSFER:");
                    int amount=sc.nextInt();
                    System.out.println(amount+"AMOUNT TRANSFER SUCCESSFULLY!!");
                    System.out.println("THANK YOU USING AMAZON PAY!!!!!!");
                }
            }
            else if(method==2){
                System.out.println("ENTER A ACCOUNT TO TRNSER A MONEY:");
                int accountNo=sc.nextInt();
                System.out.println("  ENTER YOUR AMOUNT TO TRANSFER"  );
                int amount=sc.nextInt();
                System.out.println("AMOUNT TRNASFFER SUCCESSFULLY");
            }
        }
        else{
            System.out.println("THANK YOU !!!");
        }
     
    System.out.println("THANK YOU!!!!!!!!!");
}
}

