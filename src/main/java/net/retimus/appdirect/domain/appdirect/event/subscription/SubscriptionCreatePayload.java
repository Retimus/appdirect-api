package net.retimus.appdirect.domain.appdirect.event.subscription;

import javax.xml.bind.annotation.XmlRootElement;

import lombok.Data;
import lombok.ToString;

import net.retimus.appdirect.domain.appdirect.Company;
import net.retimus.appdirect.domain.appdirect.Order;

@Data
@ToString
@XmlRootElement(name = "payload")
public class SubscriptionCreatePayload {
    private Company company;
    private Order order;
}
