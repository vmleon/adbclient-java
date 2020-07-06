package page.cdmteam.adbclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @Autowired
    DbMetadata db;

    @GetMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
    public Database get() {
        Database database = db.getVersion();
        return database;
    }
}
