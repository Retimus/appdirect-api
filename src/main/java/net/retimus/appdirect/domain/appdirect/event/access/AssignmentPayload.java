package net.retimus.appdirect.domain.appdirect.event.access;

import lombok.Data;
import lombok.ToString;

import net.retimus.appdirect.domain.appdirect.Account;
import net.retimus.appdirect.domain.appdirect.User;

@Data
@ToString
public class AssignmentPayload {
    Account account;
    User user;
}
