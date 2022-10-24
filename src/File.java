import java.io.BufferedWriter;
import java.io.FileWriter;

public class File {
    //	public static void writeIntoFile(String fileName, String text) throws Exception {
//
//	try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));){
//		bw.write(text);
//		}
//	}
//
//		public static void appendIntoFile(String fileName, String text) throws Exception {
//
//			try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));){
//		bw.write(text);
//		}


    //************************************************************************************************
    //Ve yaaaaa

    private static void writeIntoFile(String fileName, String text, boolean append) throws Exception {

        try(BufferedWriter bw = new BufferedWriter(new FileWriter(fileName,append));){
            bw.write(text);
        }
    }

    public static void writeIntoFile(String fileName,String text)throws Exception{

        File.writeIntoFile(fileName, text, false);
    }

    public static void appendIntoFile(String fileName,String text)throws Exception{

        File.writeIntoFile(fileName, text, true);
    }


    //********************************************READER***************************************
}
