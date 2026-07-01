import java.util.Arrays;
import java.util.Comparator;

public class SearchAlgorithms {

    // Minimal Product class to resolve type during compilation.
    // If a separate Product class exists elsewhere in the project,
    // you can remove this inner class.
    public static class Product {
        private int productId;

        public Product(int productId) {
            this.productId = productId;
        }

        public int getProductId() {
            return productId;
        }
    }

    // Linear Search
    public static Product linearSearch(Product[] products, int id) {

        for (Product product : products) {
            if (product.getProductId() == id) {
                return product;
            }
        }

        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, int id) {

        int low = 0;
        int high = products.length - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            if (products[mid].getProductId() == id) {
                return products[mid];
            }

            if (products[mid].getProductId() < id) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    // Sort products by Product ID
    public static void sortProducts(Product[] products) {

        Arrays.sort(products, Comparator.comparingInt(Product::getProductId));

    }
}