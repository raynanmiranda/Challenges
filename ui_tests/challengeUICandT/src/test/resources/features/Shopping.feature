Feature: Shopping

  @AddProductOnCart-HomePage
  Scenario: Add product to Cart - HomePage

    Given Add the product of homePage to cart
     Then Will be able to see the product on Cart

  @AddProductOnCart-HomePageQuickView
  Scenario: Add product to Cart - Home Page Quick View

    Given Access quick view of product on homePage
     When Add the product on quick view
     Then Will be able to see the product on Cart

  @AddReviewByProductDetails
  Scenario: Add Review By Product Details

    Given Is on the Login Page
      And Have already sign in
      And Is on product Details
     When Add the review on product
     Then Will be able to see the review on product

  @AddProductWishList-ProductDetails
  Scenario: Add product to wishList on product Details

    Given Is on the Login Page
      And Have already sign in
      And Is on product Details
     When Add the product to wish List
     Then Will be able to see the product wishList

  @RemoveProductWishList-ProductDetails
  Scenario: Remove product to wishList on product Details

    Given Is on the Login Page
      And Have already sign in
      And Is on product Details
      And have already a product on wishList
     When Remove the product
     Then Will Remove the product on wishList successfuly

  @BuyProductWithSuccess
  Scenario: Finalize the purchase of a product - BankWire Payment

    Given Is on the Login Page
      And Have already sign in
      And Have a product on cart
     When Finish the proccess of payment
     Then Will buy the product with success