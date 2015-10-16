package net.retimus.appdirect.client.action;

import net.retimus.appdirect.client.AppDirectClient;
import net.retimus.appdirect.domain.appdirect.event.access.UserAssignedEvent;

public class GetUserAssignedEventAction extends GetEventAction {

    public GetUserAssignedEventAction(final AppDirectClient client) {
        super(client);
    }

    public ActionResult<UserAssignedEvent> execute() {
        return super.execute(UserAssignedEvent.class);
    }
}
