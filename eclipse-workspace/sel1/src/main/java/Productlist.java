import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Productlist {
	

		public static void main(String[] args) {
			List<Product> list=new ArrayList<Product>();
			
			Product p1=new Product(1000,"laptop",40000.00);
			Product p2=new Product(500,"keyboard",2000.00);
			Product p3=new Product(200,"mouse",500.00);
			Product p4=new Product(1200,"mobile",15000.00);
			
			list.add(p1);
			list.add(p2);
			list.add(p3);
			list.add(p4);
			
			System.out.println("========without sorting=========");
			for(Product prd:list) {
				System.out.println("Product Id: "+prd.productId+" Product Name: "+prd.productName +" Price: "+prd.price);
			}
			
			System.out.println("======== sorting in ascending order =========");
			CompareProduct cp=new CompareProduct();
			Collections.sort(list,cp);
			for(Product prd:list) {
				System.out.println("Product Id: "+prd.productId+" Product Name: "+prd.productName +" Price: "+prd.price);
			}
			
			System.out.println("======== sorting in descending order =========");
			
			Collections.sort(list,Collections.reverseOrder(cp));
			for(Product prd:list) {
				System.out.println("Product Id: "+prd.productId+" Product Name: "+prd.productName +" Price: "+prd.price);
			}
			
			
			System.out.println("======== sorting in ascending order using product name=========");
			Collections.sort(list,new NameCompare());
			for(Product prd:list) {
				System.out.println("Product Id: "+prd.productId+" Product Name: "+prd.productName +" Price: "+prd.price);
			}
			
		}

}
