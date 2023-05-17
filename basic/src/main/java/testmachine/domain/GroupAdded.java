package testmachine.domain;

import java.util.*;
import lombok.*;
import testmachine.domain.*;
import testmachine.infra.AbstractEvent;

@Data
@ToString
public class GroupAdded extends AbstractEvent {

    private Long id;
    private String name;

    public GroupAdded(Group aggregate) {
        super(aggregate);
    }

    public GroupAdded() {
        super();
    }
}
