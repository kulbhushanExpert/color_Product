package com.app.client;

import java.util.Scanner;

import com.app.impl.ProductImplementation;
import com.app.service.ProductOperationInterface;

public class ProductMain {

	public static void main(String[] args) {

		ProductOperationInterface pr = new ProductImplementation();
		Scanner sc = new Scanner(System.in);
		String str = "";
		do {
			System.out.println("1..Add Product");
			System.out.println("2..Display Product");
			System.out.println("3.. add your Product");
			System.out.println("4..Exit");
			System.out.println("Select your Option");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				pr.addProduct();

				break;
			case 2:
				pr.displayeProduct();
				break;
			case 3:
				pr.addtoCart();
				break;
			case 4:
				System.exit(0);
				break;
			default:
				System.out.println("Please Select Correct Option");
				break;
			}
			System.out.println("Dou you Want to Continue ? (Y/N)");
			str=sc.next();
		} while (str.equalsIgnoreCase("Y"));
	}

}
