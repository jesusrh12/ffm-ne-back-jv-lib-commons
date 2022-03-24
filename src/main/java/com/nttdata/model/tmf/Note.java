package com.nttdata.model.tmf;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonTypeName;

import lombok.Data;

/**
 * Extra information about a given entity
 */
@JsonTypeName("Note")
@Data
public class Note {

    private Long id;
    private String author;
    private Date date;
    private String text;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Note {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
