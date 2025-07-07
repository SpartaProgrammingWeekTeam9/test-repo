//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("이름을 입력하세요: ");
        String name=scanner.nextLine();
        System.out.print("나이를 입력하세요: ");
        int age = scanner.nextInt();
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}