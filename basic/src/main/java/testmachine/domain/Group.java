package testmachine.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.context.ApplicationContext;
import testmachine.BasicApplication;
import testmachine.domain.GroupAdded;

@Entity
@Table(name = "Group_table")
@Data
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @PostPersist
    public void onPostPersist() {
        GroupAdded groupAdded = new GroupAdded(this);
        groupAdded.publishAfterCommit();
    }

    public static GroupRepository repository() {
        GroupRepository groupRepository = applicationContext()
            .getBean(GroupRepository.class);
        return groupRepository;
    }

    public static ApplicationContext applicationContext() {
        return BasicApplication.applicationContext;
    }
}
