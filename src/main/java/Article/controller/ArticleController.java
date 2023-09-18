package Article.controller;

import Article.model.Article;
import Article.model.ArticleDao;
import Article.view.ArticleView;

import java.util.ArrayList;
import java.util.Scanner;
public class ArticleController {

    Scanner scan = new Scanner(System.in);

    ArticleDao articledao = new ArticleDao();

    ArticleView articleview = new ArticleView();

    int listid = 4;


    public void add() {

        System.out.print("게시물 제목을 입력해주세요 : ");
        String title = scan.nextLine();
        System.out.print("게시물 내용을 입력해주세요 : ");
        String content = scan.nextLine();
        articledao.add(listid, title, content);
        System.out.println("게시물이 등록되었습니다");

        listid++;
    }

    public void list() {
        ArrayList<Article> articlelist = articledao.list();
        articleview.viewlist(articlelist);
    }

    public void update() {
        System.out.print("수정할 게시물 번호 : ");
        int contentid = getParamInt(scan.nextLine(), -1);

        Article updatearticle = articledao.findById(contentid);
        articledao.update(updatearticle);
    }

    public void delete() {
        System.out.print("삭제할 게시물 번호 : ");
        int contentid = getParamInt(scan.nextLine(), -1);

        Article deletearticle = articledao.findById(contentid);
        articledao.delete(deletearticle);
    }

    public void detail() {
        System.out.print("상세보기 할 게시물 번호를 입력해주세요 : ");
        int contentid = getParamInt(scan.nextLine(), -1);
        Article detailarticle = articledao.findById(contentid);

        if (detailarticle == null) {
            System.out.println("없는 게시물 번호입니다.");
        } else {
            articleview.viewdetail(detailarticle);
        }
    }


    public int getParamInt(String inputvalue, int defaultvalue) {

        try {
            int number = Integer.parseInt(inputvalue);
            return number;
        } catch (NumberFormatException e) {
            System.out.println("숫자만 입력 가능합니다.");
        }
        return defaultvalue;
    }
}
