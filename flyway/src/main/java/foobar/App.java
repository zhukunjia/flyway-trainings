package foobar;

import org.flywaydb.core.Flyway;

public class App {
    public static void main(String[] args) {
        // 创建Flyway实例
        Flyway flyway = new Flyway();
        // 设置数据库
        flyway.setDataSource("jdbc:mysql://localhost:3306/flyway", "root", "zkj");
        // 开始迁移
        flyway.migrate();
    }
}
