
package main.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Booklet implements BibTexEntry, Serializable{
    private String title;
    @Id
    private String id;
    private String tag;

    public Booklet(){
    }
    
    public Booklet(String id, String title){
        this.id = id;
        this.title = title;

    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
    
    public String getTag(){
        return tag;
    }
    
    public void setTag(String tag){
        this.tag = tag;
    }

    @Override
    public String toBibTex() {
        return "@BOOKLET{" + id
                + ", title={" + title + "}"
                + "}";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
