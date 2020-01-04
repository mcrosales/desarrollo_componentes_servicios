package beans;


import sun.plugin.javascript.navig.LinkArray;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "headlines", eager = true)
@SessionScoped
public class Headlines {

    private List<Headline> headlines;

    private Integer currentHeadline;

    public Integer getCurrentHeadline() {
        return currentHeadline;
    }

    public void setCurrentHeadline(Integer currentHeadline) {
        this.currentHeadline = currentHeadline;
    }

    public List<Headline> getHeadlines() {
        return headlines;
    }

    public void setHeadlines(List<Headline> headlines) {
        this.headlines = headlines;
    }

    public Headlines() {
        headlines = new ArrayList<Headline>(3);

        Headline firstHeadLine = new Headline(1, "resources/lives.jpg",
                "Our Lives, Under Construction",
                "https://www.nytimes.com/2020/01/02/style/scaffolding-new-york-city.html?action=click&module=MoreIn&pgtype=Article&region=Footer");

        headlines.add(firstHeadLine);

        Headline secondHeadLine = new Headline(2, "resources/fire.jpg",
                "Strong winds hamper efforts to control flames",
                "https://www.bbc.com/news/world-australia-50992323");

        headlines.add(secondHeadLine);

    }
}
