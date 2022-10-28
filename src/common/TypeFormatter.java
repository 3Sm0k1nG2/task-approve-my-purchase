package common;

import java.util.Map;

public final class TypeFormatter {
    private static enum CHAR_TYPE {
        SPACE, LOWERCASE_BOTTOM, LOWERCASE_TOP, UPPERCASE_BOTTOM, UPPERCASE_TOP
    }

    private TypeFormatter() { }

    private static Map<CHAR_TYPE, Character> CHAR_CODE = Map.of(
            CHAR_TYPE.SPACE,            ' ',
            CHAR_TYPE.LOWERCASE_BOTTOM, 'a',
            CHAR_TYPE.LOWERCASE_TOP,    'z',
            CHAR_TYPE.UPPERCASE_BOTTOM, 'A',
            CHAR_TYPE.UPPERCASE_TOP,    'Z'
    );

    /**
     * Returns enum.name() formatted to as follows:
     * first letter is in UPPERCASE;
     * all other letters are in lowercase;
     * all others symbols are regarded as a Space ( );
     * the letter after a Space is in UPPERCASE.
     *
     * e.g. VICE_PRESIDENT -> Vice President
     *
     * @param type  Enum contains 'name()' method,
     *              used to get the name of a type.
     * @return
     */
    public static String toFormattedName(Enum type){
        StringBuilder finalName = new StringBuilder();
        char[] name = type.name().toLowerCase().toCharArray();

        boolean isCapital = true;

        for (int i = 0; i < name.length; i++) {
            char c = name[i];

            if(
                c != CHAR_CODE.get(CHAR_TYPE.SPACE)
                    &&
                (
                    c < CHAR_CODE.get(CHAR_TYPE.LOWERCASE_BOTTOM)
                    || c > CHAR_CODE.get(CHAR_TYPE.LOWERCASE_TOP)
                )
                    &&
                (
                    c < CHAR_CODE.get(CHAR_TYPE.UPPERCASE_BOTTOM)
                    || c > CHAR_CODE.get(CHAR_TYPE.UPPERCASE_TOP)
                )
            )
            {
                finalName.append(CHAR_CODE.get(CHAR_TYPE.SPACE));
                isCapital = true;
                continue;
            }

            if(isCapital){
                finalName.append(Character.toUpperCase(c));
                isCapital = false;
                continue;
            }

            finalName.append(c);
        }

        return finalName.toString();
    }
}
