package datastructure.search;

public class LinearSearchProductDemo {
	
	public static Product linearSearchById(Product [] products,int id) {
		for(Product product : products){
			if(product.getId() == id) {
				return product;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product [] products = {
				new Product (1,"Laptop",99000.00),
				new Product (2,"Desktp",98000.00),
				new Product (3,"Smart Tv",89000.00),
				new Product (4,"Mobile",59000.00),
				new Product (5,"Speaker",70000.00),

				};
		int searchid=4;
		Product result = linearSearchById(products, searchid);
		if(result != null) {
			System.out.println("product found :" +result);
		}
		else {
			System.out.println("Element Not Found");
		}

	}

}
