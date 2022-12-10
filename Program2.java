
import java.io.IOException;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;
public class Program2 {
    public static void main(String[] args) throws IOException {
        Path directories_info = Paths.get("list.txt");
        if (!Files.exists(directories_info)) {
            Files.createFile(directories_info);
        }
        Path file = Paths.get("");
        List<String> str = new ArrayList<>();
        List<Path> Directories = Files.list(file).collect(Collectors.toList());
        int size = Directories.size();
        for (int i = 0; i < size; i++) {
            Path p = Directories.get(i);
            str.add(p.toString());
        }
        try{
            Files.write(directories_info,str);}
        catch(IOException e) {
        }

    }

}
