package com.kimz.validate.article;



import com.kimz.validate.error.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {

    @Autowired
    private ArticleRepository articleRepository;


    public Article getArticleById(long id) {
        return articleRepository.findById(id).orElseThrow(() -> new NotFoundException("Article does not exits"));
    }

    public Article save(Article article) {
        return this.articleRepository.save(article);
    }
}
