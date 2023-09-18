package Article.model;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticleDao {

    ArrayList<Article> articles = new ArrayList<>();

    Scanner scan = new Scanner(System.in);

    public ArticleDao() {
        Article data1 = new Article(1, "test_title1", "test_content1");
        Article data2 = new Article(2, "test_title2", "test_content2");
        Article data3 = new Article(3, "test_title3", "test_content3");
        articles.add(data1);
        articles.add(data2);
        articles.add(data3);
    }


    public void add(int id, String title, String content) {
        Article article = new Article(id, title, content);
        articles.add(article);
    }

    public ArrayList<Article> list() {
        return articles;
    }

    public Article findById(int id) {

        Article target = null;

        for (int i = 0; i < articles.size(); i++) {
            Article findarticle = articles.get(i);
            if (id == articles.get(i).getId()) {
                target = findarticle;
            }
        }
        return target;
    }

    public void update(Article article) {

        if (article == null) {
            System.out.println("없는 게시물입니다.");
        } else {
            System.out.print("제목 : ");
            String modifytitle = scan.nextLine();
            System.out.print("내용 : ");
            String modifycontent = scan.nextLine();

            article.setTitle(modifytitle);
            article.setTitle(modifycontent);

            System.out.println(article.getId() + "번 게시물이 수정되었습니다.");
        }
    }

    public void delete(Article article) {

        if (article == null) {
            System.out.println("없는 게시물입니다.");
        } else {
            articles.remove(article);
            System.out.println(article.getId() + "번 게시물이 삭제되었습니다.");
        }
    }

}
