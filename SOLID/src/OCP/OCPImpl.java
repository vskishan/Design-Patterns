package OCP;

import java.util.List;

public class OCPImpl {
    public static void main(String[] args){

        //Defining the Product Specs
        Product apple = new Product("Apple",Color.WHITE,Size.SMALL);
        Product vivo = new Product("Vivo",Color.RED,Size.LARGE);
        Product samsung = new Product("Samsung",Color.WHITE,Size.LARGE);

        List<Product> productList = List.of(apple,vivo,samsung);
        BasicProductFilter bpf = new BasicProductFilter();

        //Basic Filter without OCP
        System.out.println("Before OCP:");

        //Applying the Filter for Color
        bpf.colorFilter(productList,Color.WHITE).forEach(product -> System.out.println(product.name+" is White"));

        //Applying the Filter for Size
        bpf.sizeFilter(productList,Size.LARGE).forEach(product -> System.out.println(product.name+" is Large"));

        //Applying the Filter for Color And Size
        bpf.colorAndSizeFilter(productList,Color.RED,Size.LARGE).forEach(product -> System.out.println(product.name+" is Red and Large"));


        //Better Filter with OCP
        System.out.println();
        System.out.println("After OCP:");

        BetterFilter bf = new BetterFilter();

        //Applying the Filter for Color
        bf.specFilter(productList,new ColorSpecification(Color.WHITE))
                .forEach(product -> System.out.println(product.name+" is White"));

        //Applying the Filter for Size
        bf.specFilter(productList,new SizeSpecification(Size.LARGE))
                .forEach(product -> System.out.println(product.name+" is Large"));

        //Applying the Filter for Color And Size
        bf.specFilter(productList,new MultiSpecification(new ColorSpecification(Color.RED),new SizeSpecification(Size.LARGE)))
                .forEach(product -> System.out.println(product.name+" is Red and Large"));
    }
}
