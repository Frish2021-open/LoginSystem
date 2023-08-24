package xyz.frish2021.login;

import org.apache.ibatis.solon.annotation.Db;
import org.noear.solon.Solon;
import org.noear.solon.annotation.Component;
import org.noear.solon.annotation.Inject;
import org.noear.solon.annotation.SolonMain;
import org.noear.solon.core.bean.LifecycleBean;
import xyz.frish2021.login.dao.SQLInitiativeDao;

@SolonMain
@Component
public class LoginDemoApp implements LifecycleBean {
    @Db("db_1")
    SQLInitiativeDao initiativeDao;

    public static void main(String[] args) {
        Solon.start(LoginDemoApp.class, args, (app) -> {});
    }

    @Override
    public void start() throws Throwable {
        initiativeDao.createDataSource();
        initiativeDao.uesDb();
        initiativeDao.createTable();
    }
}