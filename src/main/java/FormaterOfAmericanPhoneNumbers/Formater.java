package FormaterOfAmericanPhoneNumbers;

public class Formater
{
    /**
     * @param phoneNumber a sequence of characters representing the telephone number.
     *                    <ul>
     *                    It was assumed that:
     *                    <li>string consists only digits(0-9), spaces or/and dashes "-"</li>
     *                    <li>maximal length of string is 100</li>
     *                    <li>minimal length of string is 2</li>
     *                    </ul>
     * @return Phone number with US formatting.
     */
    public String format(String phoneNumber)
    {
        String pureNumber = phoneNumber.replace(" ", "");
        pureNumber = pureNumber.replace("-", "");
        String formated = pureNumber;

        int previousLength;
        do
        {
            previousLength = formated.length();
            formated = insertSeparator(formated);
        } while (formated.length() != previousLength);

        return formated;
    }

    private String insertSeparator(String phone)
    {
        int index = phone.lastIndexOf("-") + 1;
        index = Math.max(index, 0);

        int remainingPartLength = phone.length() - index;

        if (remainingPartLength <= 3)
            return phone;

        if ((remainingPartLength % 3 == 0) || (remainingPartLength >= 7))
        {
            phone = insert(phone, index + 3, "-");
        } else if (remainingPartLength == 5)
        {
            phone = insert(phone, index + 3, "-");
        } else if (remainingPartLength == 4)
        {
            phone = insert(phone, index + 2, "-");
        }
        return phone;
    }

    private String insert(String text, int index, String subtext)
    {
        return text.substring(0, index) + subtext + text.substring(index);
    }
}
