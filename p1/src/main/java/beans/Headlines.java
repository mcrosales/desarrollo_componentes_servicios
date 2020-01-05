package beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "headlines", eager = true)
@SessionScoped
public class Headlines {

    private List<Headline> headlines;

    private Integer currentHeadline;

    private Headline headline;

    private final Integer ITEMS_SIZE = 4;

    public Headline getHeadline() {
        return headline;
    }

    public void setHeadline(Headline headline) {
        this.headline = headline;
    }

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
        headlines = new ArrayList<Headline>(ITEMS_SIZE);

        Headline firstHeadLine = new Headline(1, "/resources/img/lives.jpg",
                "Our Lives, Under Construction",
                "https://www.nytimes.com/2020/01/02/style/scaffolding-new-york-city.html?action=click&module=MoreIn&pgtype=Article&region=Footer");
        headlines.add(firstHeadLine);

        Headline secondHeadLine = new Headline(2, "/resources/img/fire.jpg",
                "Strong winds hamper efforts to control flames",
                "https://www.bbc.com/news/world-australia-50992323");
        headlines.add(secondHeadLine);

        Headline thirdHeadLine = new Headline(3, "/resources/img/robots.jpg",
                "The 8 Things We Expect to See at CES 2020",
                "https://www.wired.com/story/ces-2020-preview/");
        headlines.add(thirdHeadLine);

        Headline fourthHeadLine = new Headline(4, "/resources/img/protest.jpg",
                "Protesters Across US Rally Against A War With Iran",
                "https://www.huffpost.com/entry/no-war-iran-protest-rally_n_5e11374ec5b6b5a713bb319a");
        headlines.add(fourthHeadLine);

        headline = firstHeadLine;
        currentHeadline = 0;
    }

    public String previousHeadline() {
        currentHeadline = currentHeadline - 1;
        if (currentHeadline < 0) {
            currentHeadline = ITEMS_SIZE - 1;
        }
        headline = headlines.get(currentHeadline);
        return "user_page";
    }

    public String nextHeadline() {
        currentHeadline = currentHeadline + 1;
        if (currentHeadline >= ITEMS_SIZE) {
            currentHeadline = 0;
        }
        headline = headlines.get(currentHeadline);
        return "user_page";
    }
}
