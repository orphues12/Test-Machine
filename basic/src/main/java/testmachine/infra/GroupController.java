package testmachine.infra;
import testmachine.domain.*;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.transaction.Transactional;


@RestController
// @RequestMapping(value="/groups")
@Transactional
public class GroupController {
    @Autowired
    GroupRepository groupRepository;




    @PutMapping("/groups/search/")
    public Object (@RequestBody  query){
        return groupRepository.();
    }
}
