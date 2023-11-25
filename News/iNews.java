package News;

import java.util.Scanner;

interface iNews {
    void Display();
}

class News implements iNews {
    private int ID;
    private String Title;
    private String PublishDate;
    private String Author;
    private String Content;
    private float AverageRate;
    private int[] RateList = new int[3];

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return this.ID;
    }

    public void setTitle(String title) {
        this.Title = title;
    }

    public String getTitle() {
        return this.Title;
    }

    public void setPublishDate(String publishDate) {
        this.PublishDate = publishDate;
    }


    public String getPublishDate() {
        return PublishDate;
    }

    public void setAuthor(String author) {
        this.Author = author;
    }

    public String getAuthor() {
        return Author;
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public String getContent() {
        return Content;
    }

    public void setAverageRate(float averageRate) {
        this.AverageRate = averageRate;
    }

    public void Display() {
        System.out.println("Title: " + Title);
        System.out.println("PublishDate: " + PublishDate);
        System.out.println("Author: " + Author);
        System.out.println("Content: " + Content);
        System.out.println("AverageRate: " + AverageRate);
    }

    public void Calculate() {
        float sum = 0;
        for (int rate : RateList) {
            sum += rate;
        }
        if (RateList.length > 0) {
            AverageRate = sum / RateList.length;
        }
    }

    public void InputRate() {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < RateList.length; i++) {
            System.out.print("Enter rating for News (1-3): ");
            RateList[i] = scanner.nextInt();
        }

        Calculate();
    }

}



