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
public class main {
    public static void main(String[] args) throws IOException {
		System.out.println("WELCOME !!!!");
                System.out.println("Choose whether you are an user or admin");
		System.out.println("1. User");
		System.out.println("2. Admin");
                Scanner sc = new Scanner(System.in);
		
		int choice = sc.nextInt();
                switch(choice) {
		case 1:
			
                        student st=new student();
                        st.studentInfo();
                        break;
		case 2:
			admin admin = new admin();
			admin.adminPanel();
			break;
		}
	}
}
