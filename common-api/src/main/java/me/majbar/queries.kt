package me.majbar.commonapi

class GetAllCustomerQuery();
data class CustomerById(
    val customerId:String,
);

class GetAllProductQuery();
data class ProductById(
    val productId:String,
);

class GetAllCategoryQuery();
data class CategoryById(
    val categoryId:String,
);

class GetAllOrderQuery();
data class OrderById(
    val orderId:String,
);

class GetAllOrderLineQuery();
data class OrderLineById(
    val orderItemId:String,
);
