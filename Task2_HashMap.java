package Zoho;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task2_HashMap {
	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		//create HashSet
		Map<String,Integer> num=new HashMap<>();
		
		while(true) {
			System.out.println("**********MENU**********");
			System.out.println("1-> clone");
			System.out.println("2-> Add new element ");
			System.out.println("3-> get size ");
			System.out.println("4-> check if empty ");
			System.out.println("5-> remove a element");
			System.out.println("6-> access with key  ");
			System.out.println("6-> if value is present  ");
			System.out.println("7-> print");
			System.out.println("9-> clear all ");
			System.out.println("10-> Exit");
			System.out.println("*************************");
			int n=sc.nextInt();
			sc.nextLine();
			switch(n) {
			case 1:
				Map<String,Integer> num1=new HashMap<>(num);
				System.out.println(num1);
				break;
			case 2:
				System.out.print("Enter the <String,Integer> to add: ");
				String ns=sc.nextLine();
				int an=sc.nextInt();
				sc.nextLine();
				num.put(ns, an);
				System.out.println(num);
				
				break;
			case 3:
				System.out.println(num.isEmpty());
				break;
			case 4:
				System.out.println(num.size());
				break;
			case 5:
				System.out.print("Enter the index: ");
				int n4=sc.nextInt();
				sc.nextLine();
				if (num.size()>n4) {
					num.remove(n4);
					System.out.println(num);}
				else 
					System.out.println("Index not found");
				break;
			case 6:
				System.out.print("Enter the Key(String) to access: ");
				String ns1=sc.nextLine();
				if (num.containsKey(ns1)) System.out.println(num.get(ns1));
				else System.out.println("No such key exists");
				break;
			case 7:
				System.out.print("Enter the check if value is present: ");
				int ns2=sc.nextInt();
				sc.nextLine();
				System.out.println(num.containsValue(ns2));
				break;
			case 8:
				System.out.println(num);
				break;
			case 9:
				num.clear();
				System.out.println(num);
				break;
			case 10:
				return;
			default:
				System.out.print("Invalid choice");
			}
			
		}

	}
}
