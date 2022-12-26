package ma.majbar.customercommandsservice.aggregates;


import lombok.extern.slf4j.Slf4j;
import me.majbar.commonapi.CreateNewCustomerCommand;
import me.majbar.commonapi.CustomerCreatedEvent;
import me.majbar.commonapi.CustomerModifiedEvent;
import me.majbar.commonapi.ModifyCustomerCommand;
import org.axonframework.commandhandling.CommandHandler;
import org.axonframework.eventsourcing.EventSourcingHandler;
import org.axonframework.modelling.command.AggregateIdentifier;
import org.axonframework.modelling.command.AggregateLifecycle;
import org.axonframework.modelling.command.AggregateMember;
import org.axonframework.spring.stereotype.Aggregate;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Aggregate
@Slf4j
public class CustomerAggregate {
    @AggregateIdentifier
    private String CustomerId;
    private String nom;
    private String address;
    private String mail;
    private String tel;

    public CustomerAggregate() {

    }
    @CommandHandler
    public CustomerAggregate(CreateNewCustomerCommand command) {
        log.info("CreateNewCustomerCommand received");
        AggregateLifecycle.apply(new CustomerCreatedEvent(
                command.getId(),
                command.getPayload()
        ));
    }
    @EventSourcingHandler
    public void on(CreateNewCustomerCommand event){
        log.info("RadarCreatedEvent occured");
        this.CustomerId=event.getId();
        this.nom = event.getPayload().getName();
        this.address = event.getPayload().getAddress();
        this.mail = event.getPayload().getEmail();
        this.tel = event.getPayload().getPhone();
    }
    @CommandHandler
    public CustomerAggregate(ModifyCustomerCommand command) {
        log.info("EditCustomerCommand received");
        AggregateLifecycle.apply(new CustomerModifiedEvent(
                command.getId(),
                command.getPayload()
        ));
    }
    @EventSourcingHandler
    public void on(CustomerModifiedEvent event){
        log.info("EditCustomerCommand occured");
        this.CustomerId=event.getId();
        this.address = event.getPayload().getAddress();
        this.mail = event.getPayload().getEmail();
        this.tel = event.getPayload().getPhone();
    }



}
