package comserenitydojo;

public class Cat{

private String  name ;
private String favoriteToy;
private int age ;

public Cat(String name, String favoriteToy, int age){
  this.name = name;
  this.favoriteToy = favoriteToy;
  this.age = age;
}
  
  public String getName(){  
       return name;
  }
  
  public String getFavoriteToy(){
        return favoriteToy;
  }
  
    public String getAge(){
        return age;
  }


}
