package page.cdmteam.adbclient;

public class Database {
    private String banner;

    public Database(String banner) {
        this.banner = banner;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    @Override
    public String toString() {
        return String.format("Banner: %s", banner);
    }
}
