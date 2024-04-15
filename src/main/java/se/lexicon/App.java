package se.lexicon;

import java.util.ArrayList;
import java.util.List;

public class App
{
    public static void main( String[] args )
    {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Iphone",10000.00,10));
        products.add(new Product("Samsung",9000.00,14));
        products.add(new Product("Motorola",6000.00,0));
        products.add(new Product("Sonny",8000.00,5));
        products.add(new Product("Headset",200.00,50));
        products.add(new Product("Mouse",150.00,25));
        products.add(new Product("Keyboard",100.00,25));

        //Print out all Products that have stock value of 0.
        //Lambda () ->   ;
        //Lambda (p) -> p.getStock() == 0;
        Conditional conditionalForStockZero = (p) -> p.getStock() == 0;
        // Action - print the product list
        //Lambda () ->   ;
        //Lambda (p) -> System.out.println(p.toString());;
        Action printProduct = (p) -> System.out.println(p.toString());

        // Call the method process which have 3 param - product list,condition and action
        process(products,conditionalForStockZero,printProduct);

        //Print out the productName of all the Products that starts with M.
        // using the same method --process but we use lambda in the the method
        // condition (p) -> p.getName().startsWith("B")
        // action (p) -> System.out.println(p.getName()))

        process(products, (p) -> p.getName().startsWith("M"), (p) -> System.out.println(p.getName()));


        // Print out all Products that have price above 11 000 AND lower than 6000
        Conditional conditionalPrice = (p) -> p.getPrice() > 6000 && p.getPrice() < 11000 ;
        Action printProducts = (p) -> System.out.println(p.toString());
        process(products,conditionalPrice,printProducts);


        //Increase the price of all Products that have a stock value of less than 10 (0-10)
        // AND above 0 by 50%

        Conditional conditionalStock = (p) -> p.getStock() < 10 && p.getStock() > 0;
        Action setPrice = (p) -> p.setPrice(p.getPrice() * 1.5);
        process(products,(p) -> p.getStock() < 10 && p.getStock() > 0,(p) -> p.setPrice(p.getPrice() * 1.5));
        System.out.println(products);
    }


    public static void process(List<Product> list,Conditional conditional,Action action){
        //Method should iterate though the List
        // and apply a filter using the Conditional.
        // On each Product passing the filter you apply the Action.

        //Iterate on products list ---for
        for (Product product : list){
            //apply filter using the conditional ---if
            if(conditional.test(product)){
                //action
                action.execute(product);
            }

        }
    }

    }

