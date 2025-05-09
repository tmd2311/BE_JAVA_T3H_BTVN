package vn.com.t3h.model;

public class Product {
  private int id;
  private String name;
  private String description;
  private String category;
  private String author;
  private String publisher;
  private int publishYear;
  private int pages;
  private double price;
  private int quantity;
  private String imagePath;

  public Product(int id, String name, String description, String category, String author,
      String publisher, int publishYear, int pages, double price, int quantity, String imagePath) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.category = category;
    this.author = author;
    this.publisher = publisher;
    this.publishYear = publishYear;
    this.pages = pages;
    this.price = price;
    this.quantity = quantity;
    this.imagePath = imagePath;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public int getPublishYear() {
    return publishYear;
  }

  public void setPublishYear(int publishYear) {
    this.publishYear = publishYear;
  }

  public int getPages() {
    return pages;
  }

  public void setPages(int pages) {
    this.pages = pages;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

  public String getImagePath() {
    return imagePath;
  }

  public void setImagePath(String imagePath) {
    this.imagePath = imagePath;
  }
}
