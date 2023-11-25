package News;

public class Main {
    public static void main(String[] args) {
        News news = new News();

        news.setTitle("Breaking News");
        news.setPublishDate("2023-11-25");
        news.setAuthor("Minzy");
        news.setContent("This is a breaking news article.");

        news.InputRate();

        news.Display();
    }
}
