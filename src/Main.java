public class Main {
    public static void main(String[] args) throws Exception {
        File.writeIntoFile("test.txt", "Hello World, Hello ");

   File.appendIntoFile("test.txt", " Azerbaijan");

      FileReader.readFromFile("test.txt");

        String str = FileReader.readFromFile2("test.txt");
        System.out.println(str);



    }
}
