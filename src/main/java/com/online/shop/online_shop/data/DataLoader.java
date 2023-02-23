package com.online.shop.online_shop.data;

import com.online.shop.online_shop.model.AvailabilityType;
import com.online.shop.online_shop.model.Order;
import com.online.shop.online_shop.model.Product;
import com.online.shop.online_shop.services.OrderService;
import com.online.shop.online_shop.services.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    private final ProductService productService;
    private final OrderService orderService;

    public DataLoader(ProductService productService, OrderService orderService) {
        this.productService = productService;
        this.orderService = orderService;
    }

    @Override
    public void run(String... args) throws Exception {
        int count=productService.findAll().size();
        if(count==0){
            loadData();
        }
    }

    public void loadData(){
        Product product1 =new Product();
        product1.setName("Baume & Mercier");
        product1.setDescription("Amazing Baume & Mercier Mauboussin 18k Ref. 38260");
        product1.setPrice(799.99);
        product1.setAvailability(AvailabilityType.AVAILABLE);
        productService.save(product1);


        Product product2=new Product();
        product2.setName("Omega");
        product2.setDescription("Amazing Omega Constellation Chronometer 14k gold&steel");
        product2.setPrice(999.99);
        product2.setAvailability(AvailabilityType.AVAILABLE);
        productService.save(product2);


        Product product3=new Product();
        product3.setName("Omega");
        product3.setDescription("Amazing Omega De Ville Co Axial Power Reserve");
        product3.setPrice(7699.99);
        product3.setAvailability(AvailabilityType.AVAILABLE);
        productService.save(product3);


        Product product4=new Product();
        product4.setName("Jaeger-LeCoultre");
        product4.setDescription("Amazing Jaeger-LeCoultre Reverso Grande Taille 18k");
        product4.setPrice(9199.00);
        product4.setAvailability(AvailabilityType.UNAVAILABLE);
        productService.save(product4);


        Product product5=new Product();
        product5.setName("Audemars Piguet");
        product5.setDescription("Amazing Audemars Piguet Automatic 18K Ref. BA14406");
        product5.setPrice(7999.99);
        product5.setAvailability(AvailabilityType.UNAVAILABLE);
        productService.save(product5);


        Product product6=new Product();
        product6.setName("Vacheron Constantin");
        product6.setDescription("Amazing Vacheron Constantin 18k Ref. 6732");
        product6.setPrice(8888.00);
        product6.setAvailability(AvailabilityType.AVAILABLE);
        productService.save(product6);


        Order order=new Order();
        order.setProductName("Control");
        orderService.save(order);





    }
}
