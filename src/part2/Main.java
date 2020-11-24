package part2;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.Put("Бондарев","9607641906");
        phoneBook.Put("Бондарев","2456928171");
        phoneBook.Put("Сидорова","1456928171");
        phoneBook.Put("Сидоров","34561598171");
        phoneBook.Put("Сидоров","88002000600");
        phoneBook.Put("Сидоров","34561598171");// проверка добавления дубля

        System.out.println(phoneBook);
        System.out.println(phoneBook.GetByName("Бондарев"));
        System.out.println(phoneBook.GetByName("Смирнов"));// проверка получения несуществующей записи
        System.out.println(phoneBook.GetByNumber("88002000600"));
        System.out.println(phoneBook.GetByNumber("12345678910"));//проверка поиска по несуществующему номеру
    }
}
