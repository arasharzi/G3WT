import java.util.ArrayList;

public class Movie
{
    private String title;
    private String studio;
    private String rating;

    public Movie(String title, String studio, String rating)
    {
        this.title = title;
        this.studio = studio;
        this.rating = rating;
    }

    public Movie(String title, String studio)
    {
        this.title = title;
        this.studio = studio;
        this.rating = "PG";
    }

    public Movie[] getPG(Movie movie[])
    {
        ArrayList<Movie> list = new ArrayList<>();
        for (Movie m : movie)
        {
            if (m.rating.equals("PG"))
            {
                list.add(m);
            }
        }
        return list.toArray(new Movie[0]);
    }
}
