package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
//폼 데이터를 받을 그릇
public class ArticleForm {
    private Long id;
    private String title;
    private String content;
    //lombok으로 대체
    /*public ArticleForm(String title, String content) {
        this.title = title;
        this.content = content;
    }

    @Override
    public String toString() {
        return "ArticleForm{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
*/
    public Article toEntity() {
        return new Article(id, title, content);
    }
}
