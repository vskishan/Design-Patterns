package OCP;

import java.util.List;
import java.util.stream.Stream;

//This is Filter Class without OCP
public class BasicProductFilter {

    public Stream<Product> colorFilter(List<Product> products , Color color){
        return products.stream().filter(product -> product.color==color);
    }

    public Stream<Product> sizeFilter(List<Product> products , Size size){
        return products.stream().filter(product -> product.size==size);
    }

    public Stream<Product> colorAndSizeFilter(List<Product> products , Color color , Size size){
        return products.stream().filter(product -> product.color==color && product.size==size);
    }
}
