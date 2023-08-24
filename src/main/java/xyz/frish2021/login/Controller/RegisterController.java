package xyz.frish2021.login.Controller;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.ModelAndView;

/**
 * &#064;@author: Frish2021
 * &#064;@createTime: 2023/08/24 12:59
 */

@Controller
public class RegisterController {
    @Mapping("/register")
    public ModelAndView login() {
        return new ModelAndView("/register.html");
    }
}
