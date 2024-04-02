package org.example;

import org.flywaydb.core.Flyway;

public class Database {
    public static void initDatabase() {
        Flyway flyway = Flyway.configure()
                .dataSource("jdbc:h2:~/test", "", null)
                .locations("classpath:db.migration")
                .load();
        flyway.migrate();
    }
}
