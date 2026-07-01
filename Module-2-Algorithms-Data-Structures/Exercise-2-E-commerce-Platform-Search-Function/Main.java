class Product {
    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                '}';
    }
}

class SearchAlgorithms {
    static Product linearSearch(Product[] products, int id) {
        for (Product product : products) {
            if (product.id == id) {
                return product;
            }
        }
        return null;
    }

    static void sortProducts(Product[] products) {
        for (int i = 0; i < products.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < products.length; j++) {
                if (products[j].id < products[minIndex].id) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                Product temp = products[i];
                products[i] = products[minIndex];
                products[minIndex] = temp;
            }
        }
    }

    static Product binarySearch(Product[] products, int id) {
        int left = 0;
        int right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (products[mid].id == id) {
                return products[mid];
            }
            if (products[mid].id < id) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return null;
    }
}

public class Main {

    public static void main(String[] args) {

        Product[] products = {

                new Product(104, "Laptop", "Electronics"),
                new Product(101, "Shoes", "Fashion"),
                new Product(106, "Watch", "Accessories"),
                new Product(102, "Phone", "Electronics"),
                new Product(105, "Bag", "Fashion"),
                new Product(103, "Headphones", "Electronics")

        };

        System.out.println("----- Linear Search -----");

        Product result = SearchAlgorithms.linearSearch(products, 105);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");

        // Sort before Binary Search
        SearchAlgorithms.sortProducts(products);

        System.out.println("\n----- Binary Search -----");

        result = SearchAlgorithms.binarySearch(products, 105);

        if (result != null)
            System.out.println(result);
        else
            System.out.println("Product Not Found");

        System.out.println("\nTime Complexity");
        System.out.println("Linear Search : O(n)");
        System.out.println("Binary Search : O(log n)");
    }
}