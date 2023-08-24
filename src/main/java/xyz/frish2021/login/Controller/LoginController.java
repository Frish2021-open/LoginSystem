package xyz.frish2021.login.Controller;

import org.apache.ibatis.solon.annotation.Db;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.ModelAndView;
import xyz.frish2021.login.dao.SQLInitiativeDao;

/**
 * &#064;@author: Frish2021
 * &#064;@createTime: 2023/08/24 12:59
 */

@Controller
public class LoginController {
    @Mapping("/")
    public ModelAndView login() {
        return new ModelAndView("/index.html");
    }
}
