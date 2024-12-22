public class File extends FileSystem{
    private final int size;

    public File(final String name, final int size) {
        super(name);
        this.size = size;
    }

    public int getSize() {
        return size;
    }
    public void ls() {
        System.out.println(this.getName());
    }
}
