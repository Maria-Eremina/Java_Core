public class PhoneBook_2 {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Федосова", "+78965120956");
        phoneBook.add("Бреславец", "+71234560789");
        phoneBook.add("Крутов","+74908756341");
        phoneBook.add("Федосова","+76874530987");
        phoneBook.add("Виноградов","+78765125647");
        phoneBook.add("Ниц","+78909807601");
        phoneBook.add("Северцева","+70092133210");
        phoneBook.add("Бреславец", "+71234560789");

        System.out.println(phoneBook.get("Бреславец"));
        System.out.println(phoneBook.get("Северцева"));
        System.out.println(phoneBook.get("Федосова"));
    }
}
