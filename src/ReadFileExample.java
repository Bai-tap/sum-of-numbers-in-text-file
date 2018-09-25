import java.io.*;
import java.util.Scanner;

public class ReadFileExample {
    public void readFileText(String filePath) {
        try {
            //đọc file theo đường dẫn
            File file = new File(filePath);

            //kiểm tra file có tồn tại không, nếu không ném ra exception
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            //đọc từng dòng của file và tiến hành cộng tổng
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();

            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("Fie không tồn tại or nội dung có lỗi!");
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
