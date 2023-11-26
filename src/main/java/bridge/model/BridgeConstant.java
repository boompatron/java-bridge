package bridge.model;

public enum BridgeConstant {

    MIN_BRIDGE_SIZE(3),
    MAX_BRIDGE_SIZE(20),
    ;

    private final int value;

    BridgeConstant(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
