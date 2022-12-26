package me.majbar.commonapi

abstract class BaseEvent<T> (
    open val id: T
);
data class CustomerCreatedEvent(
    override val id : String,
    val payload:CustomerDTO
):BaseCommand<String>(id);

data class CustomerModifiedEvent(
    override val id : String,
    val payload:CustomerDTO
):BaseCommand<String>(id);

data class CustomerDeletedEvent(
    override val id : String,
):BaseCommand<String>(id);

data class ProductCreatedEvent(
    override val id : String,
    val payload:ProductDTO
):BaseCommand<String>(id);

data class ProductModifiedEvent(
    override val id : String,
    val payload:ProductDTO
):BaseCommand<String>(id);

data class ProductDeletedEvent(
    override val id : String,
):BaseCommand<String>(id);

data class ProductStatusChangedEvent(
    override val id : String,
    val payload:ProductStatus
):BaseEvent<String>(id);

data class CategoryCreatedEvent(
    override val id : String,
    val payload:CategoryDTO
):BaseCommand<String>(id);

data class CategoryModifiedEvent(
    override val id : String,
    val payload:CategoryDTO
):BaseCommand<String>(id);

data class CategoryDeletedEvent(
    override val id : String,
):BaseCommand<String>(id);


data class OrderCreatedEvent(
    override val id : String,
    val payload:OrderDTO
):BaseCommand<String>(id);

data class OrderModifiedEvent(
    override val id : String,
    val payload:OrderDTO
):BaseCommand<String>(id);

data class OrderDeletedEvent(
    override val id : String,
):BaseCommand<String>(id);

data class OderLineCreatedEvent(
    override val id : String,
    val payload:OrderLineDTO
):BaseCommand<String>(id);

data class OderLineModifiedEvent(
    override val id : String,
    val payload:OrderLineDTO
):BaseCommand<String>(id);

data class OderLineDeletedEvent(
    override val id : String,
):BaseCommand<String>(id);



