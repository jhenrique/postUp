package com.pensamentos.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id;

    @ManyToOne(targetEntity=User.class, fetch=FetchType.EAGER)
    private User editor;

    private String text;

    @OneToMany(targetEntity=User.class, mappedBy="id", fetch=FetchType.EAGER)
    private List<User> upVotes;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public User getEditor() {
        return editor;
    }

    public void setEditor(User editor) {
        this.editor = editor;
    }

    public List<User> getUpVotes() {
        return upVotes;
    }

    public void setUpVotes(List<User> upVotes) {
        this.upVotes = upVotes;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
