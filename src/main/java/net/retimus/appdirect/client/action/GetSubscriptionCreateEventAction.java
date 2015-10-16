package net.retimus.appdirect.client.action;

import net.retimus.appdirect.client.AppDirectClient;
import net.retimus.appdirect.domain.appdirect.event.subscription.SubscriptionCreateEvent;

public class GetSubscriptionCreateEventAction extends GetEventAction {

    public GetSubscriptionCreateEventAction(final AppDirectClient client) {
        super(client);
    }

    public ActionResult<SubscriptionCreateEvent> execute() {
        return execute(SubscriptionCreateEvent.class);
    }
}
