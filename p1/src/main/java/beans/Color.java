package beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "color", eager = true)
@SessionScoped
public class Color {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color() {
        this.name = "black";
    }

    public String changeColor(){
        return "user_page";
    }
}
