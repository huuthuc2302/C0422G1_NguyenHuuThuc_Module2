package products.products_uliti;

import products.products_model.Products;

import java.util.List;

public class IncreaseIDProduct {

    private static final String PATH_FILE_PRODUCTS = "src/products/products_data/Products.csv";

    public static int increaseID() {

        List<Products> productsList = ReadAndWriteProduct.readProductsList(PATH_FILE_PRODUCTS);
        int id;
        if (productsList.isEmpty()) id = 1;
        else {
            boolean flag;
            do {
                flag = false;
                id = Integer.parseInt(productsList.get(productsList.size() - 1).getId()) + 1;
                for (Products c : productsList) {
                    if (Integer.parseInt(c.getId()) == id) {
                        id++;
                        flag = true;
                    }
                }
            } while (flag);
        }
        return id;
    }
}
