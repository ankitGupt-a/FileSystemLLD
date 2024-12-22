public class Main {
    public static void main(String[] args) {

        Directory root = new Directory("root");
        Directory home = new Directory("home");
        Directory user = new Directory("user");
        File file1 = new File("File1.txt", 100);
        File file2 = new File("File2.txt", 100);

        root.add(home);
        home.add(user);
        user.add(file1);
        user.add(file2);

        System.out.println("Printing root");
        root.ls();

        user.remove(file2);

        System.out.println("Printing user");
        user.ls();

        home.remove(user);

        System.out.println("Printing root");
        root.ls();
    }
}