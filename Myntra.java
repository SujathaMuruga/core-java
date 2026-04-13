class Myntra {
    String product; 
	String category;
	String brand;
    int price;
	int rating; 
	int stock; 
	int reviews;

    Myntra(String product, String category, String brand,
           int price, int rating, int stock, int reviews) {
        this.product = product;
        this.category = category;
        this.brand = brand;
        this.price = price;
        this.rating = rating;
        this.stock = stock;
        this.reviews = reviews;
    }

public void display(){
		System.out.println(product);
		System.out.println(category);
		System.out.println(brand);
		System.out.println(price);
		System.out.println(rating);
		System.out.println(stock);
		System.out.println(reviews);
    }
}