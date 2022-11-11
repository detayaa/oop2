package transport;

import java.util.Objects;

public class Data {

    private static final String INVALID_LENGTH = "Длина может быть от 1 до 20";
    private static final String INVALID_SYMBOL = "Строка может содержать только латинские буквы, цифры и знак подчеркивания";
    private static final String PASSWORD_NOT_MATCH = "Пароль и подтверждение не совпадают";


    public static boolean check(String login, String password, String confirmPassword) {
        if (isLengthNotInRange(login, 1, 20)) {
            throw new WrongLoginException(INVALID_LENGTH);
        }
        if (isSymbolNotValid(login)) {
            throw new WrongLoginException(INVALID_SYMBOL);
        }
        if (isLengthNotInRange(password, 1, 20)) {
            throw new WrongPasswordException(INVALID_LENGTH);
        }
        if (isSymbolNotValid(password)) {
            throw new WrongPasswordException(INVALID_SYMBOL);
        }
        if (!Objects.equals(password, confirmPassword)) {
            throw new WrongPasswordException(PASSWORD_NOT_MATCH);
        }

        return true;
    }

    private static boolean isSymbolNotValid(String value) {
        if (value == null || value.isEmpty()) {
            return true;
        }
        for (char c : value.toCharArray()) {
            boolean symbolMatches = (c >= 'a' && c <= 'z')
                    || (c >= 'A' && c <= 'Z')
                    || (Character.isDigit(c))
                    || (c == '_');
            if (!symbolMatches) {
                return true;
            }
        }
        return false;
    }


    private static boolean isLengthNotInRange(String value, int min, int max) {
        if (value == null) {
            return true;
        }
        int length = value.length();
        return length < min || length > max;
        }

}

