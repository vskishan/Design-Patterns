package OCP;

public interface Specification<Product> {
    boolean isSatisfied(Product product);
}
