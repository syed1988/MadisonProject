package util;



public class XpathLinks {
	//mainPage xpaths
	public static final String WOMEN_PAGE_XPATH = "//a[@href='http://demo.magentocommerce.com/women.html']"; 
	//TopBlousesPage xpaths
	public static final String TOP_BLOUSES_XPATH = "//*[@class='catblocks']/li[2]/a"; 
	public static final String PRICE = "//a[@href='http://demo.magentocommerce.com/women/tops-blouses.html?price=100-200']";
	public static final String DRESS= "//a[@href='http://demo.magentocommerce.com/women/tops-blouses/black-nolita-cami.html']";
	//Add to cart Page
	public static final String DRESS_COLOR = "attribute92";
	public static final String DRESS_SIZE = "attribute180";
	public static final String QUANTITY= "qty";
	public static final String ADD_TO_CART = "//*[@class='button btn-cart']";
	//checkout Page
	public static final String DISCOUNT = "coupon_code";
	public static final String STATE = "region_id";
	public static final String CITY = "city";
	public static final String ZIP = "postcode";
	public static final String CHECKOUT ="method-checkout-cart-methods-onepage-bottom"; // CLASS
	
	
}
