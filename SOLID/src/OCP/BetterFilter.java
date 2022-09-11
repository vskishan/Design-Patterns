package OCP;

import java.util.List;
import java.util.stream.Stream;

//Better Filter using OCP
public class BetterFilter {

    public Stream<Product> specFilter(List<Product> products,Specification<Product> specification){
        return products.stream().filter(product -> specification.isSatisfied(product));
    }
}
