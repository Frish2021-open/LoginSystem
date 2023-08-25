package xyz.frish2021.login.Controller.api;

import org.apache.ibatis.solon.annotation.Db;
import org.noear.solon.annotation.Controller;
import org.noear.solon.annotation.Get;
import org.noear.solon.annotation.Mapping;
import org.noear.solon.annotation.Param;
import org.noear.solon.core.handle.Context;
import xyz.frish2021.login.dao.LoginDao;
import xyz.frish2021.login.dao.RegisterDao;

import java.util.Arrays;
import java.util.List;

/**
 * &#064;@author: Frish2021
 * &#064;@createTime: 2023/08/24 13:01
 */

@Controller
@Mapping("/api/v1")
public class ApiController {
    @Db("db_1")
    RegisterDao registerDao;

    @Db("db_1")
    LoginDao loginDao;

    @Get
    @Mapping("/login")
    public String login(Context ctx) {
        String username = ctx.param("username");
        String password = ctx.param("password");
        if (!(username.isEmpty() || password.isEmpty())) {
            if (exist(loginDao.getUserList(), username)) {
                if (password.equals(loginDao.getPassword(username))) {
                    ctx.cookieSet("isLogin", "true", 86400);
                    ctx.outputAsHtml("<script>window.location.href = '/admin'; alert(\"登录成功：)\");</script>");
                } else {
                    ctx.outputAsHtml("<script>window.location.href = '/'; alert(\"错误！！！你输入的密码和该账号的密码不符，请联系数据库管理员修改密码：（\");</script>");
                }
            } else {
                ctx.outputAsHtml("<script>window.location.href = '/'; alert(\"错误！！！你好像没有注册该账号：（\");</script>");
            }
        } else {
            ctx.outputAsHtml("<script>window.location.href = '/'; alert(\"错误！！！你好像没有完成表单：（\");</script>");
        }
        return null;
    }

    @Get
    @Mapping("/register")
    public String register(Context ctx) {
        String username = ctx.param("username");
        String password = ctx.param("password");
        String passwordc = ctx.param("passwordc");
        if (!(username.isEmpty() || password.isEmpty())) {
            if (passwordc.equals(password)) {
                if (!exist(registerDao.getUserList(), username)) {
                    registerDao.addUser(username, password);
                    ctx.outputAsHtml("<script>window.location.href = '/'; alert(\"注册成功，正在返回登录页面：）\");</script>");
                } else {
                    ctx.outputAsHtml("<script>window.location.href = '/register'; alert(\"错误！！！你设置的用户名已经被占用了：（\");</script>");
                }
            } else {
                ctx.outputAsHtml("<script>window.location.href = '/register'; alert(\"错误！！！你的确认密码和设置密码不一样：（\");</script>");
            }
        } else {
            ctx.outputAsHtml("<script>window.location.href = '/register'; alert(\"错误！！！你好像没有完成表单：（\");</script>");
        }
        return null;
    }

    public boolean exist(List<String > list, String names) {
        boolean nameExist = false;
        for(String name : list) {
            if(names.equals(name)) {
                nameExist = true;
            }
        }
        return nameExist;
    }
}
