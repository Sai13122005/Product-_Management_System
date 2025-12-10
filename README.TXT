## 📦 Product Management System README

This repository contains a simple Java implementation of a **Generic Product Management System** using the concepts of **Generics** and the **Java Collections Framework** (`Map` and `List`).

The system is composed of three main classes: `Product.java`, `ProductManager.java`, and `ProductDemo.java`.

---

### 📂 File Structure

* **`Product.java`**: Defines the generic structure for a product entity.
* **`ProductManager.java`**: Manages a collection of `Product` objects, providing methods for addition, retrieval, and searching.
* **`ProductDemo.java`**: Contains the `main` method to demonstrate the functionality of the `Product` and `ProductManager` classes.

---

### 📝 Class Descriptions

#### 1. `Product.java`

This class represents a single product. It uses a **generic type parameter `<T>`** for the product's **category**, allowing the category to be of any type.

| Field | Type | Description |
| :--- | :--- | :--- |
| `productId` | `String` | Unique identifier for the product. |
| `name` | `String` | Name of the product. |
| `price` | `double` | Price of the product. |
| `category` | `T` | The category of the product, using a generic type. |

**Key Methods:**

* **Constructor:** Initializes a new `Product` object.
* **Accessors (Getters) and Mutators (Setters):** Standard methods for accessing and modifying the private fields.
* **`getProductDetails()`:** Returns a formatted string containing all product information.

#### 2. `ProductManager.java`

This class is a generic utility class responsible for managing a collection of `Product<T>` objects. It uses a `Map<String, Product<T>>` (specifically a `HashMap`) to store products, where the **key is the `productId`** for fast lookup.

**Key Methods:**

* **`ProductManager()`:** Initializes the internal `HashMap`.
* **`addProduct(Product<T> product)`:** Adds a product to the manager, using its ID as the map key.
* **`getProduct(String productId)`:** Retrieves a product using its ID.
* **`getProductsByCategory(T category)`:** Returns a `List` of products that belong to the specified category.
* **`findProductsInPriceRange(double min, double max)`:** Returns a `List` of products whose price falls within the given range.
* **`getProducts()`:** Returns the internal map of all products.

#### 3. `ProductDemo.java`

This class serves as the **driver program** to showcase how to use the `ProductManager` and `Product` classes.

* It creates a `ProductManager` instance, explicitly using `String` as the category type (`ProductManager<String>`).
* It adds several sample products across "Electronics", "Groceries", and "Clothing" categories.
* It demonstrates the use of all `ProductManager` methods:
    * Retrieving all products.
    * Searching for a product by ID (user input required).
    * Retrieving lists of products by specific categories (Electronics, Clothing, Groceries).
    * Searching for products within a price range (user input required).
* Finally, it prints some basic **statistics** (total products, count per category).

---

### ▶️ How to Run

1.  **Compile:** Compile all three Java files (`Product.java`, `ProductManager.java`, `ProductDemo.java`).
    ```bash
    javac Product.java ProductManager.java ProductDemo.java
    ```
2.  **Run:** Execute the `ProductDemo` class.
    ```bash
    java ProductDemo
    ```

The program will first output the details of all added products, then prompt the user to **enter a Product ID** and a **price range** to search for products.

PROJECT TITLE:Product Management
PURPOSE OF PROJECT: to manage product 
VERSION or DATE: 8/12/2025
AUTHORS: Saikrishna
