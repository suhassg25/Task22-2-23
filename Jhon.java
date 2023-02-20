package Task22_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Mobile {
	String operatingSystem;
	int ram;
	int memorySpace;
	double price;
	double rating;

	Mobile(String os, int r, int ms, double p, double ra) {
		operatingSystem = os;
		ram = r;
		memorySpace = ms;
		price = p;
		rating = ra;
	}

}

class Customer {
	String operatingSystem;
	int ram;
	int memorySpace;
	double price;

	Customer(String os, int r, int ms, double p) {
		operatingSystem = os;
		ram = r;
		memorySpace = ms;
		price = p;

	}

}

public class Jhon {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter The number of mobiles");
		int n = scan.nextInt();
		List<Mobile> m = new ArrayList();
		List<Customer> m2 = new ArrayList();
		while (n != 0) {
			System.out.println("Enter the Operating System");
			String S = scan.next();
			System.out.println("Enter Ram Size");
			int A = scan.nextInt();
			System.out.println("Enter the Memory Space");
			int B = scan.nextInt();
			System.out.println("Enter Price of Mobile");
			double C = scan.nextDouble();
			System.out.println("Enter Rating of Mobile");
			double D = scan.nextDouble();
			m.add(new Mobile(S, A, B, C, D));
			n--;
		}
		System.out.println("Enter Number of Customer");
		int Q = scan.nextInt();
		while (Q != 0) {
			System.out.println("Enter the Operating System");
			String H = scan.next();
			System.out.println("Enter Ram Size");
			int E = scan.nextInt();
			System.out.println("Enter the Memory Space");
			int F = scan.nextInt();
			System.out.println("Enter Price of Mobile");
			double G = scan.nextDouble();
			m2.add(new Customer(H, E, F, G));
			Q--;
		}

		for (Mobile l : m) {
		for (Customer c : m2) {
				if (c.operatingSystem.equalsIgnoreCase(l.operatingSystem) && c.memorySpace == l.memorySpace
						&& l.price <= c.price && c.ram == l.ram) {
					System.out.println(l.rating);
				} 
				else
				{
					System.out.print(-1);
				}
				break;
				
			}
			
		}

	}

}
