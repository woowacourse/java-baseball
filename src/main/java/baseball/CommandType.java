package baseball;

public enum CommandType {
    RESTART("1"), EXIT("2");

    private String value;

    CommandType(String value) {
        this.value = value;
    }

    private String getValue() {
        return value;
    }

    public static CommandType convert(String playerInput) {
        if (!checkValidation(playerInput)) {
            throw new IllegalArgumentException();
        }

        for (CommandType commandType : CommandType.values()) {
            if (commandType.getValue().equals(playerInput)) {
                return commandType;
            }
        }

        return CommandType.EXIT;
    }

    private static boolean checkValidation(String playerInput) {
        for (CommandType commandType : CommandType.values()) {
            if (commandType.getValue().equals(playerInput)) {
                return true;
            }
        }
        return false;
    }
}
