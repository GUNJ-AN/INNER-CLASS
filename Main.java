public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(1, "Earbuds", 2500);

        p1.addReview(4.5f, "crisp sound with excellent bass!", "Excellent Bass");
        p1.addReview(3.5f, "good for the price provide best deal in this price range.", "Value for Money");
        p1.addReview(5, "Best earbuds I have ever used!", "Highly Recommend");

        p1.displayReviews(); // Print all reviews

}
}
