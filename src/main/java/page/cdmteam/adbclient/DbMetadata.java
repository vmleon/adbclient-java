package page.cdmteam.adbclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Service;

@Service
public class DbMetadata {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public Database getVersion() {
        String queryVersion = "SELECT BANNER FROM v$version";
        SqlRowSet rowSet = jdbcTemplate.queryForRowSet(queryVersion);
        if (rowSet.next()) {
            return new Database(rowSet.getString("BANNER"));
        }
        return new Database("");
    }
}
