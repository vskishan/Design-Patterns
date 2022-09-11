package OCP;

public class MultiSpecification implements Specification<Product>{

    private Specification<Product> first ,second;

    public MultiSpecification(Specification<Product> first,Specification<Product> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(Product product) {
        return first.isSatisfied(product) && second.isSatisfied(product);
    }
}
