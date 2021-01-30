package com.app.impl;

import java.util.Scanner;

import com.app.model.AddtoCart;
import com.app.model.Customer;
import com.app.model.ProductEncapsulated;
import com.app.service.ProductOperationInterface;

public class ProductImplementation implements ProductOperationInterface {

	// ProductEncapsulated productEncapsulated = null;
	AddtoCart[] numberofproduct = null;
	ProductEncapsulated prodarr[] = null;
	Scanner scan = new Scanner(System.in);
	Customer customer = null;
	AddtoCart[] addtoCartArr = null;

	@Override
	public void addProduct() {

		System.out.println("How Many Product do you want to add?");
		int num = scan.nextInt();
		prodarr = new ProductEncapsulated[num];
		for (int i = 0; i < num; i++) {

			ProductEncapsulated productEncapsulated = new ProductEncapsulated();
			System.out.println("Enter Prod Id");
			productEncapsulated.setProdId(scan.nextInt());

			System.out.println("Enter product Name");
			productEncapsulated.setProductName(scan.next());

			System.out.println("Enter Product Prize");

			productEncapsulated.setProductPrize(scan.nextDouble());
			prodarr[i] = productEncapsulated;

		}
	}

	@Override
	public void displayeProduct() {

		System.out.println("Product ID | Product Name |  Product Prize");
		for (int i = 0; i < prodarr.length; i++) {
			{
				ProductEncapsulated prod = prodarr[i];
				System.out.println(prod.getProdId() + " | " + prod.getProductName() + " : " + prod.getProductPrize());
			}

		}
	}

	@Override
	public void addtoCart() {
		Boolean flag = Boolean.FALSE;
		customer = new Customer();

		System.out.println("Enter Customer Id");
		customer.setCustId(scan.nextInt());
		System.out.println("Enter Name");
		customer.setCustName(scan.next());
		displayeProduct();

		System.out.println("How Many Product Do you want to buy");

		int prodbuy = scan.nextInt();
		for (int j = 0; j < prodbuy; j++) {

			System.out.println("Select Your Product to Buy");
			int an = scan.nextInt();
			for (int i = 0; i < prodarr.length; i++) {
				if (an == prodarr[i].getProdId()) {
					customer.setProductEncapsulated(prodarr[i]);

					
						System.out.println("Your Final Prize Is : "
								+ (prodarr[i].getProductPrize() + prodarr[i+1].getProductPrize()));

					
					flag = Boolean.TRUE;
				}
				if (flag.equals(Boolean.FALSE))
					System.out.println("Product Not Found");

			}

			System.out.println(customer);

		}
	}
}
