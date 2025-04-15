public class Production {
  private Integer id;
  private String name;
  private String description;
  private Float price;
  private Integer total;

  public Production(Integer id, String name, String description, Float price, Integer total) {
    this.id = id;
    this.name = name;
    this.description = description;
    this.price = price;
    this.total = total;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
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

  public Float getPrice() {
    return price;
  }

  public void setPrice(Float price) {
    this.price = price;
  }

  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public String toString() {
    return "Production{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", description='" + description + '\'' +
        ", price=" + price +
        ", total=" + total +
        '}';
  }
}
