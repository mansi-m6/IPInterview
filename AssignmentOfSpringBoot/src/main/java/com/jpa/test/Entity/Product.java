package com.jpa.test.Entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Product {
		
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int ProductID;
		private String ProductName;
		private LocalDate ItemManufacturingDate ;
		private LocalDate ItemExpiryDate ;
		private float Price;
		
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Product(int productID, String productName, LocalDate itemManufacturingDate, LocalDate itemExpiryDate,
				float price) {
			super();
			ProductID = productID;
			ProductName = productName;
			ItemManufacturingDate = itemManufacturingDate;
			ItemExpiryDate = itemExpiryDate;
			Price = price;
		}

		public int getProductID() {
			return ProductID;
		}

		public void setProductID(int productID) {
			ProductID = productID;
		}

		public String getProductName() {
			return ProductName;
		}

		public void setProductName(String productName) {
			ProductName = productName;
		}

		public LocalDate getItemManufacturingDate() {
			return ItemManufacturingDate;
		}

		public void setItemManufacturingDate(LocalDate itemManufacturingDate) {
			ItemManufacturingDate = itemManufacturingDate;
		}

		public LocalDate getItemExpiryDate() {
			return ItemExpiryDate;
		}

		public void setItemExpiryDate(LocalDate itemExpiryDate) {
			ItemExpiryDate = itemExpiryDate;
		}

		public float getPrice() {
			return Price;
		}

		public void setPrice(float price) {
			Price = price;
		}

		@Override
		public String toString() {
			return "Product [ProductID=" + ProductID + ", ProductName=" + ProductName + ", ItemManufacturingDate="
					+ ItemManufacturingDate + ", ItemExpiryDate=" + ItemExpiryDate + ", Price=" + Price + "]";
		}
		
		
		
		
		
		

}
