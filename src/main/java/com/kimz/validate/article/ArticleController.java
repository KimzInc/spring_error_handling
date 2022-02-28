package com.kimz.validate.article;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping("/articles/{id}")
    public Article getArticle(@PathVariable long id) {

        return this.articleService.getArticleById(id);

    }

    @PostMapping("/articles")
    public Article save(@Valid @RequestBody Article article){
        return this.articleService.save(article);
    }

}
