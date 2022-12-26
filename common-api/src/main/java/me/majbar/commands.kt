package me.majbar.commonapi

import org.axonframework.modelling.command.TargetAggregateIdentifier




abstract class BaseCommand<T>(
    @TargetAggregateIdentifier open val id : T
);
//**********************Customer********************************//
data class CreateNewCustomerCommand(
    override val id : String,
    val payload : CustomerDTO,
) : BaseCommand<String>(id);

data class ModifyCustomerCommand(
    override val id : String,
    val payload : CustomerDTO,
) : BaseCommand<String>(id);

data class DeleteCustomerCommand(
    override val id : String,
) : BaseCommand<String>(id);

//**********************Product********************************//
data class CreateNewProductCommand(
    override val id : String,
    val payload : ProductDTO,
) : BaseCommand<String>(id);

data class ModifyProductCommand(
    override val id : String,
    val payload : ProductDTO,
) : BaseCommand<String>(id);

data class DeleteProductCommand(
    override val id : String,
) : BaseCommand<String>(id);

data class ChangeProductStatusCommand(
    override val id : String,
    val payload : ProductStatus,
) : BaseCommand<String>(id);

//**********************Category********************************//
data class CreateNewCategoryCommand(
    override val id : String,
    val payload : CategoryDTO,
) : BaseCommand<String>(id);

data class ModifyCategoryCommand(
    override val id : String,
    val payload : CategoryDTO,
) : BaseCommand<String>(id);

data class DeleteCategoryCommand(
    override val id : String,
) : BaseCommand<String>(id);

//**********************Order********************************//

data class CreateNewOrderCommand(
    override val id : String,
    val payload : OrderDTO,
) : BaseCommand<String>(id);

data class ModifyOrderCommand(
    override val id : String,
    val payload : OrderDTO,
) : BaseCommand<String>(id);

data class DeleteOrderCommand(
    override val id : String,
) : BaseCommand<String>(id);

//**********************OrderLine********************************//

data class CreateNewOrderLineCommand(
    override val id : String,
    val payload : OrderLineDTO,
) : BaseCommand<String>(id);

data class ModifyOrderLineCommand(
    override val id : String,
    val payload : OrderLineDTO,
) : BaseCommand<String>(id);

data class DeleteOrderLineCommand(
    override val id : String,
) : BaseCommand<String>(id);