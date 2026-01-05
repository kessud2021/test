package mc.kessud.dashboard.config;

public final class DashboardConfig {

    private final String dashboardUrl;

    public DashboardConfig(String dashboardUrl) {
        this.dashboardUrl = dashboardUrl;
    }

    public String dashboardUrl() {
        return dashboardUrl;
    }
}
