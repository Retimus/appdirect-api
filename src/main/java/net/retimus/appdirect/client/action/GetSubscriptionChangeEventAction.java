package net.retimus.appdirect.client.action;

import net.retimus.appdirect.client.AppDirectClient;
import net.retimus.appdirect.domain.appdirect.event.subscription.SubscriptionChangeEvent;

public class GetSubscriptionChangeEventAction extends GetEventAction {

    public GetSubscriptionChangeEventAction(final AppDirectClient client) {
        super(client);
    }

    public ActionResult<SubscriptionChangeEvent> execute() {
        return execute(SubscriptionChangeEvent.class);
    }
}
