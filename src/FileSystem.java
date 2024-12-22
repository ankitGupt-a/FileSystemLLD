
public abstract class FileSystem {
    private final String name;
    public FileSystem(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    void add(final FileSystem fileSystem) {
        throw new UnsupportedOperationException("This is not a directory");
    }

    void remove(final FileSystem fileSystem) {
        throw new UnsupportedOperationException("This is not a directory");
    }

    public abstract int getSize();

    public abstract void ls();
}
