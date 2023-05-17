package testmachine.infra;

import java.util.Optional;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import testmachine.domain.*;

@RestController
// @RequestMapping(value="/groups")
@Transactional
public class GroupController {

    @Autowired
    GroupRepository groupRepository;

    @PutMapping("/groups/search/findByName")
    public Object findByName(@RequestBody GroupViewQuery query) {
        return groupRepository.findByName(query.getName());
    }
}
