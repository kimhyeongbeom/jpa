package leo.spring.mvn;

import leo.spring.mvn.factory.CEntityManagerFactory;
import leo.spring.mvn.service.ValueService;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Hello world!
 *
 */
public class App 
{

    public static void main(String[] args) throws IOException {

        CEntityManagerFactory.initialization();
        ValueService valueService = new ValueService();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            System.out.println("Input your Command // [command] [name]");
            String commandLine = br.readLine();
            String[] splitCommand = commandLine.split(" ");

            // 별도 값 검증하는 로직은 추가하지 않음
            if (splitCommand[0].equalsIgnoreCase("exit")) {
                System.out.println("System closed");
                break;

            } else if (splitCommand[0].equalsIgnoreCase("originalProvider")) {

                valueService.insertOriginalProvider();

            } else if (splitCommand[0].equalsIgnoreCase("provider")) {

                valueService.insertProvider();

            }
        }
    }
}
