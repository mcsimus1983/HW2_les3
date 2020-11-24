package part2;

import java.util.*;

public class PhoneBook {

    private HashMap<String, TreeSet<String>> phoneBook;

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    public void Put(String name, String phone) {
        TreeSet<String> phoneByName = phoneBook.get(name);
        if (phoneByName == null) {
            TreeSet<String> number = new TreeSet<>();
            number.add(phone);
            phoneBook.put(name, number);
        } else {
            phoneByName.add(phone);
        }
    }

    @Override
    public String toString() {
        return "" + phoneBook;
    }

    public String GetByName(String name) {

        TreeSet<String> phoneByName = phoneBook.get(name);
        if (phoneByName == null) {
            return name + ": в телефонной книге не найден";
        } else {
            return name + " : " + phoneByName;
        }

    }

    public String GetByNumber(String number) {

        for (String s : phoneBook.keySet()) {
            for (String s1 : phoneBook.get(s)) {
                if (s1.equals(number)) {
                    return number + ": принадлежит {" + GetByName(s) + "}";
                }
            }
        }
        return number + ": номер не найден.";
    }
}
