package Data;

public class CartPagePathData {
    static public String increaseCartBox = "//input[contains(@id, 'ec_quantity_')]\n";
    static public String updateButton = "//div[contains(@id, 'ec_cartitem_update_') and contains(@onclick, 'ec_cartitem_update') and text()='UPDATE']";
    static public String cartProductName = "//tr[contains(@class, 'ec_cartitem_row')]/td[3]/a";
}
