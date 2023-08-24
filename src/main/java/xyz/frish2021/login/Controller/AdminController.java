package xyz.frish2021.login.Controller;

import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.core.handle.ModelAndView;

/**
 * &#064;@author: Frish2021
 * &#064;@createTime: 2023/08/24 19:27
 */

@Controller
public class AdminController {
    @Mapping("/admin")
    public ModelAndView admin() {
        return new ModelAndView("/admin/index.html");
    }
}
