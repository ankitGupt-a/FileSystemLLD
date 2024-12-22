import java.util.ArrayList;
import java.util.HashMap;

public class Directory extends FileSystem {
    private final HashMap<String, FileSystem> directoryContents;

    public Directory(final String name) {
        super(name);
        directoryContents = new HashMap<>();
    }

    public int getSize() {

        return directoryContents.values().stream()
                .mapToInt(FileSystem::getSize).sum();
    }

    public void ls() {
        System.out.println(getName());
        directoryContents.values().forEach(FileSystem::ls);
    }

    public void add(FileSystem content) {

        if (directoryContents.containsKey(content.getName())) {
            throw new IllegalArgumentException("Name already exist in the directory");
        }
        directoryContents.put(content.getName(), content);
    }

    public void remove(FileSystem content) {

        if (directoryContents.containsKey(content.getName())) {
            directoryContents.remove(content.getName());
            return;
        }

        throw new IllegalArgumentException("File or directory doesn't exist");
    }
}
