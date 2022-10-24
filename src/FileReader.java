import java.io.*;

public class FileReader {
    public static void readFromFile(String fileName) throws Exception {

        java.io.FileReader fr = new java.io.FileReader(fileName);
        String line=null;

        BufferedReader br = new BufferedReader(fr);

        while ((line= br.readLine()) != null){
            System.out.println(line);


        }


        br.close();
  }

  public static String readFromFile2(String fileName) throws Exception{
      InputStream in = new FileInputStream(fileName);
      InputStreamReader r = new InputStreamReader(in);

      BufferedReader reader = new BufferedReader(r);

      String line=null;
      String result="";

      while ((line=reader.readLine()) !=null){
          result+= line + "\n";

      }
      return result;

  }

}
