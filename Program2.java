import java.io.File;

public class Program2 {

    public static void main(String[] args) {
        File dir = new File("C:\\Users\\annad\\Desktop\\system_log\\Второй блок (Программирование)\\Java\\HomeTaskTwo");
        if (dir.isDirectory()) {

            for (File item : dir.listFiles()) {

                if (item.isDirectory()) {

                    System.out.println(item.getName() + "  \t folder");
                } else {

                    System.out.println(item.getName() + "\t file");
                }
            }
        }
    }
}