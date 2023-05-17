package testmachine.domain;

import java.util.*;
import lombok.*;
import testmachine.domain.*;
import testmachine.infra.AbstractEvent;

@Data
@ToString
public class MachineAdded extends AbstractEvent {

    private Long id;
    private String name;
    private String modelName;
    private String type;

    public MachineAdded(Machine aggregate) {
        super(aggregate);
    }

    public MachineAdded() {
        super();
    }
}
