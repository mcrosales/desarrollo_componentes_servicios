package beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "headline", eager = true)
@SessionScoped
public class Headline {

    private Integer id;
    private String image;
    private String description;
    private String url;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Headline(Integer id, String image, String description, String url) {
        this.id = id;
        this.image = image;
        this.description = description;
        this.url = url;
    }

    public Headline() {
    }
}
