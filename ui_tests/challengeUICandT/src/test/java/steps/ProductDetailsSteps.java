package steps;

import net.thucydides.core.annotations.Step;
import pages.HomePage;
import pages.MyAccountPage;
import pages.ProductDetailsPage;
import pages.WishListPage;

import static junit.framework.TestCase.assertTrue;

public class ProductDetailsSteps {

    HomePage homePg;
    ProductDetailsPage productDetailPg;
    MyAccountPage myAccountPg;
    WishListPage wishListPg;

    private String product = "";

    @Step("Is on product Details")
    public void is_on_product_Details() {

        product = "Blouse";
        homePg.clickBtnHomePage();
        homePg.clickBtnMore(product);
    }

    @Step("Add the review on product")
    public void add_the_review_on_product() {

        productDetailPg.clickBtnWriteReview();
        productDetailPg.insertTitleField("testNewReview");
        productDetailPg.insertCommentField("Something test detail product");
        productDetailPg.setStarQualityChe("5");
        productDetailPg.clickBtnSubmitReview();
    }

    @Step("Will be able to see the review on product")
    public void will_be_able_to_see_the_review_on_product() {

        assertTrue("Review won't send! please check",
                productDetailPg.getValidateMgdReviewAddedSuccess().equalsIgnoreCase(
                        "Your comment has been added and will be available once approved by a moderator"));
    }

    @Step("Add the product to wish List")
    public void add_the_product_to_wish_List() {

        productDetailPg.clickBtnAddProductWishList();
        assertTrue(productDetailPg.getValidateMgsProductAddWishList().equalsIgnoreCase("Added to your wishlist."));
        productDetailPg.clickBtnCloseMgsProductAddWishList();
    }

    @Step("Will be able to see the product wishList")
    public void will_be_able_to_see_the_product_wishList() {

        homePg.clickBtnManageAccount();
        myAccountPg.clickBtnMyWishList();
        wishListPg.clickBtnWishLitView();
        assertTrue("Product not Found on the wish List!",wishListPg.getValidatePresenceProductWishList(product));
    }

    @Step("^have already a product on wishList$")
    public void have_already_a_product_on_wishList() {

        productDetailPg.clickBtnAddProductWishList();
        assertTrue(productDetailPg.getValidateMgsProductAddWishList().equalsIgnoreCase("Added to your wishlist."));
        productDetailPg.clickBtnCloseMgsProductAddWishList();
    }

    @Step("^Remove the product$")
    public void remove_the_product() {

        homePg.clickBtnManageAccount();
        myAccountPg.clickBtnMyWishList();
        wishListPg.clickBtnRemoveProductsWishList();
        wishListPg.confirmRemoveProductWishListPopUp();
    }

    @Step("^Will Remove the product on wishList successfuly$")
    public void will_Remove_the_product_on_wishList_successfuly() {

        assertTrue("Product not removed of wishList",!(wishListPg.getValidatePresenceProductWishList(product)));
    }
}
