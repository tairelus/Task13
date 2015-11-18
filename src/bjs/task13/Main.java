package bjs.task13;

public class Main {

    public static void main(String[] args) {
	// write your code here

        FileManager fileManager = new FileManager();

        fileManager.createOutputFile("first.txt");
        fileManager.writeOutputFile("This the content of the first.txt");
        fileManager.closeFileManager();

        fileManager.createInputFile("first.txt");
        fileManager.copyInputFile("second.txt");
        fileManager.closeFileManager();
    }
}
