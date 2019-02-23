public class PhoneNumberReformater
{
    public static void main(String[] args) throws Exception
    {
        if (!reformat("1234567890").equals("123-456-78-90"))
        {
            System.out.println("!!!ERROR!!!");
        }

        if (!reformat("12345678").equals("123-456-78"))
        {
            System.out.println("!!!ERROR!!!");
        }

        if (!reformat("123456789").equals("123-456-789"))
        {
            System.out.println("!!!ERROR!!!");
        }

        if (!reformat("123456").equals("123-456"))
        {
            System.out.println("!!!ERROR!!!");
        }

        if (!reformat("1").equals("1"))
        {
            System.out.println("!!!ERROR!!!");
        }

        if (!reformat("12").equals("12"))
        {
            System.out.println("!!!ERROR!!!");
        }

        if (!reformat("123").equals("123"))
        {
            System.out.println("!!!ERROR!!!");
        }

        if (!reformat("1234").equals("12-34"))
        {
            System.out.println("!!!ERROR!!!");
        }

        if (!reformat("1234567").equals("123-45-67"))
        {
            System.out.println("!!!ERROR!!!");
        }
        if (!reformat("-2").equals("2"))
        {
            System.out.println("!!!ERROR!!!");
        }
        if (!reformat("  ").equals(""))
        {
            System.out.println("!!!ERROR!!!");
        }
        if (!reformat("--").equals(""))
        {
            System.out.println("!!!ERROR!!!");
        }
        if (!reformat(" -").equals(""))
        {
            System.out.println("!!!ERROR!!!");
        }
    }

    public static String reformat(String phoneNumber) throws Exception
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

        System.out.println(phoneNumber + " " + formated);
        return formated;
    }

    static String insertSeparator(String phone) throws Exception
    {
        int index = phone.lastIndexOf("-") + 1;
        if (index < 0)
            index = 0;
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

    private static String insert(String text, int index, String subtext)
    {
        return text.substring(0, index) + subtext + text.substring(index);
    }
}
