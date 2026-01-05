package mc.kessud.dashboard.lifecycle;

import java.util.logging.Logger;

public final class ShutdownHook extends Thread {

    private final Logger logger;

    public ShutdownHook(Logger logger) {
        this.logger = logger;
    }

    @Override
    public void run() {
        logger.info("JVM shutdown hook triggered");
    }
}
