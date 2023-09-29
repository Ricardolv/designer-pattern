package br.com.richard.factory.app.dbadapter.after;

import br.com.richard.factory.app.dbadapter.after.db.DB;
import br.com.richard.factory.app.dbadapter.after.factory.OracleFactory;
import br.com.richard.factory.app.dbadapter.after.factory.PostgresFactory;

public class Client {

	public static void main(String[] args) {

		DB dbOracle = new OracleFactory().getDatabase();
		dbOracle.query("SELECT * FROM users");
		dbOracle.update("INSERT INTO users VALUES ('User', 25)");

		DB dbPostgres = new PostgresFactory().getDatabase();
		dbPostgres.query("SELECT * FROM users");
		dbPostgres.update("INSERT INTO users VALUES ('User', 25)");
	}
}
