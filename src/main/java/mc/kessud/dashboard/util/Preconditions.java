package mc.kessud.dashboard.util;

public final class Preconditions {

    public static void notNull(Object value, String message) {
        if (value == null) {
            throw new IllegalStateException(message);
        }
    }

    private Preconditions() {}
}
