
public class LinearSearch2 {
    public static int linearSearch(String menu[], String key) {
        for (int i = 0; i <= menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        final String menu[] = { "dosa", "piza", "samosa", "sandwitch", "momos", "panipuri" };
        String key = "samosa";
        int index = linearSearch(menu, key);
        if (index == -1) {
            System.out.println("not found");
        } else {
            System.out.println("key at index: " + index);
        }
    }
}
