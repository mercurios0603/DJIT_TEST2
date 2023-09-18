package Article.view;

import Article.model.Article;
import Article.model.ArticleDao;
import Article.view.ArticleView;

import java.util.ArrayList;
import java.util.Scanner;

public class ArticleView {

    public void viewlist(ArrayList<Article> articles) {
        System.out.println("==================");
        for (int i = 0; i < articles.size(); i++) {
            System.out.println("번호 : " + articles.get(i).getId());
            System.out.println("제목 : " + articles.get(i).getTitle());
            System.out.println("==================");
        }
    }

    public void viewdetail(Article article) {
        System.out.println("==================");
        System.out.println("번호 : " + article.getId());
        System.out.println("제목 : " + article.getTitle());
        System.out.println("내용 : " + article.getContent());
        System.out.println("==================");
    }
}
