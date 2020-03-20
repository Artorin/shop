package ru.boostbr.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @OneToMany
    private List<ThingInOrder> thingInOrders;

    public List<ThingInOrder> getThingInOrders() {
        return thingInOrders;
    }

    public void setThingInOrders(List<ThingInOrder> thingInOrders) {
        this.thingInOrders = thingInOrders;
    }




}
