package me.majbar.commonapi

import java.time.Instant

data class CustomerDTO(
    var customerId : String ="",
    var name : String="",
    var address : String="",
    var email : String="",
    var phone : String="",
    );
data class EventDataResponseDTO<T>(
    var type : String="",
    var eventData : T ,
);

data class EditCustomerDTO(
    var customerId : String ="",
    var name : String="",
    var address : String="",
    var email : String="",
    var phone : String="",
);
data class ProductDTO(
    var productId : String ="",
    var name : String="",
    var price : Double=0.0,
    var quantity : Int=0,
    var status: ProductStatus=ProductStatus.Disponible
    );
data class CategoryDTO(
    var categoryId : String ="",
    var name : String="",
    var description : String="",
    );
data class OrderDTO(
    var orderId : String ="",
    var customerId : String ="",
    var products : List<OrderLineDTO> = emptyList(),
    var orderDate : Instant = Instant.now(),
    var deliveryDate : Instant = Instant.now()
    );


data class OrderLineDTO(
    var orderLineId : String ="",
    var orderId : String ="",
    var productId : String ="",
    var quantity : Int=0,
    var price : Double=0.0,
    var discount : Double=0.0
    );