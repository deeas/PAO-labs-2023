package pao.laborator3.mostenire;

// Composition and aggregation are 2 forms of association - relationship between 2 classes.
// Composition: restricted form of Aggregation where two entities are highly dependent on each other
// -> the composed object cannot exist without the other entity
public class ObjectCommunication2 {
    public static void main(String[] args) {
        Sale sale = new Sale(2);
        sale.addArticles("mouse");
        sale.addArticles("keyboard");
        sale.addArticles("flowers");
    }
}

class Sale {
    private Article[] articles;
    private int noOfArticles;
    private int currentNumber;

    public Sale(int noOfArticles) {
        this.articles = new Article[noOfArticles];
        this.noOfArticles = noOfArticles;
    }

    public int getCurrentNumber() {
        return currentNumber;
    }

    public void setCurrentNumber(int currentNumber) {
        this.currentNumber = currentNumber;
    }

    public void addArticles(String name) {
        if (currentNumber < noOfArticles) {
            this.articles[currentNumber++] = new Article(name);
        } else {
            System.out.println("Capacity is reached.");
        }
    }
}

class Article {
    private String name;

    public Article(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}