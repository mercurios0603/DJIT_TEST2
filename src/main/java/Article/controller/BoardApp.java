package Article.controller;

import java.util.Scanner;
public class BoardApp {


        ArticleController articlecontroller = new ArticleController();

    public void start() {

        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.print("메뉴를 입력해주세요 : ");
            String func = scan.nextLine();

            if (func.equals("add")) {
                articlecontroller.add();

            } else if (func.equals("list")) {
                articlecontroller.list();

            } else if (func.equals("update")) {
                articlecontroller.update();

            } else if (func.equals("delete")) {
                articlecontroller.delete();

            } else if (func.equals("detail")) {
                articlecontroller.detail();

            } else if (func.equals("exit")) {
                System.out.println("프로그램이 종료되었습니다");
                break;
            }
         }
    }
}
