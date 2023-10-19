package com.xworkz.dmartapp.products;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter@Getter@NoArgsConstructor@AllArgsConstructor

public class Products {

    private String productName;
    private int productId;
    private String productType;
    private double productPrice;
    private String manufacturingDate;
    private String expiryDate;
    private double productRating;

}
